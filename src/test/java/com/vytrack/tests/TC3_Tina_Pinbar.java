package src.test.java.com.vytrack.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC3_Tina_Pinbar {
    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = com.vytrack.utilities.WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void TestDriver44() throws InterruptedException {
        driver.get("https://qa1.vytrack.com/user/login");
        com.vytrack.utilities.logIn.crm_login(driver, "user44", "UserUser123");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement learnHow = driver.findElement(By.xpath("//a[.='Learn how to use this space']"));
        learnHow.click();

        WebElement howToUsePinbar = driver.findElement(By.xpath("//div[@class='clearfix']/h3"));

        WebElement usePinIcon = driver.findElement(By.xpath("//div[@class='clearfix']/p[1]"));

        String expected1 = "How To Use Pinbar";
        String actual1 = howToUsePinbar.getText();

        String expected2 = "Use pin icon on the right top corner of page to create fast access link in the pinbar.";
        String actual2 = usePinIcon.getText();

        Assert.assertEquals(actual1, expected1);
        Assert.assertEquals(actual2, expected2);

    }

    @Test
    public void TestDriver49() throws InterruptedException {
        driver.get("https://qa1.vytrack.com/user/login");
        com.vytrack.utilities.logIn.crm_login(driver, "user49", "UserUser123");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement learnHow = driver.findElement(By.xpath("//a[.='Learn how to use this space']"));
        learnHow.click();

        WebElement howToUsePinbar = driver.findElement(By.xpath("//div[@class='clearfix']/h3"));

        WebElement usePinIcon = driver.findElement(By.xpath("//div[@class='clearfix']/p[1]"));

        String expected1 = "How To Use Pinbar";
        String actual1 = howToUsePinbar.getText();

        String expected2 = "Use pin icon on the right top corner of page to create fast access link in the pinbar.";
        String actual2 = usePinIcon.getText();

        Assert.assertEquals(actual1, expected1);
        Assert.assertEquals(actual2, expected2);

    }

    @Test
    public void TestStoreManager75() throws InterruptedException {
        driver.get("https://qa1.vytrack.com/user/login");
        com.vytrack.utilities.logIn.crm_login(driver, "storemanager75", "UserUser123");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement learnHow = driver.findElement(By.xpath("//a[.='Learn how to use this space']"));
        learnHow.click();

        WebElement howToUsePinbar = driver.findElement(By.xpath("//div[@class='clearfix']/h3"));

        WebElement usePinIcon = driver.findElement(By.xpath("//div[@class='clearfix']/p[1]"));

        String expected1 = "How To Use Pinbar";
        String actual1 = howToUsePinbar.getText();

        String expected2 = "Use pin icon on the right top corner of page to create fast access link in the pinbar.";
        String actual2 = usePinIcon.getText();

        Assert.assertEquals(actual1, expected1);
        Assert.assertEquals(actual2, expected2);
    }

    @Test
    public void TestStoreManager78() throws InterruptedException {
        driver.get("https://qa1.vytrack.com/user/login");
        com.vytrack.utilities.logIn.crm_login(driver, "storemanager78", "UserUser123");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement learnHow = driver.findElement(By.xpath("//a[.='Learn how to use this space']"));
        learnHow.click();

        WebElement howToUsePinbar = driver.findElement(By.xpath("//div[@class='clearfix']/h3"));

        WebElement usePinIcon = driver.findElement(By.xpath("//div[@class='clearfix']/p[1]"));

        String expected1 = "How To Use Pinbar";
        String actual1 = howToUsePinbar.getText();

        String expected2 = "Use pin icon on the right top corner of page to create fast access link in the pinbar.";
        String actual2 = usePinIcon.getText();

        Assert.assertEquals(actual1, expected1);
        Assert.assertEquals(actual2, expected2);
    }

    @Test
    public void TestSalesManager133() throws InterruptedException {
        driver.get("https://qa1.vytrack.com/user/login");
        com.vytrack.utilities.logIn.crm_login(driver, "salesmanager133", "UserUser123");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement learnHow = driver.findElement(By.xpath("//a[.='Learn how to use this space']"));
        learnHow.click();

        WebElement howToUsePinbar = driver.findElement(By.xpath("//div[@class='clearfix']/h3"));

        WebElement usePinIcon = driver.findElement(By.xpath("//div[@class='clearfix']/p[1]"));

        String expected1 = "How To Use Pinbar";
        String actual1 = howToUsePinbar.getText();

        String expected2 = "Use pin icon on the right top corner of page to create fast access link in the pinbar.";
        String actual2 = usePinIcon.getText();

        Assert.assertEquals(actual1, expected1);
        Assert.assertEquals(actual2, expected2);
    }

    @Test
    public void TestSalesManager136() throws InterruptedException {
        driver.get("https://qa1.vytrack.com/user/login");
        com.vytrack.utilities.logIn.crm_login(driver, "salesmanager136", "UserUser123");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement learnHow = driver.findElement(By.xpath("//a[.='Learn how to use this space']"));
        learnHow.click();

        WebElement howToUsePinbar = driver.findElement(By.xpath("//div[@class='clearfix']/h3"));

        WebElement usePinIcon = driver.findElement(By.xpath("//div[@class='clearfix']/p[1]"));

        String expected1 = "How To Use Pinbar";
        String actual1 = howToUsePinbar.getText();

        String expected2 = "Use pin icon on the right top corner of page to create fast access link in the pinbar.";
       String actual2 = usePinIcon.getText();

        Assert.assertEquals(actual1, expected1);
        Assert.assertEquals(actual2, expected2);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
