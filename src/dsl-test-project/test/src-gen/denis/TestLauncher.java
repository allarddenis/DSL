    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.firefox.FirefoxDriver;
    import org.openqa.selenium.support.ui.ExpectedCondition;
    import org.openqa.selenium.support.ui.WebDriverWait;
    
public class TestApp {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() { 
			public void run() {
				WebDriver driver = new FireFoxDriver();
				
				driver.get("https://www.google.com");
			}
		});
	}
}
