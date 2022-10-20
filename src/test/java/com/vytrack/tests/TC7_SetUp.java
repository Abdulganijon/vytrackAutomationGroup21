package src.test.java.com.vytrack.tests;

import com.vytrack.utilities.Driver;
import com.vytrack.utilities.logIn;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;

public class TC7_SetUp {
    @BeforeTest
    public void setUp(){
        Driver.getDriver();
    }
   @Test (priority = 1)
    public void driverUser44TC1(){
       logIn.loginAsDriver();

       WebElement selectFleet = Driver.getDriver().findElement(By.xpath("//div[@id='main-menu']/ul/li[1]/a/span"));
       selectFleet.click();

        WebElement selectVehicle = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']"));
        selectVehicle.click();

       try {
           WebElement verifyUncheckedBoxes = Driver.getDriver().findElement(By.xpath("//table[@class]/tbody//tr//td/input"));
           System.out.println("Verify if all checkboxes are selected: " + verifyUncheckedBoxes.isSelected());
       }catch (Exception e){
           System.out.println("No CheckBox Button could be found");
       }
         Driver.closeDriver();
}

    @Test (priority = 2)
    public void storeManagerUser75TC2() throws InterruptedException {
       logIn.loginAsStoreManger();
        WebElement selectFleet1 = Driver.getDriver().findElement(By.xpath("//div[@id='main-menu']/ul/li[2]/a/span"));
        Thread.sleep(5000);
        selectFleet1.click();

        WebElement selectVehicle1 = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']"));
        selectVehicle1.click();

        WebElement clickFirstCheckbox = Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-default btn-small dropdown-toggle']/input"));
        Thread.sleep(5000);
        clickFirstCheckbox.click();

        List<WebElement> listOfAllCheckBoxes = Driver.getDriver().findElements(By.xpath("//table[@class]/tbody//tr//td/input"));
        int countOfCheckBoxes= listOfAllCheckBoxes.size();
        int count = 0;
        for (WebElement eachCheckBox : listOfAllCheckBoxes) {
            if(eachCheckBox.isSelected()){
                count++;
            }
        }
        Assert.assertEquals(countOfCheckBoxes,count);
        System.out.println("countOfCheckBoxes = " + countOfCheckBoxes);
        System.out.println("count = " + count);
        Driver.closeDriver();
    }

    @Test (priority = 3)
    public void salesManagerUser133TC3() throws InterruptedException {
        logIn.loginAsSalesManager();

        WebElement selectFleet1 = Driver.getDriver().findElement(By.xpath("//div[@id='main-menu']/ul/li[2]/a/span"));
        Thread.sleep(5000);
        selectFleet1.click();

        WebElement selectVehicle1 = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']"));
        selectVehicle1.click();

        WebElement clickAnyCarsCheckbox = Driver.getDriver().findElement(By.xpath("(//table[@class]/tbody//tr//td/input)[4]"));
        Thread.sleep(3000);
        clickAnyCarsCheckbox.click();
       Assert.assertTrue(clickAnyCarsCheckbox.isSelected());
        System.out.println("clickAnyCarsCheckbox.isSelected() = " + clickAnyCarsCheckbox.isSelected());
        Driver.closeDriver();

    }

}
