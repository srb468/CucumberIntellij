Feature: Add company feature
  Background:
    Given we load add company object repository data
  Scenario: Add company scanerio
    #Given user is on add contact page
    When user fills the add contact form with data in excel at "C:\Workspace\CucumberBDD\src\main\java\Resources\TestData.xlsx"