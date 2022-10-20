package com.vytrack.tests.erkan;


import com.vytrack.tests.erkan.utilities.TestCase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test78byErkan extends TestCase  {

    @Test
            public void test1() throws InterruptedException {



        WebElement selectCustomers = driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[3]/a/span"));
        Thread.sleep(3000);
        selectCustomers.click();

        WebElement selectAccounts = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/div/div/ul/li[3]/a/span "));
        selectAccounts.click();
        WebElement filterButton = driver.findElement(By.xpath("//i[@class='fa-filter hide-text']"));
        filterButton.click();

        List<WebElement> filters = driver.findElements(By.xpath("//ul[@class='nav-multilevel main-menu']/li/a/span"));

        System.out.println(filters.size());
        for (WebElement eachfilter : filters) {
            System.out.println(eachfilter.getText());

        }


    }
}





