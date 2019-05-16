Feature: Move to cart
  Background:
    Given we get cart object repository data
  Scenario: Move to cart a Non-Fiction book
    Given User has logged in
    Then user goes to non fiction section
    Then user selects a book and moves it to cart
    Then user validates the cart


