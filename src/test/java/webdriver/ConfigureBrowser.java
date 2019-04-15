package webdriver;

import com.codeborne.selenide.Configuration;
import org.apache.commons.exec.OS;
import properties.Properties;

public class ConfigureBrowser {
    private Properties properties;
    public void setConfiguration() {
        properties = new Properties();
        Configuration.browser = properties.getBrowser();
        Configuration.timeout = 9000;
        Configuration.startMaximized = true;
        useLocalWebdriver();
    }

    private void useLocalWebdriver() {


        if (OS.isFamilyWindows() && Configuration.browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", properties.getChromeDriverPathForWindows());
        }
        else if (OS.isFamilyUnix() && Configuration.browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", properties.getChromeDriverPathForLinux());
        }
        else if (OS.isFamilyWindows() && Configuration.browser.equals("firefox")) {
            System.setProperty("webdriver.firefox.driver", properties.getFirefoxDriverPathForWindows());
        }
        else if (OS.isFamilyUnix() && Configuration.browser.equals("firefox")) {
            System.setProperty("webdriver.firefox.driver", properties.getFirefoxDriverPathForLinux());
        }
    }


}
