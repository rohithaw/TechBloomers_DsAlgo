Feature: Graph Feature

  Background: User is Signed-in and navigates to Graph Page
    Given User enters homepage url
    When User Clicks on Get Started button
    And User clicks on the Sign in link
     And Click on Login with Valid Username and Password
    When Clicks on the Get Started button for Graph Datastructures

  @G1
  Scenario: Graph
    When User select Graph from the drop down menu
    Then User should be navigated to the graph page
    And User clicks on Graph on Graph Page
    Then user clicks on the Practice Questions on Graph Page
    And user navigates to the blank page on Graph Page

  @G2
  Scenario Outline: Checking the Topics Covered
    Given User clicks on "<name>" link in Graph Page
    Then user should be redirected to that "<name>" link in Graph Page
    And User clicks on Try here button in Graph Page
    And user should be redirected to a page having an tryEditor with a Run button to test in Graph Page

    Examples: 
      | name                  |
      | Graph                 |
      #| Graph Representations |

  #Scenario Outline: The user is able to run code in tryEditor for Graph page
    #Given User clicks on "<name>" link in Graph Page
    #And User clicks on Try here button in Graph Page
    #When The user enters a valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> in Graph Page
    #Then The user clicks on run button in Graph Page
    #And The user should be presented with Run result in Graph Page
#
    #Examples: 
      #| name                  | Sheetname       | RowNumber |
      #| Graph                 | GraphpythonCode |         0 |
      #| Graph Representations | GraphpythonCode |         0 |
#
  #Scenario Outline: The user gets error with invalid code in tryEditor for Graph page
    #Given User clicks on "<name>" link in Graph Page
    #And User clicks on Try here button in Graph Page
    #When User enters a invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> in Graph Page
    #Then User clicks on run button in Graph Page
    #And User should be presented with Error popup in Graph Page
#
    #Examples: 
      #| name                  | Sheetname       | RowNumber |
      #| Graph                 | GraphpythonCode |         1 |
      #| Graph Representations | GraphpythonCode |         1 |
