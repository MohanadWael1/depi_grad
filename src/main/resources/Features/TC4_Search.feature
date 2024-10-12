Feature: Test Search

  Scenario Outline: User Search For Any Product and Change Currencies and add Items to Wishlist
    Given User Navigates to HomePage
    When  User Clicks on My Account Icon
    And   User Click on Login
    And   User Enter Email and Password "h@h.c" "hhhh"
    And   User Enter Product in search "<search_text>"
    Then  Assert Search Page Appearance of "<search_text>"

    Examples:
    |search_text|
    | Iphone    |
    |Samsung    |
    |           |