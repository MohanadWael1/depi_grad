@RegressionTest
Feature: Test Categories Hovering

  Scenario: Hover Main and Sub Categories Randomly
    Given User Navigates to HomePage
    When  User Hover On Category Randomly
    Then  The category should display a shadow behind it