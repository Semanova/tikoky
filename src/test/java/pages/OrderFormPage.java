package pages;

import base.WebDriverSingleton;
import internalClasses.Order;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrderFormPage {
    WebDriver driver;

    @FindBy(xpath = "//input[@title='billingfirstname']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@title='billinglastname']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@title='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@title='billingaddress']")
    private WebElement address;

    @FindBy(xpath = "//input[@title='billingpostcode']")
    private WebElement postCode;

    @FindBy(xpath = "//input[@title='billingcity']")
    private WebElement city;

    @FindBy(className = "current_country")
    private WebElement state;

    @FindBy(xpath = "//input[@title='poznamka-k-objednavke']")
    private WebElement poznamka;

    @FindBy(id = "agree")
    private WebElement iAgree;

    @FindBy(id = "agree_gdpr")
    private WebElement iAgreeGDPR;

    @FindBy(id = "submit_order")
    private WebElement submitOrder;

    public OrderFormPage() {
        driver = WebDriverSingleton.getWebdriverInstance();
        PageFactory.initElements(driver, this);
    }

    public void fillOrderInformation(Order order) {
        firstName.sendKeys(order.getFirstName());
        lastName.sendKeys(order.getLastName());
        email.sendKeys(order.getEmail());
        address.sendKeys(order.getAddress());
        postCode.sendKeys(order.getPostCode());
        city.sendKeys(order.getCity());
        new Select(state).selectByValue("SK");
        poznamka.sendKeys(order.getNote());
    }

    public void agreeAndSubmit() {
        iAgree.click();
        iAgreeGDPR.click();
        submitOrder.click();
    }
}

