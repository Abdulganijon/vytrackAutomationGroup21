package com.vytrack.tests;

import com.vytrack.utilities.Log;
import com.vytrack.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class UserStory70_Ermal {

   WebDriver driver;

    @BeforeMethod
    public void SetUp(){


        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://qa1.vytrack.com/user/login");

    }

    @Test (priority = 1)
    public void StoreManager_access_vehicle_page_TC1() throws InterruptedException {

        Log.crm_login(driver,"storemanager75","UserUser123");
      Thread.sleep(2000);
       WebElement fleet= driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[2]"));
       fleet.click();
        Thread.sleep(2000);
        WebElement vehicleContracts = driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[2]/div/div/ul/li[6]/a/span"));
        vehicleContracts.click();
        Thread.sleep(4000);


        // Expected title :All - Vehicle Contract - Entities - System - Car - Entities - System

        Assert.assertEquals(driver.getTitle(),"All - Vehicle Contract - Entities - System - Car - Entities - System");




    }

    @Test (priority = 2)
    public void SalesManager_access_vehicle_page_TC2() throws InterruptedException {

        Log.crm_login(driver, "salesmanager113", "UserUser123");
        Thread.sleep(2000);
        WebElement fleet2 = driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[2]"));
        fleet2.click();
        Thread.sleep(2000);
        WebElement vehicleContracts2 = driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[2]/div/div/ul/li[6]"));
        vehicleContracts2.click();
        Thread.sleep(4000);


        // Expected title :All - Vehicle Contract - Entities - System - Car - Entities - System

        Assert.assertEquals(driver.getTitle(), "All - Vehicle Contract - Entities - System - Car - Entities - System");


    }


    @Test (priority = 3)
    public void Drivers_access_vehicle_page_TC3() throws InterruptedException {

        Log.crm_login(driver, "user45", "UserUser123");
        Thread.sleep(2000);
        WebElement fleet3 = driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[1]"));
        fleet3.click();
        Thread.sleep(2000);
        WebElement vehicleContracts3 = driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[1]/div/div/ul/li[6]"));
        vehicleContracts3.click();
        Thread.sleep(4000);


        //the page should display
        WebElement message = driver.findElement(By.xpath("//div[.='You do not have permission to perform this action.']"));


        Assert.assertEquals(message.getText(),"You do not have permission to perform this action.");



    }







    @AfterMethod
      public void tearDown(){
         driver.close();
    }


}
