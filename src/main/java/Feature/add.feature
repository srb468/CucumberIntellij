Feature: Add contacts feature
  Scenario: Add contacts scanerio
    Given User is already on Login Page
    When title of login page is free CRM
    Then user enters username and password and logs in
      |singh.saurabh5686@gmail.com|Mail@1990|
    Then user is on home page
    Then user move to new contacts page
    Then user enters contacts details firstname and lastname and validate process
      |saurabh|singh|
      |vaibhav|singh|
    And user close browser


