package com.vytrack.tests;

import com.vytrack.utilities.vy_track_login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class T1_Tina {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = com.vytrack.utilities.WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void TestDriver44() throws InterruptedException {
        driver.get("https://qa1.vytrack.com/user/login");
        vy_track_login.Login_function(driver, "storemanager75", "UserUser123");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        List<WebElement> allModules = new ArrayList<>();
        for(WebElement eachElement : allModules){
            eachElement.getText();
        }





    }
}
