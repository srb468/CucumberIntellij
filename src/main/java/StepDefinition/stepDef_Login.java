package StepDefinition;

import Utils.ExcelUtils;
import Utils.UiUtils;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.plugin.util.UIUtil;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class stepDef_Login{
    WebDriver driver;
    UiUtils UIutils = new UiUtils();
    public static HashMap<String, List> testRepo = new HashMap<String, List>();

    @Given("^we get object repository data$")
    public static void we_get_object_repository_data() throws IOException {
        testRepo= ExcelUtils.readExcel("Login");
    }

    @Given("^User is on login Page$")
    public void User_is_on_login_Page() throws Throwable {
        UIutils.openApplication();
    }


    @Then("^user enters username and password and logs in$")
    public void user_enters_username_and_password_and_logs_in() throws IOException, InterruptedException {
        UIutils.enterText(testRepo.get("text_email").get(0).toString(), testRepo.get("text_email").get(1).toString(),UIutils.getProperties("username"));
        UIutils.enterText(testRepo.get("text_password").get(0).toString(), testRepo.get("text_password").get(1).toString(), UIutils.getProperties("password"));
        Thread.sleep(3000);

        /*WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(testRepo.get("btn_login").get(1).toString())));
        ele.click();*/
        UIutils.click(testRepo.get("btn_login").get(0).toString(), testRepo.get("btn_login").get(1).toString());
    }

    @Then("^user is on dashboard page$")
    public void user_is_on_dashboard_page() throws IOException {
      /*  String a= driver.getCurrentUrl();
        if (a.contains("https://www.crmpro.com/index.cfm?CFID")){
            Assert.assertEquals(true,true);
        }
        else{
            Assert.assertEquals(true,false);
        }*/
        UIutils.containsCurrentURL("https://www.crmpro.com/index.cfm?CFID");

        //driver.switchTo().frame("mainpanel");
        //UIutils.assertText("User: royal jatt",testRepo.get("text_username").get(0).toString(), testRepo.get("text_username").get(1).toString());

    }
}