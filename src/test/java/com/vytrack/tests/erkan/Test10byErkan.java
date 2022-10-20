package com.vytrack.tests.erkan;

import com.github.javafaker.Faker;
import com.vytrack.tests.erkan.utilities.TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test10byErkan extends TestCase {

    @Test
public void test1() throws InterruptedException {


    WebElement selectActivities = driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[5]/a/span"));
    selectActivities.click();



    WebElement selectCalendar = driver.findElement(By.xpath("//span[.='Calendar Events']"));
    selectCalendar.click();
    Thread.sleep(1500);
    WebElement createEvent = driver.findElement(By.xpath("//div[@class='btn-group']/a"));
    createEvent.click();
    Thread.sleep(1500);

    WebElement title= driver.findElement(By.xpath("//input[contains(@id,'title-uid-63')]"));
        Thread.sleep(1500);
    title.click();
    Faker faker= new Faker();
    title.sendKeys(faker.name().title());

    WebElement frame= driver.findElement(By.xpath("//iframe[contains(@id,'oro_calendar_event_form_description-uid')]"));
    driver.switchTo().frame(frame);

    WebElement prompt= driver.findElement(By.xpath("//body[@id='tinymce']"));
    prompt.click();

    String fakerTitle= faker.gameOfThrones().house();
    prompt.sendKeys(fakerTitle);
    driver.switchTo().parentFrame();

    driver.findElement(By.xpath("//div [@class='btn-group pull-right']/button[@type='submit']")).click();

    WebElement verifyInput= driver.findElement(By.tagName("p"));
    Assert.assertEquals(fakerTitle,verifyInput.getText());

}
}

