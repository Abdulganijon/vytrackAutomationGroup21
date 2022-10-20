package com.vytrack.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader_Shirin {


    private static  Properties properties = new Properties();

    static{
        try{
            FileInputStream file = new FileInputStream("shirinconfiguration.properties");

            properties.load(file);


            file.close();
        }catch(IOException e) {
        }
    }
    public static  String getProperties(String keyword){

        return properties.getProperty(keyword);
    }
}


