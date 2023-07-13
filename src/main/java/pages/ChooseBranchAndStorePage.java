package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChooseBranchAndStorePage extends PageBase
{
    public ChooseBranchAndStorePage(WebDriver driver)
    {
        super(driver);
    }
   // public WebElement searchTxt=driver.findElement(By.cssSelector("input[type='search']"));
    WebElement branchButton=driver.findElement(By.name("chooseBranch1"));
    public void userChooseBranch() throws InterruptedException
    {
        Action(branchButton);
    }
    WebElement storeButton=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/div/div/div[2]/div[3]/div/div[2]/div/button[2]"));
    public void userChooseStore() throws InterruptedException
    {

        Action(storeButton);
    }

}
