package tests;

import org.testng.annotations.Test;
import pages.ChooseLoginPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SideParPage;

public class LoginTest extends TestBase
{
      LoginPage login;
      HomePage home;
      ChooseLoginPage ChooseLogin;
     // SideParPage side;
    @Test
    public void userLoginSuccessfully() throws InterruptedException
    {
        home=new HomePage(driver);
        home.userLogin();
        Assertobj.assertTrue(driver.getCurrentUrl().equals("http://localhost:8080/chooseLogin"));
        ChooseLogin=new ChooseLoginPage(driver);
        ChooseLogin.userCanChooseLogin();
        Assertobj.assertEquals(driver.getCurrentUrl(),"http://localhost:8080/login");
        login=new LoginPage(driver);
        login.userLoginSuccess();
        Thread.sleep(3000);
        Assertobj.assertTrue(driver.getCurrentUrl().contains("profile"));
        Assertobj.assertAll();
        //side=new SideParPage(driver);
        //side.userCanLogout();

    }

}
