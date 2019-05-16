package Utils;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UiUtils {
    static WebDriver driver = null;
    static Properties prop = null;

    public static String getProperties(String key) throws IOException {

        prop = new Properties();
        FileInputStream fIn = new FileInputStream("C:\\Workspace\\CucumberBDD\\src\\main\\java\\Resources\\global.properties");
        prop.load(fIn);
        return prop.getProperty(key);

    }

    public static void openApplication() throws IOException {

        String brName = getProperties("browser");
        if (brName.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
            driver.get(getProperties("url"));

            Assert.assertEquals(getProperties("expectedUrl"), driver.getCurrentUrl());
        } else {
            System.out.println("Improper browser name");
        }
    }

    public void click(String locatorType, String locatorValue) {
        createElement(locatorType, locatorValue).click();
    }

    public WebElement createElement(String locatorType, String locatorValue) {

        if (locatorType.equalsIgnoreCase("xpath")) {
            return driver.findElement(By.xpath(locatorValue));
        } else if (locatorType.equalsIgnoreCase("css")) {
            return driver.findElement(By.cssSelector(locatorValue));
        } else {
            return null;
        }
    }

    public void enterText(String locatorType, String locatorValue, String data) {
        createElement(locatorType, locatorValue).clear();
        createElement(locatorType, locatorValue).sendKeys(data);

    }

    public void assertURL(String expected) {
        //String currentURL = driver.getCurrentUrl();
        Assert.assertEquals(expected, driver.getCurrentUrl());
    }

    public void mouseOverL2(String L1_locatorType, String L1_locatorValue, String L2_locatorType, String L2_locatorValue) {
        WebElement l1 = createElement(L1_locatorType, L1_locatorValue);
        WebElement l2 = createElement(L2_locatorType, L2_locatorValue);

        Actions action = new Actions(driver);
        action.moveToElement(l1);
        action.moveToElement(l2).click().build().perform();

    }
    public void containsCurrentURL(String expected){
        if(driver.getCurrentUrl().contains(expected)){
            Assert.assertEquals(true,true);
        }
        else{
            Assert.assertEquals(true,false);
        }
    }
    public void assertIsDisplayed(String locatorType, String locatorValue,Boolean expected){

        Boolean isDisplayed = createElement(locatorType,locatorValue).isDisplayed();
        Assert.assertEquals(expected,isDisplayed);
    }
    public void assertText(String expected,String actual_locatorType,String actual_locatorvalue){
        String actual = createElement(actual_locatorType,actual_locatorvalue).getText().trim();
        Assert.assertEquals(expected,actual);
    }
    public void frameSwitchbyName(String frameName){
        driver.switchTo().frame(frameName);
    }

}


