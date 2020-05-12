package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage {
    WebDriver driver;

    @FindBy(xpath = "//div[@class='product_size_options']/a[3]")
    WebElement size;

    @FindBy(xpath = "//[@class='primary button']")
    WebElement toTheBasketButton;

    @FindBy(className = "icon-shopping_cart")
    WebElement basketIcon;

    public void chooseSize() {
        size.click();
    }

    public void addToTheBasket() {
        toTheBasketButton.click();
    }

    public void openBasketPage() {
        basketIcon.click();
    }

}
