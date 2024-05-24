@DsAlgoRegisterPage

Feature: Register Page Feature

Background: User launch home page of an dsalgo project
Given User enters homepage url
When User Clicks on Get Started button
Then User clicks on the Register Link

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
When user enters username password confirm-password and click Register with below status message
 
      | username   | password  | confirm-password | status                                                  |
      | hw9%j      | Bq6n34rt  | Bq6n34rt         | Please enter a valid username.                          |
      | Rohitha    | Bq6n34@.+ | dummy.@          | password_mismatch:The two password fields didn’t match. |
      | Rohitha    | Bq6n      | Bq6n             | Password must contain at least eight characters.        |
      | Rohitha    | Rohitha   | Rohitha          | Password can not be too similar to your username.       |
      | Rohitha    |  12345678 | 12345678         | Password can not be entirely numeric.                   |
      | ninja2026  | Tech@2024 | Tech@2024        | New Account Created. You are logged in as username.     |
      
 