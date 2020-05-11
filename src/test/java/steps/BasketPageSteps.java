package steps;

import io.cucumber.java.en.Then;
import pages.BasketPage;

public class BasketPageSteps {
    @Then("yes, my shoes for \\(price) are already there")
    public void yesMyShoesForPriceAreAlreadyThere(String expectedPrice) {
                new BasketPage().checkThePrice(expectedPrice);
    }
}
