package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MatrialPage extends PageBase
{
    public MatrialPage(WebDriver driver)
    {
        super(driver);
    }
    public WebElement courseButton=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/div/div[1]/div/div[2]/div[2]/a/span/span"));


    public void userCanGoToCoursePage ()
    {
        clickButton(courseButton);
    }

}
