package tests;

import org.testng.annotations.Test;
import pages.*;

public class SubscriptionInCourse extends TestBase
{
    LoginPage login;
    HomePage home;
    ChooseLoginPage ChooseLogin;
    ChooseBranchAndStorePage Choosebranch;
    ClassPage classp;
    BranchPage branch;
   // SideParPage side;
  /*@Test(priority = 0)
    public void userLoginSuccessfully() throws InterruptedException
   {
      Thread.sleep(2000);
        login=new LoginPage(driver);
        login.userLoginSuccess();
        Thread.sleep(5000);
        Assertobj.assertTrue(driver.getCurrentUrl().contains("profile"));
        Assertobj.assertAll();

    }*/
    @Test(priority = 1)
    public void userChooseBranchSuccessfully() throws InterruptedException
    {
        driver.navigate().to("http://localhost:8080/Website/chooseBranch");
        Thread.sleep(3000);
        Choosebranch=new ChooseBranchAndStorePage(driver);
        Choosebranch.userChooseBranch();
        Assertobj.assertEquals(driver.getCurrentUrl(),"http://localhost:8080/branch");
        Assertobj.assertAll();
    }
   @Test(priority = 2)
    public void userSubscriptionInCourseSuccessfully() throws InterruptedException
   {
        Thread.sleep(3000);
        branch= new BranchPage(driver);
        branch.userChooseCourse();
        Assertobj.assertEquals(driver.getCurrentUrl(),"http://localhost:8080/website/course/1/classes");
        Thread.sleep(5000);
        classp=new ClassPage(driver);
        classp.userSubmitsInCourse();
        Thread.sleep(5000);
        Assertobj.assertTrue(classp.ResultNotifaction.isDisplayed());
        Assertobj.assertAll();
      // side=new SideParPage(driver);
      // side.userCanLogout();
   }
}
