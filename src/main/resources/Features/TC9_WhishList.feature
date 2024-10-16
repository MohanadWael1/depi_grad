@RegressionTest
Feature: Test Adding Items to WhishList

  Scenario Outline:User Add four Items listed in HomePage
    Given User Navigates to HomePage
    When  User Clicks on My Account Icon
    And   User Click on Login
    And   User Enter Email and Password "qq@qq.q" "qqqq"
    And   User Clicks on HomePage
    And   User Add  Items in Homepage to WhishList "<items>"
    Then  Number of Items is presented on Homepage "<items>"

    Examples:
    |items|
    |1    |
    |2    |
    |3    |
    |4    |
    |     |
