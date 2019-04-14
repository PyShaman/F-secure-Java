package webdriver;

import com.codeborne.selenide.Configuration;
import org.apache.commons.exec.OS;
import properties.Properties;

public class ConfigureBrowser {

    public void setConfiguration() {
        Configuration.browser = "chrome";
        Configuration.timeout = 9000;

        useLocalWebdriver();
    }

    private void useLocalWebdriver() {
        Properties properties = new Properties();

        if (OS.isFamilyWindows()) {
            System.out.println("test");
            System.setProperty("webdriver.chrome.driver", properties.getChromeDriverPathForWindows());
        }
        else if (OS.isFamilyUnix()) {
            System.out.println("test2");
            System.setProperty("webdriver.chrome.driver", properties.getChromeDriverPathForLinux());
        }
    }
}
