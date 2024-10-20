@RegressionTest
Feature: Test Adding Items to WhishList

  Scenario Outline:User Add four Items listed in HomePage
    Given User Navigates to HomePage
    When   User Add  Items in Homepage to WhishList "<items>"
    Then  Number of Items is presented on Homepage "<items>"

    Examples:
    |items|
    |1    |
    |2    |
    |3    |
    |4    |
    |     |
