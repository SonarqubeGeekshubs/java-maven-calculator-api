@API
Feature: Ping check

  Scenario: Should have a working ping check
    When I make a GET call on /calculator/api/calculator/ping
    Then I should receive 200 response status code
    And should receive a welcome message

  Scenario Outline: Should receive a sum result for
    When I make a GET call on /calculator/api/calculator/add?x=<first>&y=<second>
    Then I should receive 200 response status code
    And should receive result <result>

    Examples:
      | first | second | result |
      | -2    | 3      | 1      |
      | 10    | 15     | 25     |
      | 99    | -99    | 0      |
      | -1    | -10    | -11    |
