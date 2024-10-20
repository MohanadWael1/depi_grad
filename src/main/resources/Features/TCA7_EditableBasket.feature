@RegressionTest
Feature: Test Basket Edit

  Scenario: Verify That User can edit the items in basket
    Given User Navigates to HomePage
    When  User Click on Shopping Cart Icon
    And   Check The Pre-edit State
    And   User Navigates to HomePage
    And   User Add an item to basket
    And   User Click on Shopping Cart Icon
    And   Check The Post-edit State
    Then  The Shopping Cart Must be change

