package com.vytrack.tests;

import com.vytrack.utilities.logIn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC8_SetupAlen_AC1_AC2 {

    public WebDriver driver;


    @BeforeMethod

    public void setUp() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test(
            priority = 3
    )


    public void testStoreManager75() throws InterruptedException {

        driver.get("https://qa1.vytrack.com/user/login");
        logIn.crm_login(driver, "storemanager75", "UserUser123");
        logIn.verifyTitle(driver, "Dashboard");
        Thread.sleep(3000);

        WebElement selectActivity = driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[5]/a/span"));
        Thread.sleep(3000);
        selectActivity.click();

        WebElement selectCalendarEvent = driver.findElement(By.xpath("//span[.='Calendar Events']"));
        selectCalendarEvent.click();
        WebElement selectCalendarEvents = driver.findElement(By.xpath("//a[normalize-space()='Create Calendar event']"));
        Thread.sleep(3000);
        selectCalendarEvents.click();


        WebElement selectRepeat = driver.findElement(By.xpath("//label[normalize-space()='Repeat']"));
        Thread.sleep(5000);
        selectRepeat.click();

        WebElement checkNumber = driver.findElement(By.xpath("(//input[@value='1'])[2] "));

        String validateNumber = checkNumber.getAttribute("value");
        System.out.println("validateNumber = " + validateNumber);

        Thread.sleep(3000);
        WebElement deteleNumber = driver.findElement(By.xpath("(//input[@value='1'])[2]"));
        deteleNumber.clear();


        WebElement errorMsg = driver.findElement(By.xpath("(//span[.='This value should not be blank.'])[3]"));

        Assert.assertTrue(errorMsg.isDisplayed());
        System.out.println("errorMsg.getText() = " + errorMsg.getText());


        driver.close();


    }

    @Test(
            priority = 4
    )
    public void testStoreManager78() throws InterruptedException {
        driver.get("https://qa1.vytrack.com/user/login");
        logIn.crm_login(driver, "storemanager78", "UserUser123");
        logIn.verifyTitle(driver, "Dashboard");
        Thread.sleep(3000);

        WebElement selectActivity = driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[5]/a/span"));
        Thread.sleep(3000);
        selectActivity.click();

        WebElement selectCalendarEvent = driver.findElement(By.xpath("//span[.='Calendar Events']"));
        selectCalendarEvent.click();
        WebElement selectCalendarEvents = driver.findElement(By.xpath("//a[normalize-space()='Create Calendar event']"));
        Thread.sleep(3000);
        selectCalendarEvents.click();


        WebElement selectRepeat = driver.findElement(By.xpath("//label[normalize-space()='Repeat']"));
        Thread.sleep(5000);
        selectRepeat.click();

        WebElement checkNumber = driver.findElement(By.xpath("(//input[@value='1'])[2] "));

        String validateNumber = checkNumber.getAttribute("value");
        System.out.println("validateNumber = " + validateNumber);

        Thread.sleep(3000);
        WebElement deteleNumber = driver.findElement(By.xpath("(//input[@value='1'])[2]"));
        deteleNumber.clear();


        WebElement errorMsg = driver.findElement(By.xpath("(//span[.='This value should not be blank.'])[3]"));

        Assert.assertTrue(errorMsg.isDisplayed());
        System.out.println("errorMsg.getText() = " + errorMsg.getText());


        driver.close();


    }

    @Test(
            priority = 5
    )
    public void testSalesManager133() throws InterruptedException {
        driver.get("https://qa1.vytrack.com/user/login");
        logIn.crm_login(driver, "salesmanager133", "UserUser123");
        logIn.verifyTitle(driver, "Dashboard");
        Thread.sleep(3000);

        WebElement selectActivity = driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[5]/a/span"));
        Thread.sleep(3000);
        selectActivity.click();

        WebElement selectCalendarEvent = driver.findElement(By.xpath("//span[.='Calendar Events']"));
        selectCalendarEvent.click();
        WebElement selectCalendarEvents = driver.findElement(By.xpath("//a[normalize-space()='Create Calendar event']"));
        Thread.sleep(3000);
        selectCalendarEvents.click();


        WebElement selectRepeat = driver.findElement(By.xpath("//label[normalize-space()='Repeat']"));
        Thread.sleep(5000);
        selectRepeat.click();

        WebElement checkNumber = driver.findElement(By.xpath("(//input[@value='1'])[2] "));


        String validateNumber = checkNumber.getAttribute("value");
        System.out.println("validateNumber = " + validateNumber);

        Thread.sleep(3000);
        WebElement deteleNumber = driver.findElement(By.xpath("(//input[@value='1'])[2]"));
        deteleNumber.clear();


        WebElement errorMsg = driver.findElement(By.xpath("(//span[.='This value should not be blank.'])[3]"));

        Assert.assertTrue(errorMsg.isDisplayed());
        System.out.println("errorMsg.getText() = " + errorMsg.getText());


        driver.close();
    }

    @Test(
            priority = 6
    )
    public void testSalesManager136() throws InterruptedException {
        driver.get("https://qa1.vytrack.com/user/login");
        logIn.crm_login(driver, "salesmanager136", "UserUser123");
        logIn.verifyTitle(driver, "Dashboard");
        Thread.sleep(3000);

        WebElement selectActivity = driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[5]/a/span"));
        Thread.sleep(3000);
        selectActivity.click();

        WebElement selectCalendarEvent = driver.findElement(By.xpath("//span[.='Calendar Events']"));
        selectCalendarEvent.click();
        WebElement selectCalendarEvents = driver.findElement(By.xpath("//a[normalize-space()='Create Calendar event']"));
        Thread.sleep(3000);
        selectCalendarEvents.click();


        WebElement selectRepeat = driver.findElement(By.xpath("//label[normalize-space()='Repeat']"));
        Thread.sleep(5000);
        selectRepeat.click();

        WebElement checkNumber = driver.findElement(By.xpath("(//input[@value='1'])[2] "));


        String validateNumber = checkNumber.getAttribute("value");
        System.out.println("validateNumber = " + validateNumber);

        Thread.sleep(3000);
        WebElement deteleNumber = driver.findElement(By.xpath("(//input[@value='1'])[2]"));
        deteleNumber.clear();


        WebElement errorMsg = driver.findElement(By.xpath("(//span[.='This value should not be blank.'])[3]"));

        Assert.assertTrue(errorMsg.isDisplayed());
        System.out.println("errorMsg.getText() = " + errorMsg.getText());


        driver.close();
    }

    @Test(
            priority = 1
    )
    public void testUser44() throws InterruptedException {
        driver.get("https://qa1.vytrack.com/user/login");
        .login( "user44", "UserUser123");
        logIn.verifyTitle(driver, "Dashboard");
        Thread.sleep(3000);

        WebElement selectActivity = driver.findElement(By.xpath("(//span[@class='title title-level-1'][normalize-space()='Activities'])[1]"));
        Thread.sleep(3000);
        selectActivity.click();

        WebElement selectCalendarEvent = driver.findElement(By.xpath("//span[.='Calendar Events']"));
        selectCalendarEvent.click();

        WebElement selectCalendarEvents = driver.findElement(By.xpath("//a[normalize-space()='Create Calendar event']"));
        Thread.sleep(3000);
        selectCalendarEvents.click();

        WebElement selectRepeat = driver.findElement(By.xpath("//label[normalize-space()='Repeat']"));
        Thread.sleep(5000);
        selectRepeat.click();

        WebElement checkNumber = driver.findElement(By.xpath("(//input[@value='1'])[2] "));


        String validateNumber = checkNumber.getAttribute("value");
        System.out.println("validateNumber = " + validateNumber);

        Thread.sleep(3000);
        WebElement deteleNumber = driver.findElement(By.xpath("(//input[@value='1'])[2]"));
        deteleNumber.clear();


        WebElement errorMsg = driver.findElement(By.xpath("(//span[.='This value should not be blank.'])[3]"));

        Assert.assertTrue(errorMsg.isDisplayed());
        System.out.println("errorMsg.getText() = " + errorMsg.getText());


        driver.close();


    }

    @Test(
            priority = 2
    )
    public void testUser49() throws InterruptedException {
        driver.get("https://qa1.vytrack.com/user/login");
        logIn.crm_login(driver, "user49", "UserUser123");
        logIn.verifyTitle(driver, "Dashboard");
        Thread.sleep(3000);

        WebElement selectActivity = driver.findElement(By.xpath("(//span[@class='title title-level-1'][normalize-space()='Activities'])[1]"));
        Thread.sleep(3000);
        selectActivity.click();

        WebElement selectCalendarEvent = driver.findElement(By.xpath("//span[.='Calendar Events']"));
        selectCalendarEvent.click();

        WebElement selectCalendarEvents = driver.findElement(By.xpath("//a[normalize-space()='Create Calendar event']"));
        Thread.sleep(3000);
        selectCalendarEvents.click();

        WebElement selectRepeat = driver.findElement(By.xpath("//label[normalize-space()='Repeat']"));
        Thread.sleep(5000);
        selectRepeat.click();

        WebElement checkNumber = driver.findElement(By.xpath("(//input[@value='1'])[2] "));


        String validateNumber = checkNumber.getAttribute("value");
        System.out.println("validateNumber = " + validateNumber);

        Thread.sleep(3000);
        WebElement deteleNumber = driver.findElement(By.xpath("(//input[@value='1'])[2]"));
        deteleNumber.clear();


        WebElement errorMsg = driver.findElement(By.xpath("(//span[.='This value should not be blank.'])[3]"));

        Assert.assertTrue(errorMsg.isDisplayed());
        System.out.println("errorMsg.getText() = " + errorMsg.getText());


        driver.close();


    }
}
