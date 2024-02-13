package steps;

import io.cucumber.java.en.When;
import pages.DeviceCardPage;

public class DevicesCardPageSteps {

    public static String monthlyPayment;
    static BasketPageSteps basketPageSteps = new BasketPageSteps();
    private static final DeviceCardPage deviceCardPage = new DeviceCardPage();

    @When("Add product to basket")
    public static void add_product_to_basket() {
        basketPageSteps.setMonthlyPaymentValue(deviceCardPage.getValueOfMonthlyPayment());
        basketPageSteps.setStartPriceValue(deviceCardPage.getValueOfStartPrice());

        deviceCardPage.getValueOfStartPrice();
        deviceCardPage.clickAddToBasketButton();
    }

}
