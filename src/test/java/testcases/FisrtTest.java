package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FisrtTest {
    @Test
    public void openBrowser(){
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\programming\\TestAutomationFramework/src/test/resources/executables/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://mvnrepository.com/");
        driver.manage().window().minimize();
        driver.close();
    }
}
