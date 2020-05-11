package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomePageSteps {
    @Given("I want new Tikoki shoes")
    public void iWantNewTikokiShoes() {
        new HomePage().openPage();
    }

    @When("I click on new category")
    public void iClickOnNewCategory() {
        new HomePage().openCategory();
    }
}
