package steps;

import io.cucumber.java.en.And;
import pages.ProductPage;

public class ProductPageSteps {
    @And("I choose my size")
    public void iChooseMySize() {
        new ProductPage().chooseSize();
    }

    @And("I throw them to the basket")
    public void iThrowThemToTheBasket() {
        new ProductPage().addToTheBasket();
    }

    @And("Im going to check it they are really in the basket")
    public void imGoingToCheckItTheyAreReallyInTheBasket() {
        new ProductPage().openBasketPage();
    }
}
