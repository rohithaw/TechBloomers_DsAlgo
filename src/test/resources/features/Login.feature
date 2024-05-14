@DSALGO @SignIn
Feature: Testing the Sign In functionality of Ds Algo application

  Background: 
    Given User enters homepage url
    When User Clicks on Get Started button
    And User clicks on the Sign in link
    
    	@Sip1
  Scenario Outline: To validate successfull login message by entering valid username and password
    And Type Valid <Username> and <Password>
    And Clicks on Login
    Then You are logged in message should be displayed

    Examples: 
      | Username  | Password       |
      |  Numpy4   |  Testers@4     |
    
