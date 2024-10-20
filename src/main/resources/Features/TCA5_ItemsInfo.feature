@RegressionTest
Feature: Test Item's Icon Information

  Scenario: Verify That Item's information for logged user can be shown
    Given User Navigates to HomePage
    When  User Click on Item's Icon
    Then  User must show information about chose items