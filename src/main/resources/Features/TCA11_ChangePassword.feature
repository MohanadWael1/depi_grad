@RegressionTest
Feature: Test Change Password Functionality
  Scenario: User Change password to a new one then gets his old password again
    Given   User Navigates to HomePage
    When    User Clicks on My Account Icon
    And     User Click on My Account Info
    And     User Navigate to Change your password page
    And     User Enters New Password "ffff" and press continue
    Then    Updating Password successfully message appears
    And     User Navigate to Change your password page
    And     User Enters New Password "qqqq" and press continue
    Then    Updating Password successfully message appears
