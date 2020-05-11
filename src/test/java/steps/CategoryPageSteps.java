package steps;

import io.cucumber.java.en.And;
import pages.CategoryPage;

public class CategoryPageSteps {
    @And("I choose the most beautiful ones")
    public void iChooseTheMostBeautifulOnes() {
        new CategoryPage().clickOnCategory();
    }
}
