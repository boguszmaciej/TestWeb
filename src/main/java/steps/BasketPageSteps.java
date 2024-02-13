package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasketPage;
import pages.HomePage;

public class BasketPageSteps {

    BasketPage basketPage = new BasketPage();
    HomePage homePage = new HomePage();
    private static String monthlyPaymentValue;
    private static String startPriceValue;

    public static void setMonthlyPaymentValue(String value) {
        monthlyPaymentValue = value;
    }

    public static void setStartPriceValue(String value) {
        startPriceValue = value;
    }


    @Then("Verify prices")
    public void verify_prices() {
        basketPage.verifyMonthlyPaymentValue(monthlyPaymentValue);
        basketPage.verifyStartPriceValue(startPriceValue);
    }

    @When("Return to home page")
    public void return_to_home_page() {
        basketPage.clickLogo();
        homePage.verifyLogoIsVisible();
    }
}
