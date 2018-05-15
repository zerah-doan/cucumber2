Feature: test google page functionality

  @TagA
  Scenario: Search simple word
#    Given I open google search
    When I click result number result_number
      | result_number |
      | 5             |
      | 10            |


  @TagB
  Scenario: Search simple word
    Given I open yahoo search