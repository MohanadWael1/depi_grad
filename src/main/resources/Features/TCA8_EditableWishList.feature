@RegressionTest
Feature: Test Basket Edit

  Scenario: Verify That User can edit the items in basket
    Given User Navigates to HomePage
    When  User Click on Wish List Icon
    And   Check The Pre-edit Wish List State
    And   User Navigates to HomePage
    And   User Add  Items to Wish List
    And   User Click on Wish List Icon
    And   Check The Post-edit Wish List State
    Then  The Wish List Must be change

