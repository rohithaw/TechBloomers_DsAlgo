@DSALGO @SignIn
Feature: Testing the Sign In functionality of Ds Algo application

  Background: 
    Given User enters homepage url
    When User Clicks on Get Started button
    And User clicks on the Sign in link

  @Sip1
  Scenario Outline: To validate successfull login message by entering valid username and password
    When Click on Login with Valid Username and Password
    Then You are logged in message should be displayed

    Examples: 
      | Username | Password  |
      | Numpy4   | Testers@4 |

  @Sip2
  Scenario Outline: User on login page and login with invalid inputs from Excel
    Given The user is on signin page
    When The user enter sheet "<Sheetname>" and <RowNumber>
    Then click login button to verify error Message

    Examples: 
      | Sheetname | RowNumber |
      | Login     |         0 |
      | Login     |         1 |
      | Login     |         2 |

  @Sip3
  Scenario Outline: User on login page and login with invalid username and Password combination inputs from Excel
    Given The user is on signin page
    When The user enter sheet "<Sheetname>" and <RowNumber>
    Then click login button to display login message

    Examples: 
      | Sheetname | RowNumber |
      | Login     |         3 |
      | Login     |         4 |
      | Login     |         5 |
      | Login     |         6 |
