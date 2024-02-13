package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DeviceCardPage {

    public final SelenideElement startPrice = $("div[class*='isNewUxHeaderEnabled'] [data-qa='PRD_TotalUpfront']");
    public final SelenideElement monthlyPayment = $("div[class*='isNewUxHeaderEnabled'] div[class*='rightAlignment'] [class*='variant_h4 value']");
    public final SelenideElement addToBasketButton = $("div[class*='isNewUxHeaderEnabled'] button[data-qa='PRD_AddToBasket']");

    public String getValueOfStartPrice() {
        return $(startPrice).getText();
    }

    public String getValueOfMonthlyPayment() {
        return $(monthlyPayment).getText();
    }

    public void clickAddToBasketButton() {
        addToBasketButton.click();
    }
}
