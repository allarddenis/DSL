# Contributors

- [@Denis Allard](www.github.com/allarddenis)
- [@Elie Gourdeau](www.github.com/wolfgrawl)

# Browser automation syntax

This document describes a syntax creating automated tests on web applications.

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

- `type "mtisi08" (attribute name "username")`
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
open firefox true{ 
    [ 
        { browse “http://campus.mines-nantes.fr” },
        { click link (value "Log in") },
        { click button (value "Cliquez ici ou sur le logo C'zam pour vous identifier") },
        { type "mtisi08" (attribute name "username")  },
        { type "12345" (attribute name "password")  },
        { click input (attribute "type" "checkbox") (attribute "id" "warn") },
        { click button (value "LOGIN") },
        { browse "https://campusneo.mines-nantes.fr/campus" },
        { check link contains "Massimo Tisi" (attribute name "Consulter le profil")  }
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
        { browse "http://www.imt-atlantique.fr/fr"},
        { check link contains "Toutes les actualités" }
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
        { browse "http://www.imt-atlantique.fr/fr"},
        { click "Toutes les actualités"},
        { click img (attribute "alt" "Acceuil")},
        { check link contains "Toutes les actualités" }
    ]
}
```