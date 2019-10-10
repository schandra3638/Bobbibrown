Feature: My Account

  Scenario: Return User Sign-in
    Given User is on Sign-in Page
    Then Enter username "csstester114@gmail.com"
    Then Enter Password "Tester@123"
    Then Click on Sign-in button
    And Verify whether user is on Account landing page
    Then Click on Sign-out link

  Scenario: Create New User Account
    Given User is on Sign-in Page
    Then Enter username "csstester114@gmail.com"
    Then Enter Password "Tester@123"
    Then Click on Sign-in button
    And Verify whether user is on Account landing page
    Then Click on Sign-out link

 
