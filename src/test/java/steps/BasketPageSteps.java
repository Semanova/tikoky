package steps;

import io.cucumber.java.en.Then;
import pages.BasketPage;

public class BasketPageSteps {
    @Then("yes, my shoes {string} are already there")
    public void yesMyShoesSpottyBettyAreAlreadyThere() {
        new BasketPage().checkProductName("Spotty Betty");
    }
}
