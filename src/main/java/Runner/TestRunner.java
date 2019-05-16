package Runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"C:\\Workspace\\CucumberBDD\\src\\main\\java\\Feature\\aa_login.feature","C:\\Workspace\\CucumberBDD\\src\\main\\java\\Feature\\addCompany.feature"},glue = {"StepDefinition"},
format = {"pretty","html:Test-Output","json:Output-JSON/cucumber.json"},monochrome =true,dryRun = false)
public class TestRunner {

}
