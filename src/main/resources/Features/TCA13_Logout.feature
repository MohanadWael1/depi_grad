@RegressionTest
Feature: Test Logout

  Scenario: User Login the Logout
    Given   User Navigates to HomePage
    And     User Clicks on My Account Icon
    And     User Clicks on Logout
    Then    Account Logout Page Apeears