package pages;

import base.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage {
    WebDriver driver;

    @FindBy(xpath = "//[@classname = product_name]")
    WebElement theMostBeautifulShoes;

    public CategoryPage() {
        driver = WebDriverSingleton.getWebdriverInstance();
        PageFactory.initElements(driver, this);
    }

    public void chooseYourShoes(){
        theMostBeautifulShoes.click();
    }
}
