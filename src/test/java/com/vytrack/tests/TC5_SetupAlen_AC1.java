package com.vytrack.tests;

import com.vytrack.utilities.ConfigurationReader_Alen;
import com.vytrack.utilities.TestBase_Alen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TC5_SetupAlen_AC1 extends TestBase_Alen {



    @Test

    public void TestAC1() throws  InterruptedException {


      driver.get(ConfigurationReader_Alen.getProperty("env"));

        WebElement  inputUsername= driver.findElement(By.xpath("//input[@id='prependedInput']"));
        inputUsername.sendKeys(ConfigurationReader_Alen.getProperty("username1"));

        WebElement inputPassword= driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        inputPassword.sendKeys(ConfigurationReader_Alen.getProperty("password"));

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        WebElement selectfleet = driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[2]/a/span"));
        Thread.sleep(2000);
        selectfleet.click();

        WebElement selectModel = driver.findElement(By.xpath("(//span[text()='Vehicles Model'])[1]"));
        Thread.sleep(2000);
        selectModel.click();


        Thread.sleep(3000);

        List<WebElement> filters = driver.findElements(By.xpath("//thead[@class='grid-header']/tr"));

        System.out.println(filters.size());
        for (WebElement eachfilter : filters) {
            System.out.println(eachfilter.getText());
            System.out.println(" all 10 Elements displayed = " + eachfilter.isDisplayed());
     ///sfvdfvd

        }



    }


}




