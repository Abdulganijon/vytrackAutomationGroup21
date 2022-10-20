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

public class TC2_verify4_module extends TestBase {

    @Test
    public void main_4module_test() throws InterruptedException {

        // main module at the Homepage
        vy_track_login.Login_function(driver,"user44", "UserUser123" );
        Thread.sleep(3000);
        List<WebElement> main4Module = driver.findElements(By.xpath("//ul[@class='nav-multilevel main-menu']/li/a/span"));
//        driver should view 4 module names.
        System.out.println("main4Module.size() = " + main4Module.size());

        ArrayList<String> actualModule = new ArrayList<>();
        for (WebElement eachModuleActual : main4Module) {
//            System.out.println(eachModuleActual.getText());
            actualModule.add(eachModuleActual.getText());
        }
//        System.out.println(actualModule);

//           drivers should view 4 module names Expected module names: Fleet, Customers, Activities, System
        ArrayList<String> expectedModule = new ArrayList<>(Arrays.asList("Fleet", "Customers", "Activities", "System"));
        Assert.assertEquals(actualModule, expectedModule);


    }


}
