package runners;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.codeborne.selenide.Selenide.closeWebDriver;


public class Hook {

    private static final Logger logger = LogManager.getLogger();

    @Before
    public void setUp() {
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 30000;
    }

    @After
    public void afterTest(Scenario scenario) {
        if (scenario.isFailed()) {
            logger.error("Błąd w scenariuszu: " + scenario.getName());
        }

        closeWebDriver();
    }

}
