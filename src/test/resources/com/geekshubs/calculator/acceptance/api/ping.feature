@API
Feature: Ping check

  Scenario: Should have a working ping check
    When I make a GET call on /calculator/api/calculator/ping
    Then I should receive 200 response status code
    And should receive a welcome message

  Scenario: Should receive a sum result
    When I make a GET call on /calculator/api/calculator/add?x=8&y=8
    Then I should receive 200 response status code
    And should receive result 16
