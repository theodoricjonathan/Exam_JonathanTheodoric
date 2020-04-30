@Android
  Feature: Filter active to do list
    Scenario: Filter active list
      Given User on to do list page
      When User click filter menu
      And User click Active
      Then User see active to do list