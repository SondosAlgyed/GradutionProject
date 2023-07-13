package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase
{
    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    WebElement loginButton= driver.findElement(By.cssSelector("button.btn.btn.ms-3.login.d-md-inline-block.d-none"));
    public void userLogin()
    {
        clickButton(loginButton);
    }

    WebElement registerButton = driver.findElement(By.cssSelector("button[class='btn btn sign d-md-inline-block d-none']"));

    public void userRegistration()
    {
        clickButton(registerButton);

    }
}
