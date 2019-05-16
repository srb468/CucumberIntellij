Feature: Login feature
  Background:
    Given we get object repository data
  Scenario: Login test scanerio
    Given User is on login Page
    Then user enters username and password and logs in
    Then user is on dashboard page


