package cucumber;

import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import webdriver.ConfigureBrowser;

public class BeforeAfterScenario {

    @Before
    public void configureBrowser() {
        ConfigureBrowser browser = new ConfigureBrowser();
        browser.setConfiguration();
    }

    @After
    public void clearAndCloseBrowser() {
        WebDriverRunner.clearBrowserCache();
        WebDriverRunner.closeWebDriver();
    }
}
