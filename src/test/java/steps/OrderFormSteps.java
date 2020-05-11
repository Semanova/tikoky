package steps;

import internalClasses.Order;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.OrderFormPage;

public class OrderFormSteps {
    @Given("my husband has money")
    public void myHusbandHasMoney() {

        new OrderFormPage().fillOrderInformation(myFirstOrder);
    }

    @When("I ask him to pay")
    public void iAskHimToPay() {
        new OrderFormPage().agreeAndSubmit();
    }
}
