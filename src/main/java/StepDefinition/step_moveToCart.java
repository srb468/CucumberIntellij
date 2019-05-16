package StepDefinition;

import Utils.ExcelUtils;
import Utils.UiUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class step_moveToCart {

    WebDriver driver;
    UiUtils UIutils = new UiUtils();
    public static HashMap<String, List> testRepo = new HashMap<String, List>();

    @Given("^we get cart object repository data$")
    public static void we_get_cart_object_repository_data() throws IOException {
        testRepo= ExcelUtils.readExcel("MoveToCart");
    }

    @Then("^user goes to non fiction section$")
    public void user_goes_to_non_fiction_section(){
        UIutils.mouseOverL2(testRepo.get("link_other").get(0).toString(),testRepo.get("link_other").get(1).toString(),testRepo.get("link_nonFiction").get(0).toString(),testRepo.get("link_nonFiction").get(1).toString());
    }
    @Then("^user selects a book and moves it to cart$")
    public void user_selects_a_book_and_moves_it_to_cart(){
        UIutils.mouseOverL2(testRepo.get("link_bookname").get(0).toString(),testRepo.get("link_bookname").get(1).toString(),testRepo.get("btn_addToCart").get(1).toString(),testRepo.get("btn_addToCart").get(1).toString());
    }
    @Then("^user validates the cart$")
    public void user_validates_the_cart(){
        UIutils.assertText("You added I Am Malala - Paperback (Used) to your shopping cart.",testRepo.get("msg_addToCart").get(0).toString(),testRepo.get("msg_addToCart").get(1).toString());
    }

}

