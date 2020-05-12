package pages;

import base.WebDriverSingleton;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage {
    WebDriver driver;

    @FindBy(xpath = "//[@classname='product-name']/a[1]")
    WebElement productName;

    public BasketPage() {
        WebDriverSingleton.getWebdriverInstance();
        PageFactory.initElements(driver, this);
    }

    public String getName(){
        return productName.getText();
    }

    public void checkProductName(String expectedProductName){
       Assert.assertEquals(expectedProductName, getName());
    }

}






