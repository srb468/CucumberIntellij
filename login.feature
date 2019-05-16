Feature: Login feature
  Background:
    Given we get object repository data
  Scenario: Login test scanerio
    Given User is on home Page
    Then user goes to login page
    Then user enters username and password and logs in
    Then user is on home page


