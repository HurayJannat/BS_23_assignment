package testrunner;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import setup.Setup;

import java.time.Duration;

public class DashboardTestRunner extends Setup {

    @BeforeTest
    public void doLogin(){
        LoginPage login = new LoginPage(driver);
        login.dologin("salman@test.com","1234");
       // login.dologin(System.getProperty("username"),System.getProperty("password"));
    }


    @Test(priority = 1, description = "add new Item")
    public void addItem() throws InterruptedException {
        DashboardPage dashBoard = new DashboardPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(dashBoard.btnAdd));
        dashBoard.btnAdd.click();
        dashBoard.addItem("item1","1200","12");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();







    }




}
