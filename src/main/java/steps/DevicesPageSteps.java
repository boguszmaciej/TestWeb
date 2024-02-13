package steps;

import io.cucumber.java.en.And;
import pages.DevicesPage;

public class DevicesPageSteps {

    private final DevicesPage devicesPage = new DevicesPage();

    @And("Select first product")
    public void select_first_product() {
        devicesPage.openFirstDeviceCard();
    }
}
