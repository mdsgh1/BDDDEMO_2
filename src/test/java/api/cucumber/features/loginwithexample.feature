Feature: Login Action

  Scenario Outline: Successful Login with Valid Credentials

    Given User is on home page
    When User navigates to login page
    And user enters "<username>" and "<password>"
    Then Message displayed login succesfully
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |


