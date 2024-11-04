package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetPasswordPage {
    public ResetPasswordPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(linkText = "Reset it here")
    public WebElement resetPasswordLink;


    public void clickResetPasswordLink() {
        resetPasswordLink.click();
    }
}