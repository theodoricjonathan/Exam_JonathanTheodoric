@Android
Feature: Filter completed to do list
  Scenario: Filter completed list
    Given User were at to do list page
    When User click filter menus
    And User click Completed
    Then User see completed to do list