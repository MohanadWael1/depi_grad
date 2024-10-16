@RegressionTest
Feature: Test Moving Through Breadcrumb

  Scenario: Select a Category Randomly Then return to Home Page
    Given User Navigates to HomePage
    When  User Click On Category Randomly
    Then  The Chosen Category Page Will Be Shown
    When  User Click on HomePage Icon In Breadcrumb
    Then  User Must be In Home Page