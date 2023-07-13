package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static staticData.StaticData.*;


public class RegisterPage extends PageBase

{
    public RegisterPage(WebDriver driver)
    {
        super(driver);
    }

    WebElement FnameTxt= driver.findElement(By.name("f_name"));
    WebElement SnameTxt= driver.findElement(By.name("s_name"));
    WebElement LnameTxt= driver.findElement(By.name("l_name"));
    WebElement passwordTxt= driver.findElement(By.name("pass"));
    WebElement cpasswordTxt= driver.findElement(By.name("pass2"));
    WebElement phoneTxt= driver.findElement(By.name("phone"));
    WebElement gphoneTxt= driver.findElement(By.name("DadNumber"));
    WebElement emailTxt= driver.findElement(By.name("email"));
    WebElement registerButton= driver.findElement(By.className("button"));
    WebElement section= driver.findElement(By.name("section"));
    WebElement classroom= driver.findElement(By.name("class"));
    WebElement year= driver.findElement(By.name("year"));
    WebElement day= driver.findElement(By.name("day"));
    WebElement month= driver.findElement(By.name("month"));
    WebElement city= driver.findElement(By.name("governorate"));
    WebElement idphoto=driver.findElement(By.name("avatar"));

    public void userCanRegister() throws InterruptedException {
        sendText(FnameTxt,Fname);
        sendText(SnameTxt,Sname);
        sendText(LnameTxt,Lname);
        sendText(emailTxt,Remail);
        sendText(passwordTxt,password);
        sendText(cpasswordTxt,password);
        sendText(phoneTxt,mobile);
        sendText(gphoneTxt,gnumber);
        select(month,3);
        select(year,4);
        select(day,5);
        select(section,2);
        select(classroom,2);
        Thread.sleep(1500);
        select(city,3);
        sendText(idphoto,"D://Grad_Project//GradutionProject//Resources//Screenshot (483).png");
        clickButton(registerButton);

    }





}
