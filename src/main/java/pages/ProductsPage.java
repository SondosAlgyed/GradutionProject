package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends PageBase
{
    public ProductsPage(WebDriver driver)
    {
        super(driver);
    }

    WebElement Cartbutton= driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/div/div/div[2]/div/div/div[1]/div/div/div[2]/a"));
    public void userCanAddProductToCart()
    {
        clickButton(Cartbutton);
    }
    public WebElement resultMessage=driver.findElement(By.xpath("/html/body/div[3]/div/div/p"));

}
