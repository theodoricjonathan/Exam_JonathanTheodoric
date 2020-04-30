@Android
Feature: Refresh to do list
  Scenario: Refresh list
    Given User was on to do list page
    When User click three dot menu
    And User click Refresh
    Then User see the list