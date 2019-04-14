package cucumber;

import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import properties.Properties;
import webdriver.ConfigureBrowser;

import static com.codeborne.selenide.Selenide.open;

public class BeforeAfterScenario {

    @Before(order = 1)
    public void configureBrowser() {
        ConfigureBrowser browser = new ConfigureBrowser();
        browser.setConfiguration();

    }

    @Before(order = 2)
    public void openLocation() {
        Properties properties = new Properties();
        open(properties.getHost());
    }

    @After
    public void clearAndCloseBrowser() {
        WebDriverRunner.clearBrowserCache();
        WebDriverRunner.closeWebDriver();
    }
}
