@WIP
Feature: test search google

  Background:
    Given I open google search

  @tagA
  Scenario: Search web
    When I enter keyword as following
    Then I see web results

  @tagB
  Scenario: Search image
    When I enter image name as following
    Then I see image results

  @tagC
  Scenario Outline: sdd
    When I test
    Examples:
      | a | b | c |
      | a | b | c |