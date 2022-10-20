package com.vytrack.tests;

import com.vytrack.utilities.vy_track_login;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class TC3_Tina_Pinbar {
    public WebDriver driver;

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

        WebElement learnHow = driver.findElement(By.xpath("//a[.='Learn how to use this space']"));
        Thread.sleep(2000);
        learnHow.click();
        Thread.sleep(2000);

        WebElement howToUsePinbar = driver.findElement(By.xpath("//div[@class='clearfix']/h3"));

        WebElement usePinIcon = driver.findElement(By.xpath("//div[@class='clearfix']/p[1]"));

        WebElement pinImg = driver.findElement(By.xpath("//img[@src='/bundles/oronavigation/images/pinbar-location.jpg']"));

        String expected1 = "How To Use Pinbar";
        String actual1 = howToUsePinbar.getText();

        String expected2 = "Use pin icon on the right top corner of page to create fast access link in the pinbar.";
        String actual2 = usePinIcon.getText();

        Assert.assertEquals(actual1, expected1);
        Assert.assertEquals(actual2, expected2);


        String expected3 = "/bundles/oronavigation/images/pinbar-location.jpg";
        String actual3 = pinImg.getText();
        Assert.assertEquals(actual3, expected3);


    }

    @Test
    public void TestStoreManager75_Tina() throws InterruptedException {


        driver.get("https://qa1.vytrack.com/user/login");
        vy_track_login.Login_function(driver, "storemanager75", "UserUser123");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement howToUsePinbar = driver.findElement(By.xpath("//div[@class='clearfix']/h3"));

        WebElement usePinIcon = driver.findElement(By.xpath("//div[@class='clearfix']/p[1]"));

        String expected1 = "How To Use Pinbar";
        String actual1 = howToUsePinbar.getText();

        String expected2 = "Use pin icon on the right top corner of page to create fast access link in the pinbar.";
        String actual2 = usePinIcon.getText();

        Assert.assertEquals(actual1, expected1);
        Assert.assertEquals(actual2, expected2);


        WebElement pinImg = driver.findElement(By.xpath("//p//img"));
        String expected = "/bundles/oronavigation/images/pinbar-location.jpg";
        Assert.assertEquals(pinImg.getText(), expected);

    }
        @AfterMethod
        public void tearDown() {
            driver.quit();
        }

    }
