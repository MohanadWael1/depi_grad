Feature: Test Item's Icon Information

  Scenario: Verify That Item's information for logged user can be shown
    Given User Navigates to HomePage
    When  User Clicks on My Account Icon
    And   User Click on Login
    And   User Enter Email and Password "h@h.c" "hhhh"
    Then  Account Page appears
    When User Click on Item's Icon
    Then The Pre-adding cost must be shown
    When User Navigates to HomePage
    And User Add an item to basket
    And User Click on Item's Icon
    Then The Post-adding cost must be different from Pre-adding cost