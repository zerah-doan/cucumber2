Feature: Test debugging node

  Scenario: Open browser and run
    Given I open google search
    When I enter keyword as following
    Then I see image results