@DsAlgoRegisterPage

Feature: Register Page Feature

Background: User launch home page of an dsalgo project
Given user opens DS Algo portal link
When user clicks the Get Started button
Then user Clicks Register Link

@RP1
Scenario: User clicks Register button with all fields empty
When The user clicks Register button with "Username","Password" and "Confirm Password" empty
Then It should display an error Please fill out this field. below Username textbox

@RP2
 Scenario: Register with Password and Password Confirmation fields empty.
 When User enters Username leaving other fields empty
 And User clicks on Register button
 Then It should display an error - Please fill out this field below Password textbox

@RP3
 Scenario: Register with Password Confirmation field empty.
 When User enters Username, Password leaving other fields empty
 And User clicks on Register button
 Then It should display an error - Please fill out this field below Confirm Password textbox

@RP4
Scenario Outline: Register with different input combinations.
When The user enters <username> , <password> , <confirm-password>
And User clicks on Register button
Then It should display a message: <status>

    Examples: 
      | username   | password  | confirm-password | status                                                  |
      | hw9%j      | Bq6n34rt  | Bq6n34rt         | Please enter a valid username.                          |
      | Rohitha    | Bq6n34@.+ | dummy.@          | password_mismatch:The two password fields didn’t match. |
      | Rohitha    | Bq6n      | Bq6n             | Password must contain at least eight characters.        |
      | Rohitha    | Rohitha   | Rohitha          | Password can not be too similar to your username.       |
      | Rohitha    |  12345678 | 12345678         | Password can not be entirely numeric.                   |
      | Rohitha    | Win24@May | Win24@May        | New Account Created. You are logged in as username.     |