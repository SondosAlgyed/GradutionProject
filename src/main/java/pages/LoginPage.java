package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static staticData.StaticData.*;

public class LoginPage extends PageBase
{

   public LoginPage(WebDriver driver)
   {
       super(driver);
   }


   WebElement emailTxt= driver.findElement(By.cssSelector("input[type='text']"));
   WebElement passwordTxt= driver.findElement(By.cssSelector("input[type='password']"));
   WebElement loginbutton= driver.findElement(By.cssSelector("button[class='btn']"));


    public void userLoginSuccess()
    {
        sendText(emailTxt,Lemail);
        sendText(passwordTxt,password);
        clickButton(loginbutton);
    }








}
