package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "email")
    WebElement txtEmail;

    @FindBy(id = "password")
    WebElement txtPassword;


    @FindBy(linkText = "Reset it here")
    public WebElement resetLink;

    @FindBy(className = "MuiButton-containedPrimary")
    private WebElement loginButton;


    public void dologin(String email, String password)
    {
        txtEmail.sendKeys(email);
        txtPassword.sendKeys(password);
        loginButton.click();
    }

    public void clearCreds()
    {
        txtEmail.sendKeys(Keys.CONTROL,"a");
        txtEmail.sendKeys(Keys.BACK_SPACE);
        txtPassword.sendKeys(Keys.CONTROL,"a");
        txtPassword.sendKeys(Keys.BACK_SPACE);
    }

    public LoginPage (WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }







}
