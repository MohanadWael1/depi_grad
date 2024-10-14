Feature: Test Search bar

  Scenario: Verify user can search on an element
    Given User Navigates to HomePage
    When User Click on search box and write a specific product to search
    And User Click on Search Icon
    Then The search result must be shown