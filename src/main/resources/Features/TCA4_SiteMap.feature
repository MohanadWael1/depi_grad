@RegressionTest
Feature: Test Site Map Page

  Scenario: Verify user can navigate website through Site Map
    Given User Navigates to HomePage
    When  User Click on Site Map
    Then  User must be in Site Map page
    When  User click on a specific option
    Then  User must navigate to its location