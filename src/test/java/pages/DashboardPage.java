package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    @FindBy(className = "add-cost-button")
    public WebElement btnAdd;


    @FindBy(id = "itemName")
    public WebElement txtItem;

    @FindBy(css = "input[type='number']")
    public WebElement txtCost;

    @FindBy(id = "amount")
    public WebElement txtAmount;

    @FindBy(css = "button[type='submit']")
    public  WebElement btnSubmit;


    public void addItem(String item, String cost, String amount)
    {
        txtItem.sendKeys(item);
        txtCost.sendKeys(cost);
        txtAmount.sendKeys(amount);
        btnSubmit.click();
    }




    public DashboardPage (WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
}
