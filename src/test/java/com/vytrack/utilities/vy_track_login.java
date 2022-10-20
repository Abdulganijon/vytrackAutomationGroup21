package com.vytrack.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class vy_track_login {
    public static void Login_function(WebDriver driver) {
        // login button
        WebElement loginBox = driver.findElement(By.id("prependedInput"));
        loginBox.sendKeys("storemanager75");
        // password button
        WebElement passwordBox = driver.findElement(By.id("prependedInput2"));
        passwordBox.sendKeys("UserUser123");
        //LOG IN button
        WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        loginBtn.click();

    }

    public static void Login_function(WebDriver driver, String userName, String password){
        // login button
        WebElement loginBox = driver.findElement(By.id("prependedInput"));
        loginBox.sendKeys(userName);
        // password button
        WebElement passwordBox = driver.findElement(By.id("prependedInput2"));
        passwordBox.sendKeys(password);
        //LOG IN button
        WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        loginBtn.click();
    }




}
