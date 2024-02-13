package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private final SelenideElement logo = $("a[data-ma='menu-logo']");
    private final SelenideElement devicesDropdown = $(By.xpath("//button[text()='Urządzenia']"));
    private final SelenideElement smartWatchesAndBandsWithoutSubscriptionSpan = $(By.xpath("//li[p[text()='Smartwatche i opaski']]//span[text()='Bez abonamentu']"));
    private final SelenideElement basketLogo = $("a[data-ma='menu-basket'] div");
    private final SelenideElement devicesList = $("nav[id*='main-menu'] div[class*='menu-dropdown-submenu'] ul[class*=' more-columns']");

    public void clickSmartwatchesAndBandsWithoutSubscriptionSpan() {
        smartWatchesAndBandsWithoutSubscriptionSpan.click();
    }

    public void hoverDevicesDropdown() {
        devicesDropdown.hover();
        devicesList.shouldBe(visible);
    }

    public void verifyAmountOfItemsInBasket(String amountOfItems) {
        basketLogo.shouldHave(text(amountOfItems));
    }

    public void verifyLogoIsVisible() {
        logo.shouldBe(visible);
    }
}
