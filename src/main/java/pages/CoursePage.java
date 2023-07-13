package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CoursePage extends PageBase
{
    public CoursePage(WebDriver driver)
    {
        super(driver);
    }

    public WebElement ExamButton=driver.findElement(By.id("exam-tab"));

    public void userCanGotoExamPage () throws InterruptedException
    {
        ExamButton.sendKeys(Keys.ENTER);
    }

    public WebElement openExamButton=driver.findElement(By.xpath("//*[@id=\"exam\"]/div/div[1]/div/div/div[2]/div/li[1]/div/div[1]/div/span/a"));

    public void userCanExam () throws InterruptedException
    {
        clickButton(openExamButton);
    }

}
