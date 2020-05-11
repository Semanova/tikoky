package pages;

import base.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
    WebDriver driver;

    @FindBy(xpath = "//input[@value = 'TatraPay']")
    WebElement paymentMethod;

    public void PaymentPage(){
        WebDriverSingleton.getWebdriverInstance();
        PageFactory.initElements(driver, this);
    }

    public void choosePaymentMethod(){
    paymentMethod.click();
    }
}
