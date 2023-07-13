package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BranchPage extends PageBase
{
    public BranchPage(WebDriver driver)
    {
        super(driver);
    }

    WebElement courseButton = driver.findElement(By.className("prod_img"));
    public void userChooseCourse() throws InterruptedException
    {
        scrollToElement(courseButton);
        Action(courseButton);
    }


}
