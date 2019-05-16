$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Workspace/CucumberBDD/src/main/java/Feature/aa_login.feature");
formatter.feature({
  "line": 1,
  "name": "Login feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "we get object repository data",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDef_Login.we_get_object_repository_data()"
});
formatter.result({
  "duration": 1074816327,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login test scanerio",
  "description": "",
  "id": "login-feature;login-test-scanerio",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password and logs in",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user is on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef_Login.User_is_on_login_Page()"
});
formatter.result({
  "duration": 15505252411,
  "status": "passed"
});
formatter.match({
  "location": "stepDef_Login.user_enters_username_and_password_and_logs_in()"
});
formatter.result({
  "duration": 12264685061,
  "status": "passed"
});
formatter.match({
  "location": "stepDef_Login.user_is_on_dashboard_page()"
});
formatter.result({
  "duration": 30146195,
  "status": "passed"
});
formatter.uri("C:/Workspace/CucumberBDD/src/main/java/Feature/addCompany.feature");
formatter.feature({
  "line": 1,
  "name": "Add company feature",
  "description": "",
  "id": "add-company-feature",
  "keyword": "Feature"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "we load add company object repository data",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDef_addCompany.we_load_add_company_object_repository_data()"
});
formatter.result({
  "duration": 132032366,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Add company scanerio",
  "description": "",
  "id": "add-company-feature;add-company-scanerio",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 5,
      "value": "#Given user is on add contact page"
    }
  ],
  "line": 6,
  "name": "user fills the add contact form with data in excel at \"C:\\Workspace\\CucumberBDD\\src\\main\\java\\Resources\\TestData.xlsx\"",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "C:\\Workspace\\CucumberBDD\\src\\main\\java\\Resources\\TestData.xlsx",
      "offset": 55
    }
  ],
  "location": "stepDef_addCompany.user_fills_the_add_contact_form_with_data_in_excel_at(DataTable)"
});
formatter.result({
  "duration": 74671644907,
  "error_message": "java.lang.RuntimeException\r\n\tat Utils.ExcelDataToDataTable.getExcelData(ExcelDataToDataTable.java:54)\r\n\tat Utils.ExcelDataToDataTable.transform(ExcelDataToDataTable.java:23)\r\n\tat Utils.ExcelDataToDataTable.transform(ExcelDataToDataTable.java:17)\r\n\tat cucumber.api.Transformer.fromString(Transformer.java:91)\r\n\tat cucumber.runtime.ParameterInfo.convert(ParameterInfo.java:164)\r\n\tat cucumber.runtime.StepDefinitionMatch.transformedArgs(StepDefinitionMatch.java:68)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\r\n\tat ✽.When user fills the add contact form with data in excel at \"C:\\Workspace\\CucumberBDD\\src\\main\\java\\Resources\\TestData.xlsx\"(C:/Workspace/CucumberBDD/src/main/java/Feature/addCompany.feature:6)\r\n",
  "status": "failed"
});
});