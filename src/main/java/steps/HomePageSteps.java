package steps;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.DevicesPage;
import pages.HomePage;
import runners.PropertyProvider;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class HomePageSteps {

    private final HomePage homePage = new HomePage();
    private final DevicesPage devicesPage = new DevicesPage();
    private final SelenideElement acceptCookiesButton = $("button[id='didomi-notice-agree-button']");

    private void openHomePage() {
        open(PropertyProvider.Url);
    }

    @Given("Open home page")
    public void open_home_page() {
        openHomePage();
        homePage.verifyLogoIsVisible();
    }

    @And("Open devices tab")
    public void open_devices_tab() {
        acceptCookiesButton.click();
        homePage.hoverDevicesDropdown();
        homePage.clickSmartwatchesAndBandsWithoutSubscriptionSpan();
        devicesPage.verifyListOfDevicesIsVisible();
    }

    @Then("Verify amount of items in basket equals to {string}")
    public void verify_amount_of_items_in_basket_equals_to(String amountOfItems) {
        homePage.verifyAmountOfItemsInBasket(amountOfItems);
    }
}
