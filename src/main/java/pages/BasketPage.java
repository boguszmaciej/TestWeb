package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class BasketPage {

    private final SelenideElement startPrice = $("div[data-qa='BKT_TotalupFrontCurrCOde']");
    private final SelenideElement monthlyPaymentPrice = $("div[data-qa='BKT_TotalMonthlyCurrCOde']");
    private final SelenideElement logo = $("div[class*='logo-panel']");

    public void verifyStartPriceValue(String expectedStartPriceValue) {
        startPrice.shouldHave(text(expectedStartPriceValue));
    }

    public void verifyMonthlyPaymentValue(String expectedMonthlyPaymentValue) {
        monthlyPaymentPrice.shouldHave(text(expectedMonthlyPaymentValue));
    }

    public void clickLogo() {
        logo.click();
    }
}
