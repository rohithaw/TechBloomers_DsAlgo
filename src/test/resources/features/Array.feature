@DSALGO
Feature: User Navigation to Array page

  Background: User is Signed-in and navigate to Array Page
    Given User enters homepage url
    When User Clicks on Get Started button
    Then User clicks on the Sign in link
    And Clicks on Login
    And Click on the Get Started button for Array  Datastructures

  #@AP1
  #Scenario: User select Arrays from the drop down menu to load Array Page
  #When The user select Arrays from the drop down menu
  #Then The user should be navigated to the Array Page
  #
  #@AP2
  #Scenario Outline: Checking the Topics Covered
    #When The User clicks on "<name>" link
    #Then user should be redirected to that "<name>" page
    #And User clicks on Try here button
    #And user should be redirected to a page having an tryEditor with a Run button to test
#
    #Examples: 
      #| name                      |
      #| Arrays in Python          |
      #| Arrays Using List         |
      #| Basic Operations in Lists |
      #| Applications of Array     |
#
  #Scenario Outline: The user is able run code in tryEditor for Arrays in Python page
    #Given  The User clicks on "<name>" link     
    #And User clicks on Try here button
    #When The user enter a valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    #Then The user clicks on run button
    #And The user should be presented with Run result
#
    #Examples: 
    #| name                 | Sheetname       | RowNumber |
    #|  Arrays in Python    | ArraypythonCode |     0     |
    #| Arrays Using List    | ArraypythonCode |     0     |
    #|Basic Operations in Lists| ArraypythonCode |  0     |
    #| Applications of Array   | ArraypythonCode  | 0     |
    
    
     Scenario Outline: The user gets errr with invalid code in tryEditor for Arrays in Python page
    Given  The User clicks on "<name>" link     
    And User clicks on Try here button
    When The user enter a valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    Then The user clicks on run button
    And The user should be presented with Error popup

    Examples: 
    | name                 | Sheetname       | RowNumber |
    |  Arrays in Python    | ArraypythonCode |     1     |
    #| Arrays Using List    | ArraypythonCode |     1     |
    #|Basic Operations in Lists| ArraypythonCode |  1     |
    #| Applications of Array   | ArraypythonCode  | 1     |
    