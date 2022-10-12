package com.vytrack.tests;

import com.vytrack.utilities.WebDriverFactory;
import com.vytrack.utilities.logIn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Alen_SetUp {

    public WebDriver driver;


    @BeforeMethod

    public void setUp() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    public void testStoreManager75() throws InterruptedException {
        driver.get("https://qa1.vytrack.com/user/login");
        logIn.crm_login(driver, "storemanager75", "UserUser123");
        logIn.verifyTitle(driver, "Dashboard");

        // Select selectFleet = new Select(driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[2]/a/span")));
        //Thread.sleep(2000);
        //selectFleet.selectByVisibleText("Vehicles");
        WebElement selectActivity = driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[5]/a/span"));
        Thread.sleep(3000);
        selectActivity.click();

        WebElement selectCalendarEvent = driver.findElement(By.xpath("//span[.='Calendar Events']"));
        selectCalendarEvent.click();
        WebElement selectCalendarEvents = driver.findElement(By.xpath("//a[normalize-space()='Create Calendar event']"));
        Thread.sleep(3000);
        selectCalendarEvents.click();

        WebElement selectRepeat= driver.findElement(By.xpath("//input[@id='recurrence-repeat-view652']"));
        Thread.sleep(3000);
        selectRepeat.click();




    }
}
