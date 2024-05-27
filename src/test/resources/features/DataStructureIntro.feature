@DSI
Feature: DataStructure-Introduction page feature

  Background: User checks Get Started in DS Pane
    Given User enters homepage url
    When User Clicks on Get Started button
    And User clicks on the Sign in link
    And Clicks on Login
    When User finds the DataStructure pane and clicks on Get Started button
    Then User navigated to Datastructure-Introductuion page

  @DSI1
  Scenario: User checks Time Complexity link in Data Structure - Introduction page
    When User clicks on Time Complexity button
    Then User should be navigated to Time Complexity page

  @DSI2
  Scenario: User clicks on Try Here button in Time Complexity link for valid Code
    When User clicks on Time Complexity button
    And User should be navigated to Time Complexity page
    Then User clicks on Try Here button
    And enters validcode and clicks on Run button
    Then User sees the output

  @DSI3
  Scenario: User clicks on Try Here button in Time Complexity link for Invalid Code
    When User clicks on Time Complexity button
    And User should be navigated to Time Complexity page
    Then User clicks on Try Here button
    And enters Invalidcode and clicks on run button
    Then The user should be presented with Error popup

  @DSI3
  Scenario: User clicks on Practice questions link in Time complexity Data page
    When User clicks on Time Complexity button
    And User clicks on Practice questions
    Then User should be navigated to Blank page
