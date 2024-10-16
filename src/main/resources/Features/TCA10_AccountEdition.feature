Feature: Test Account Info Edition

  Scenario: User Change Account Information and then return it back
    Given   User Navigates to HomePage
    When    User Clicks on My Account Icon
    And     User Click on Login
    And     User Enter Email and Password "qq@qq.q" "qqqq"
    And     User Navigate to Edit account information page
    And     User Change Credentials to "Mahmoud" , "Khaled" and press Continue button
    Then    Account Edition Message Appears
    And     User Navigate to Edit account information page
    And     User Change Credentials to "qqq" , "qqq" and press Continue button
    Then    Account Edition Message Appears

