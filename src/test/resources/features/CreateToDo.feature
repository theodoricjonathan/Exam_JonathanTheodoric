@Android
Feature: Add to do task
  Scenario: Add task
    Given User is on to do list page
    When User click add task
    And User input "abc"
    Then User click done