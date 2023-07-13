package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class TestBase
{

    public static WebDriver driver;
    public SoftAssert Assertobj=new SoftAssert();
    @BeforeTest
    public void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/");
    }
   @AfterSuite
    public void closeDriver()
    {
        driver.quit();
    }
}
