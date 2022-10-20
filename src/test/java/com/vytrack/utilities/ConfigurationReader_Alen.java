package com.vytrack.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader_Alen {
    private static Properties properties = new Properties();

    static {

        try {
            FileInputStream file = new FileInputStream("AlenConfiguration.properties");

            properties.load(file);

            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static String getProperty(String key){
        return properties.getProperty(key);

    }
}
