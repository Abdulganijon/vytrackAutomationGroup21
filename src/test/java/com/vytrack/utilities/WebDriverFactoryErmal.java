package com.vytrack.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverFactoryErmal {

    public static WebDriver getDriver(String browserType) {
        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();


        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();


        } else if (browserType.equalsIgnoreCase("safari")){
            WebDriverManager.safaridriver().setup();
            return new SafariDriver();
        }else {
            System.out.println("Given browser type not exist/or not currently supported");
            return null;
        }

    }

}
