Feature: Add contact using example
  Scenario Outline: Add contact using example
    Given User is already on Login Page
    When title of login page is free CRM
    Then user enters username and password and logs in
    Then user is on home page
    Then user move to new contacts page
    Then user enters contacts details "<firstname>" and "<lastname>"
    And user close browser
    Examples:
      |firstname|lastname|
      |saurabh|singh|
      |vaibhav|singh|
