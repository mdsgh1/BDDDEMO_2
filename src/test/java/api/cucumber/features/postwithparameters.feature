Feature:Post feature of Facebook
  This will test the post functionality on the user wall on Facebook
  Background: This is for teh common steps
    Given User should be logged in and should be present at its own wall

  Scenario: Post a text on user wall
    When I type the message as "My Post" in the text box
    And click on Post button
    Then the message should get posted

  Scenario: Post a video on user wall

    When User supply the YouTube link as "https://www.google.com/" in the text box
    And click on Post button
    Then the video should get posted on the user wall
    And the video should have proper thumbnail