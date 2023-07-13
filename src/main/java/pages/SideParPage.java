package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SideParPage extends PageBase
{
    public SideParPage(WebDriver driver)
    {
        super(driver);
    }
    public WebElement MyGroupsButton = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/aside/ul/a[5]/li/div/span"));
    public WebElement ExitButton = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/aside/ul/div/li/div/span"));
    public void userGoToHisGroups()
    {

        clickButton(MyGroupsButton);
    }
    public void userCanLogout()
    {

        clickButton(ExitButton);
    }
}
