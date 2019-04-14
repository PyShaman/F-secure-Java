package webdriver;

import com.codeborne.selenide.Configuration;
import org.apache.commons.exec.OS;
import properties.Properties;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class ConfigureBrowser {

    public void setConfiguration() {
        Configuration.browser = "chrome";
        Configuration.timeout = 9000;
        Configuration.startMaximized = true;
        useLocalWebdriver();
    }

    private void useLocalWebdriver() {
        Properties properties = new Properties();

        if (OS.isFamilyWindows()) {
            System.setProperty("webdriver.chrome.driver", properties.getChromeDriverPathForWindows());
        }
        else if (OS.isFamilyUnix()) {
            System.setProperty("webdriver.chrome.driver", properties.getChromeDriverPathForLinux());
        }
    }


}
