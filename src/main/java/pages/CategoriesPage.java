package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoriesPage extends PageBase
{
    public CategoriesPage(WebDriver driver)
    {
        super(driver);
    }
    WebElement categorybutton= driver.findElement(By.className("tutor150"));

    public void userCanSelectCategory()
    {
        clickButton(categorybutton);
    }

}

