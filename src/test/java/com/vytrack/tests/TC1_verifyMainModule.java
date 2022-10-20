package com.vytrack.tests;

import com.vytrack.utilities.TestBase;
import com.vytrack.utilities.vy_track_login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TC1_verifyMainModule extends TestBase {


    @Test
    public void main_8module_test() throws InterruptedException {

        vy_track_login.Login_function(driver);
        Thread.sleep(3000);
        // main module
        List<WebElement> mainModule = driver.findElements(By.xpath("//ul[@class='nav-multilevel main-menu']/li/a/span"));

//         store and sales managers should view 8 module names.
        System.out.println("mainModule.size() = " + mainModule.size());

        ArrayList<String>actualModule = new ArrayList<>();
        for (WebElement eachModuleActual : mainModule) {
//            System.out.println(eachModuleActual.getText());
            actualModule.add(eachModuleActual.getText());
        }
//        System.out.println(actualModule);


//          Expected module names: Dashboards, Fleet, Customers, Sales, Activities, Marketing, Reports & Segments, System
        ArrayList<String>expectedModule = new ArrayList<>(Arrays.asList("Dashboards", "Fleet", "Customers", "Sales", "Activities", "Marketing", "Reports & Segments", "System"));
        Assert.assertEquals(actualModule,expectedModule);






    }

}
