Feature: Add contacts feature
  Background:
    Given we load object repository data
  Scenario: Add contacts scanerio
    Given User is on homepage and goes to add company page
    Then user fills the form
    |ContactName|Industry|Revenue   |
    |gemalto    |software|100000    |
    |sterlite   |software|55555555  |
    |elitecore  |software|6646464   |