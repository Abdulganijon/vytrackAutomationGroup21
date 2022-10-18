package com.vytrack.tests;

import com.vytrack.utilities.TestBase;
import com.vytrack.utilities.vy_track_login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OroincDocumentationPage extends TestBase {
    @Test
    public void  oroincDocumentationPage(){
        vy_track_login.Login_function(driver,"storemanager78","UserUser123");
        WebElement getHelpBtn = driver.findElement(By.xpath("//i[@title='Get help']"));
        getHelpBtn.click();
        for (String eachWindow : driver.getWindowHandles()) {
            driver.switchTo().window(eachWindow);
        }
//    AC #1: users access the Oronic Documentation page by clicking the question icon. The page URL: https://doc.oroinc.com/
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://doc.oroinc.com/";
        Assert.assertEquals(actualUrl, expectedUrl);

    }
}
