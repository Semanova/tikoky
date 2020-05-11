package pages;

import base.WebDriverSingleton;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage {
    WebDriver driver;

    @FindBy(className = "checkout_button")
    WebElement submitOrderButton;

    @FindBy(className = "checkout-total")
    WebElement price;

    public BasketPage() {
        WebDriverSingleton.getWebdriverInstance();
        PageFactory.initElements(driver, this);
    }

    public String getThePrice() {
        return price.getText();
    }

    public void checkThePrice(String expectedPrice) {
        Assert.assertEquals(expectedPrice, getThePrice());
        submitOrderButton.click();
    }
}


