package StepDefinition;

import Utils.ExcelUtils;
import Utils.UiUtils;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import sun.plugin.util.UIUtil;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class step_AddContacts {

    WebDriver driver;
    UiUtils UIutils = new UiUtils();
    public static HashMap<String, List> testRepo = new HashMap<String, List>();

    @Given("^we load object repository data$")
    public static void we_load_object_repository_data() throws IOException {
        testRepo= ExcelUtils.readExcel("addContacts");
    }

    @Given("^User is on homepage and goes to add company page$")
    public void user_goes_to_non_fiction_section(){
        UIutils.frameSwitchbyName("mainpanel");
        UIutils.mouseOverL2(testRepo.get("btn_company").get(0).toString(),testRepo.get("btn_company").get(1).toString(),testRepo.get("btn_newcompany").get(0).toString(),testRepo.get("btn_newcompany").get(1).toString());
    }
    @Then("^user fills the form$")
    public void user_fills_the_form(DataTable formaData) throws InterruptedException {
        List<Map<String, String>> data = formaData.asMaps(String.class, String.class);
        for (int i=0;i<data.size();i++) {
            System.out.println(data.get(i).get("ContactName"));
            UIutils.enterText(testRepo.get("text_companyName").get(0).toString(), testRepo.get("text_companyName").get(1).toString(), data.get(i).get("ContactName"));
            UIutils.enterText(testRepo.get("text_industry").get(0).toString(), testRepo.get("text_industry").get(1).toString(), data.get(i).get("Industry"));
            UIutils.enterText(testRepo.get("text_revenue").get(0).toString(), testRepo.get("text_revenue").get(1).toString(), data.get(i).get("Revenue"));
            UIutils.click(testRepo.get("btn_Save").get(0).toString(), testRepo.get("btn_Save").get(1).toString());
            //UIutils.frameSwitchbyName("mainpanel");
            UIutils.mouseOverL2(testRepo.get("btn_company").get(0).toString(),testRepo.get("btn_company").get(1).toString(),testRepo.get("btn_newcompany").get(0).toString(),testRepo.get("btn_newcompany").get(1).toString());
            Thread.sleep(2000);
        }
        }
}
