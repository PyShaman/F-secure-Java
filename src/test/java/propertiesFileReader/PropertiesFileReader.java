package propertiesFileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {
    private String defaultPropertiesFilePath;

    private Properties defaultProperties;
    private Properties localProperties;

    public PropertiesFileReader(String propertiesPath, String defaultPropertiesFileName, String localPropertiesFileName) {
        String localPropertiesFilePath = propertiesPath + localPropertiesFileName;
        defaultPropertiesFilePath = propertiesPath + defaultPropertiesFileName;

        try {
            defaultProperties = readProperties(defaultPropertiesFilePath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Properties not found at " + defaultPropertiesFilePath);
        }

        try {
            localProperties = readProperties(localPropertiesFilePath);
        } catch (FileNotFoundException e) {
            System.out.println("You can overwrite default properties by creating: " + localPropertiesFilePath);
        }
    }

    private Properties readProperties(String filePath) throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        Properties properties = new Properties();

        try {
            properties.load(reader);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties;
    }

    public String getValue(String value) {
        if (defaultProperties.getProperty(value) == null) {
            throw new RuntimeException(value + " not specified in the file: " + defaultPropertiesFilePath);
        }

        if (localProperties == null) {
            return defaultProperties.getProperty(value);
        } else {
            return localProperties.getProperty(value) == null ? defaultProperties.getProperty(value) : localProperties.getProperty(value);
        }
    }
}
