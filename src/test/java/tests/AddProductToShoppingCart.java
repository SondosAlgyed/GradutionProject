package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class AddProductToShoppingCart extends TestBase
{
    LoginPage login;
    HomePage home;
    ChooseLoginPage ChooseLogin;
    ChooseBranchAndStorePage chooseStore;
    CategoriesPage category;
    ProductsPage product;
   // SideParPage side;
 /*  @Test(priority = 0)
    public void userLoginSuccessfully() throws InterruptedException
    {
        Thread.sleep(2000);
        login=new LoginPage(driver);
        login.userLoginSuccess();
        Thread.sleep(5000);
        Assertobj.assertTrue(driver.getCurrentUrl().contains("profile"));
        Assertobj.assertAll();
    }*/
    @Test//(dependsOnMethods = {"userLoginSuccessfully"})
    public void userCanAddOroductToCartSuccessfully() throws InterruptedException
    {

        driver.navigate().to("http://localhost:8080/Website/chooseBranch");
        Thread.sleep(7000);
        chooseStore=new ChooseBranchAndStorePage(driver);
        chooseStore.userChooseStore();
        Thread.sleep(3000);
        category=new CategoriesPage(driver);
        category.userCanSelectCategory();
        Thread.sleep(2000);
        product=new ProductsPage(driver);
        product.userCanAddProductToCart();
        Thread.sleep(2500);
        Assertobj.assertTrue(product.resultMessage.isDisplayed());
        Assertobj.assertAll();
        //side=new SideParPage(driver);
        //side.userCanLogout();
    }



}
