package com.vytrack.tests.erkan.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgDataProvider {
    WebDriver driver;

    @Test(dataProvider = "GoogleSearch",dataProviderClass = TestNgDataProviderData.class)
    public void Test1(String keyword, String expectedTitle){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys(keyword+ Keys.ENTER);
        Assert.assertEquals(driver.getTitle(),expectedTitle);
        driver.quit();
    }


    public static class TestNgDataProviderData {
        @DataProvider(name = "GoogleSearch")
        public Object[][] testData() {
            return new Object[][]{
                    {"selenium", "selenium - Google Search"},
                    {"java", "java - Google Search"},
                    {"erkanbarin", "erkanbarin - Google Search"}
            };
        }
    }
}


