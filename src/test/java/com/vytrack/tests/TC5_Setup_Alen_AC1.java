package com.vytrack.tests;

import com.vytrack.utilities.WebDriverFactory;
import com.vytrack.utilities.logIn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC5_Setup_Alen_AC1 {
    public WebDriver driver;


    @BeforeMethod

    public void setUp() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


    }
    @Test

    public void testManager75() throws  InterruptedException {


        driver.get("https://qa1.vytrack.com/user/login");
        logIn.crm_login(driver, "storemanager75", "UserUser123");
        logIn.verifyTitle(driver, "Dashboard");
        Thread.sleep(3000);


        WebElement selectfleet = driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[2]/a/span"));
        Thread.sleep(2000);
        selectfleet.click();


        //   selecfleet.click();

        WebElement selectModel = driver.findElement(By.xpath("(//span[text()='Vehicles Model'])[1]"));
        Thread.sleep(2000);

        selectModel.click();


        Thread.sleep(3000);

        List<WebElement> filters = driver.findElements(By.xpath("//thead[@class='grid-header']/tr"));

        System.out.println(filters.size());
        for (WebElement eachfilter : filters) {
            System.out.println(eachfilter.getText());
            System.out.println(" all 10 Elements displayed = " + eachfilter.isDisplayed());


        }


        driver.quit();
    }


    }




