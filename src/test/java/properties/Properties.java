package properties;

import propertiesFileReader.PropertiesFileReader;

public class Properties {

    private PropertiesFileReader properties;

    public Properties() {
        properties = new PropertiesFileReader(
                "src/test/resources/", "default.properties", "local.properties"
        );
    }

    public String getHost() { return properties.getValue("url"); }
    public String getBrowser() { return properties.getValue("browser"); }
    public String getChromeDriverPathForLinux() { return properties.getValue("webdriver.chrome.driver.path.linux"); }
    public String getFirefoxDriverPathForLinux() { return properties.getValue("webdriver.firefox.driver.path.linux"); }
    public String getChromeDriverPathForWindows() { return properties.getValue("webdriver.chrome.driver.path.windows"); }
    public String getFirefoxDriverPathForWindows() { return properties.getValue("webdriver.firefox.driver.path.windows"); }
}
