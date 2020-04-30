@Web
  Feature: Search pokemon by name and number
  Scenario: User look up pokemon name and number
    Given User open google home page
    When User input "Pikachu Wikipedia Indonesia" on homepage
    And User click enter
    Then User see search result with title "Pikachu"
    When User click the first search result
    Then User see page about "Pikachu"
    And User see the Pokemon number is "025"


