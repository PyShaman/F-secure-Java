package webdriver;

import com.codeborne.selenide.Configuration;
import properties.Properties;

public class ConfigureBrowser {

    public void setConfiguration() {
        Configuration.browser = "chrome";
        Configuration.timeout = 9000;

        useLocalWebdriver();
    }

    private void useLocalWebdriver() {
        Properties properties = new Properties();

        if (properties.getChromeDriverPath().isEmpty()) {
            return;
        }

        System.setProperty("webdriver.chrome.driver", properties.getChromeDriverPath());
    }
}
