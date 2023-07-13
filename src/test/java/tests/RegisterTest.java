package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import pages.SideParPage;

public class RegisterTest extends TestBase
{
    HomePage home;
    RegisterPage register ;
    SideParPage side;
    //ChooseBranchAndStorePage branch;

    @Test
    public void userRegisterSuccessfully() throws InterruptedException
    {
        home=new HomePage(driver);
        home.userRegistration();
        Assertobj.assertTrue(driver.getCurrentUrl().equals("http://localhost:8080/signup"));
        register=new RegisterPage(driver);
        Thread.sleep(3000);
        register.userCanRegister();
       // branch=new ChooseBranchAndStorePage(driver);
        Thread.sleep(3000);
       // Assertobj.assertTrue(branch.searchTxt.isDisplayed());
        Assertobj.assertTrue(driver.getCurrentUrl().equals("http://localhost:8080/Website/chooseBranch"));
        Assertobj.assertAll();
        side=new SideParPage(driver);
        side.userCanLogout();
    }
    @AfterClass
    public void logout()
    {
        driver.close();
    }
}
