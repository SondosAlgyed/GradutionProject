package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChooseLoginPage extends PageBase
{
    public ChooseLoginPage(WebDriver driver)
    {
        super(driver);
    }
    WebElement loginButtonStudent= driver.findElement(By.id("studentlogin"));
    public void userCanChooseLogin()
    {
        clickButton(loginButtonStudent);
    }
}
