package StepDefinition;

import Utils.ExcelDataToDataTable;
import Utils.ExcelUtils;
import Utils.UiUtils;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class stepDef_addCompany {

    WebDriver driver;
    UiUtils UIutils = new UiUtils();
    public static HashMap<String, List> testRepo = new HashMap<String, List>();

    @Given("^we load add company object repository data$")
    public static void we_load_add_company_object_repository_data() throws IOException {
        testRepo= ExcelUtils.readExcel("addCompany");
    }

   /* @Given("^user is on add contact page$")
    public void user_is_on_add_contact_page() throws Throwable {
        testRepo= ExcelUtils.readExcel("addContacts");
    }*/

    @When("^user fills the add contact form with data in excel at \"([^\"]*)\"$")
    public void user_fills_the_add_contact_form_with_data_in_excel_at(@Transform(ExcelDataToDataTable.class)DataTable table) throws Throwable {
    System.out.println(table.toString());

        List<String> dataList = table.asList(String.class);
        for(int i =0;i<dataList.size();i++){
            System.out.println(dataList.get(i));

        }
    }

}
