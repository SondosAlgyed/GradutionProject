package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.support.ui.Select;


public class PageBase
{
     WebDriver driver;
    public PageBase(WebDriver driver)
    {
        this.driver=driver;
    }

    public static void clickButton(WebElement button)
    {
        button.click();
    }
    public void sendText(WebElement text,String value)
    {
        text.sendKeys(value);
    }
    public void scrollToElement( WebElement element)
    {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void clearText(WebElement value)
    {
        value.clear();
    }
    public void select(WebElement element,int index)
    {
        Select select=new Select(element);
        select.selectByIndex(index);
    }

    /*for elements are not clickable
          Actions actions = new Actions(driver);
          actions.moveToElement(element).click().perform();
         actions.moveByOffset(element.getLocation().getX(), element.getLocation().getY()).click().perform();
     */
    public void Action(WebElement element) throws InterruptedException
    {

        Actions actions = new Actions(driver);
        try
        {
            actions.moveToElement(element).click().perform();
        }
        catch (MoveTargetOutOfBoundsException e)
        {
            Thread.sleep(2500);
            actions.moveToElement(element).click().perform();
        }
    }




}
