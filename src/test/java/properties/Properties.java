package properties;

import propertiesFileReader.PropertiesFileReader;

public class Properties {

    private PropertiesFileReader properties;

    public Properties() {
        properties = new PropertiesFileReader(
                "src/test/resources", "default.properties", "local.properties"
        );
    }

    public String getHost() { return properties.getValue("url"); }
    public String getChromeDriverPath() { return properties.getValue("webdriver.chrome.driver.path"); }
    public String getFirefoxDriverPath() { return properties.getValue("webdriver.firefox.driver.path"); }
}
