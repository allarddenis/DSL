# Contributors

- [@Denis Allard](https://github.com/allarddenis)
- [@Elie Gourdeau](https://github.com/wolfgrawl)

# Browser automation syntax

This document describes a syntax creating automated tests on web applications.

## ALL

*Action* : will execute the following action for all elements found that respects parameters

*Syntax* :

`all <action>` 

*Examples* :

- `all click input (attribute "type" "checkbox") (value "true")`

## VARIABLES

*Action* : save a data into a variable

*Syntax - set the variable value* : 

`<varname> = <readaction>`

*Syntax - read the variable value* : 

`var(<varname>)`

*Example* :

- `myvar = read link value (attribute name "Consulter le profil")` 
- `type var(myvar) (attribute "name" "username")`

## OPEN

*Action* : open a browser with an expected return value as bool

*Syntax* : 

`open <browsername> <return>`

*Examples* :

- `open firefox true`
- `open chrome false`

## BROWSE

*Action* : go to a website page

*Syntax* : 

`
browse <website-address>
`

*Examples* :

- `browse "https://www.google.com"`
- `browse "http://localhost:4200"`

## READ

*Action* : reads the attribute or value of an element

*Syntax* : 

`read <markup> <parameters>*`

*Example* :

- `read link value (attribute name "Consulter le profil")`

## CLICK

*Action* : perform a click action on given element

*Syntax* : 

`click <markup> <parameter>*`

*Examples* :

- `click link (value "Log in")`
- `click button (value "Cliquez ici ou sur le logo...")`
- `click input (attribute "type" "checkbox") (attribute "id" "warn")`

## TYPE

*Action* : fill the given element with given text

*Syntax* :

`type <text-to-type> <parameter>*`

*Examples* : 

- `type "mtisi08" (attribute "name" "username")`
- `type "I love DSL !" (attribute "type" "textbox") (attribute "name" "comment")`

## CHECK

*Action* : verify that an element respects a contraint

*Syntax* :

`check <constraint-type> <constraint> <parameter>*`

*Examples* :

- `check link contains "Massimo Tisi" (attribute name "Consulter le profil")`
- `check button enable false (value "Cliquez ici ou sur le logo...")`

# Code implentation

Let's try to implement the test series beneath using the designed syntax.

### TEST 0

```
TEST 0
* open a browser window (e.g., Firefox)
* go on “http://campus.mines-nantes.fr”
* click on the link “Log in”
* click on the button with text “Cliquez ici ou sur le logo C'zam pour vous identifier”
* fill the text field “username” with “mtisi08”
* fill the text field “password” with “12345”
* select the checkbox named “warn”
* click on the button with text “LOGIN”
* go to the url "https://campusneo.mines-nantes.fr/campus/"
* verify that the link “Consulter le profil” contains the string “Massimo Tisi”
 ```

``` 
TEST 0
open firefox true { 
    [ 
        browse “http://campus.mines-nantes.fr”,
        click link (value "Log in"),
        click button (value "Cliquez ici ou sur le logo C'zam pour vous identifier"),
        type "mtisi08" (attribute name "username"),
        type "12345" (attribute name "password"),
        click input (attribute "type" "checkbox") (attribute "id" "warn"),
        click button (value "LOGIN"),
        browse "https://campusneo.mines-nantes.fr/campus",
        check link contains "Massimo Tisi" (attribute name "Consulter le profil")
    ]
}
```

### TEST 1

```
TEST 1 
(result=TRUE)
* open a browser window
* go to the url "http://www.imt-atlantique.fr/fr"
* verify that the page contains a link "Toutes les actualités"
```
```
TEST 1
open firefox true {
    [
        browse "http://www.imt-atlantique.fr/fr",
        check link contains "Toutes les actualités"
    ]
}
```

### TEST 3

```
TEST 3
(result=TRUE)
* open a browser window
* go to the url "http://www.imt-atlantique.fr/fr"
* click on the link "Toutes les actualités"
* click on the image with alt property “Accueil”
* verify that the page contains a link "Toutes les actualités"
```

```
TEST 3
open firefox true {
    [
        browse "http://www.imt-atlantique.fr/fr",
        click "Toutes les actualités",
        click img (attribute "alt" "Acceuil"),
        check link contains "Toutes les actualités"
    ]
}
```

### TEST 4

```
TEST 4 
(result=TRUE)
* open a browser window
* go to the url "http://www.imt-atlantique.fr/fr/rechercher"
* insert "Donald Trump" in the search field
* click on the button "Appliquer les filtres"
* verify that the page contains the text "Aucun résultat ne correspond à votre recherche"
```

```
TEST 4
open firefox true {
    [
        browse "http://www.imt-atlantique.fr/fr/rechercher",
        type "Donald Trump" (attribute "id" "edit-search-api-fulltext") (attribute "name" "search_api_fulltext"),
        click button (value "Appliquer les filtres"),
        check div contains "Aucun résultat ne correspond à votre recherche"
    ]
}
```

### TEST 5

```
TEST 5
(result=TRUE)
* open a browser window
* go to the url "http://www.imt-atlantique.fr/fr/formation/trouver-ma-formation"
* uncheck all checkboxes
* check the checkboxes “Anglais”and “A domicile”
* click on the button "Appliquer les critères"
* verify that the page contains the text "Aucune formation trouvée répondant à vos critères
```

```
TEST 5
open firefox true {
    [
        browse "http://www.imt-atlantique.fr/fr/trouver-ma-formation",
        all click input (attribute "type" "checkbox") (value "true"),
        click input (attribute "type" "checkbox") (attribute "id" "warn")
        click button (value "Appliquer les critères"),
        check div contains "Aucun résultat ne correspond à votre recherche"
    ]
}
```

### TEST 7

```
TEST 7
(result=TRUE)
* open a browser window
* go to the url "http://www.imt-atlantique.fr/fr"
* read the text of one title (class="actu_home_ctner_inner_cell1_titre") in the page and the url it points
* go to the url "http://www.imt-atlantique.fr/fr/rechercher"
* paste the title in the search field
* click on the button "Appliquer les filtres"
* verify that the page contains a link to the previous url
```

```
TEST 7
open firefox true {
    [
        browse "http://www.imt-atlantique.fr/fr",
        title = read div (attribute "class" "actu_home_ctner_inner_cell1_titre"),
        browse "http://www.imt-atlantique.fr/fr/rechercher",
        type var(title) (attribute "id" "edit-search-api-fulltext"),
        click button (value "Appliquer les filtres"),
        check link contains "http://www.imt-atlantique.fr/fr"
    ]
}
```