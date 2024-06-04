@DSALGO
Feature: Stack Feature

  Background: User is Signed-in and navigates to Stack Page
    Given User enters homepage url
    When User Clicks on Get Started button
    And User clicks on the Sign in link
    And Click on Login with Valid Username and Password
    And Click on the Get Started button for Stack Datastructures

  @SF1
  Scenario: Stack
    When User select Stack from the drop down menu
    Then User should be navigated to the stack page
    And User clicks on Operations in Stack on Stack Page
    Then user clicks on the Practice Questions on Stack Page
    And user navigates to the blank page on Stack Page

  @SF2
  Scenario Outline: Checking the Topics Covered
    When User clicks on "<name>" link in Stack Page
    Then user should be redirected to that "<name>" page in Stack Page
    And User clicks on Try here button in Stack Page
    And user should be redirected to a page having a tryEditor with a Run button to test in Stack Page

    Examples: 
      | name                |
      | Operations in Stack |
      | Implementation      |
      | Applications        |

  @SF3
  Scenario Outline: The user is able to run code in tryEditor for Stack page
    Given User clicks on "<name>" link in Stack Page
    And User clicks on Try here button in Stack Page
    When The user enters a valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> in Stack Page
    Then The user clicks on run button in Stack Page
    And The user should be presented with Run result in Stack Page

    Examples: 
      | name                | Sheetname       | RowNumber |
      | Operations in Stack | StackpythonCode |         0 |
      | Implementation      | StackpythonCode |         0 |
      | Applications        | StackpythonCode |         0 |

  @SF4
  Scenario Outline: The user gets error with invalid code in tryEditor for Stack page
    When User clicks on "<name>" link in Stack Page
    And User clicks on Try here button in Stack Page
    When User enters a invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> in Stack Page
    Then User clicks on run button in Stack Page
    And User should be presented with Error popup in Stack Page

    Examples: 
      | name                | Sheetname       | RowNumber |
      | Operations in Stack | StackpythonCode |         1 |
      | Implementation      | StackpythonCode |         1 |
      | Applications        | StackpythonCode |         1 |
