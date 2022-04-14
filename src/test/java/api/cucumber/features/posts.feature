Feature:Post feature of Facebook
  This will test the post functionality on the user wall on Facebook
  @SmokeTest
  Scenario: Post a text on user wall
    Given User should be logged in
    And Should be present at its own wall
    When I type the text in the text box
    And click on Post button
    Then the message should get posted

  Scenario: Post a text on user wall
    Given User should be logged in
    And Should be present at its own wall
    When User supply the YouTube link in the text box
    And click on Post button
    Then the video should get posted on the user wall
    And the video should have proper thumbnail



