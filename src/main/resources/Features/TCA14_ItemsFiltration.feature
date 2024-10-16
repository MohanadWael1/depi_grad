Feature: Test Change Sorting Method

  Scenario: Verify Sort By field is working
    Given User Navigates to HomePage
    When User Click On Phones Category
    And User Click On Sort By
    And User Click On Price Option
    Then The Items Must Be Sorted