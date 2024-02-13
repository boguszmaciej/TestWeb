package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class DevicesPage {

    private final String firstDevice = "[data-qa='LST_ProductCard0']";
    private final SelenideElement devicesList = $("div[class*='StyledCards-sc']");

    public void openFirstDeviceCard() {
        $(firstDevice).click();
    }

    public void verifyListOfDevicesIsVisible() {
        devicesList.shouldBe(visible);
    }
}
