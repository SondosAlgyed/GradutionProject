package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassPage extends PageBase
{
    public ClassPage(WebDriver driver)
    {
        super(driver);
    }
    WebElement submitButton = driver.findElement(By.cssSelector("button#Subscribedincource29.btn.btn-success"));
    public void userSubmitsInCourse() throws InterruptedException
    {
        scrollToElement(submitButton);
       clickButton(submitButton);
    }
    public WebElement ResultNotifaction = driver.findElement(By.xpath("/html/body/div[3]/div/div/p"));




}
