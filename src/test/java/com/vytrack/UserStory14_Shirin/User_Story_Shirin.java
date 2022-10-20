package com.vytrack.UserStory14_Shirin;

import com.vytrack.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader_Shirin;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class User_Story_Shirin  {

    @Test(priority = 1)
    public void Test_AC_1() {

        Driver.getDriver().get(ConfigurationReader_Shirin.getProperties("env"));

        WebElement inputUsername1 = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput']"));
        inputUsername1.sendKeys(ConfigurationReader_Shirin.getProperties("username1"));

        WebElement inputPassword1 = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput2']"));
        inputPassword1.sendKeys(ConfigurationReader_Shirin.getProperties("password"));

        WebElement loginBtn = Driver.getDriver().findElement(By.xpath("//button[@id='_submit']"));
        loginBtn.click();
        BrowserUtils.sleep(1);

        WebElement marketingModule = Driver.getDriver().findElement(By.xpath("//span[@class='title title-level-1']/i[@class='fa-sitemap menu-icon']"));
        //Actions actions = new Actions(Driver.getDriver());
        //actions.moveToElement(marketingModule).perform();
        marketingModule.click();
        WebElement campaignBtn = Driver.getDriver().findElement(By.linkText("/campaign"));
        campaignBtn.click();




    }
       @Test(priority = 2)
        public void Test_AC_2(){
        WebElement inputUsername2 = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput']"));
        inputUsername2.sendKeys(ConfigurationReader_Shirin.getProperties("username2"));

        WebElement inputPassword2 = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput2']"));
        inputUsername2.sendKeys(ConfigurationReader_Shirin.getProperties("password"));


        WebElement loginBtn = Driver.getDriver().findElement(By.xpath("//button[@id='_submit']"));
        loginBtn.click();


    }
    }

