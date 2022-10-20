package com.vytrack.tests;

import com.vytrack.utilities.ConfigurationReader_Alen;
import com.vytrack.utilities.TestBase_Alen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC5_SetupAlen_AC2 extends TestBase_Alen {

    @Test
    public void testAC2() throws InterruptedException {
        driver.get(ConfigurationReader_Alen.getProperty("env"));

        WebElement  inputUsername= driver.findElement(By.xpath("//input[@id='prependedInput']"));
        inputUsername.sendKeys(ConfigurationReader_Alen.getProperty("username"));

        WebElement inputPassword= driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        inputPassword.sendKeys(ConfigurationReader_Alen.getProperty("password"));

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        WebElement selectFleet=driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[1]/a/span"));
        Thread.sleep(3000);
        selectFleet.click();

        WebElement selectVehicleModel=driver.findElement(By.xpath("(//span[text()='Vehicles Model'])[1]"));
        Thread.sleep(5000);
        selectVehicleModel.click();

        WebElement actual= driver.findElement(By.xpath("//div[.='You do not have permission to perform this action.']"));

        String expectedMsg ="You do not have permission to perform this action.";
        String actualMsg=actual.getText();

        System.out.println("actual.getText() = " + actual.getText());

        Assert.assertEquals(expectedMsg,actualMsg,"Strings Did not match");

        //fdgdfvg
    }





}
