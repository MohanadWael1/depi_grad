@RegressionTest
Feature: Test Basket Edit

  Scenario: Verify That User can edit the items in basket
    Given User Navigates to HomePage
    When  User Clicks on My Account Icon
    And   User Click on Login
    And   User Enter Email and Password "qq@qq.q" "qqqq"
    Then  Account Page appears
    When  User Navigates to HomePage
    And   User Add an item to basket
    And   User Click on Shopping Cart Icon
    And   User Change The Quantity
    And   User Refresh The Page
    Then  The Quantity Must Be Change

