package Tests;

import base.BaseClass;
import internalClasses.Order;
import org.junit.Test;
import pages.*;

public class AboutMe extends BaseClass {

    @Test
    public void aboutMe() {
        getDriver().get(BASE_URL);
        HomePage homePage = new HomePage();
        CategoryPage categoryPage = new CategoryPage();
        OrderFormPage orderFormPage = new OrderFormPage();
        ProductPage productPage = new ProductPage();
        BasketPage basketPage = new BasketPage();
        PaymentPage paymentPage = new PaymentPage();

        Order myFirstOrder = new Order("princess", "Zuzana",
                "zuzana.semanova@accenture.com", "Mosovskeho 19", "81103", "Bratislava",
                "Slovakia", "if this test really pass I will have new shoes");

        homePage.openPage();
        homePage.openCategory();
        categoryPage.clickOnCategory();
        productPage.chooseSize();
        productPage.addToTheBasket();
        productPage.openBasketPage();
        //basketPage.checkThePrice();
        orderFormPage.fillOrderInformation(myFirstOrder);
        orderFormPage.agreeAndSubmit();
        paymentPage.choosePaymentMethod();

    }
}


