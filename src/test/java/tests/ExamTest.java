package tests;

import org.testng.annotations.Test;
import pages.*;

public class ExamTest extends TestBase
{
    LoginPage login;
    HomePage home;
    ChooseLoginPage ChooseLogin;
    ChooseBranchAndStorePage Choosebranch;
    ClassPage classp;
    BranchPage branch;
    SideParPage header;
    MatrialPage matrial;
    CoursePage course;
 /* @Test(priority = 0)
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

    }
    @Test(priority = 2)
    public void userChooseBranchSuccessfully() throws InterruptedException
    {
        driver.navigate().to("http://localhost:8080/Website/chooseBranch");
        Thread.sleep(3000);
        Choosebranch=new ChooseBranchAndStorePage(driver);
        Choosebranch.userChooseBranch();
        Assertobj.assertEquals(driver.getCurrentUrl(),"http://localhost:8080/branch");
        Assertobj.assertAll();
    }
    @Test(priority = 3)
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

    }*/
    @Test(priority = 4)
    public void userCanGoTOExamPageSuccessfully() throws InterruptedException
    {
        Thread.sleep(3000);
        header=new SideParPage(driver);
        header.userGoToHisGroups();
        Thread.sleep(4000);
        matrial=new MatrialPage(driver);
        Assertobj.assertTrue(matrial.courseButton.isDisplayed());
        matrial.userCanGoToCoursePage();
        Thread.sleep(5000);
        course=new CoursePage(driver);
        Assertobj.assertTrue(course.ExamButton.isDisplayed());
        course.userCanGotoExamPage();
        Assertobj.assertAll();

    }
    @Test(priority =5)
    public void userCanExamSuccessfully() throws InterruptedException
    {
        Thread.sleep(6000);
        course.userCanGotoExamPage();
        course.userCanExam();
        Thread.sleep(4000);
    }

}
