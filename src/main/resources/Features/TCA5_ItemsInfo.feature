@RegressionTest
Feature: Test Item's Icon Information

  Scenario: Verify That Item's information for logged user can be shown
    Given User Navigates to HomePage
    When  User Clicks on My Account Icon
    And   User Click on Login
    And   User Enter Email and Password "qq@qq.q" "qqqq"
    Then  Account Page appears
    When  User Click on Item's Icon
    Then  User must show information about chose items