package testrunner;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.LoginPage;
import setup.Setup;

import java.time.Duration;

public class ResetPasswordTestRunner extends Setup {


    @Test
    public void doReset()
    {
        LoginPage login =new LoginPage(driver);
        login.resetLink.click();

        WebElement email_input = driver.findElement(By.id(":r0:"));
        email_input.clear();
        email_input.sendKeys("diptyoffsBrown@gmail.com");
        WebElement send_button = driver.findElement(By.cssSelector(".MuiButton-root[type='submit']"));
        send_button.click();


        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiTypography-root.MuiTypography-body1.css-gjwoc1")));
        String actualConfirmation_message=driver.findElement(By.cssSelector("MuiTypography-root.MuiTypography-body1.css-gjwoc1")).getText();
        String expectedConfirmation_message= "Password reset link sent to your email";
        System.out.println(actualConfirmation_message);

        Assert.assertTrue(actualConfirmation_message.contains(expectedConfirmation_message));


    }

}