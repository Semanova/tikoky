package steps;

import io.cucumber.java.en.Then;
import pages.PaymentPage;

public class PaymentPageSteps {
    @Then("he will buy them for me")
    public void heWillBuyThemForMe() {
        new PaymentPage().choosePaymentMethod();
            }
}
