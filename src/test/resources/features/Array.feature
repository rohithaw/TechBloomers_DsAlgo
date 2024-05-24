@DSALGO
Feature: User Navigation to Array page

  Background: User is Signed-in and navigate to Array Page
    Given User enters homepage url
    When User Clicks on Get Started button
    Then User clicks on the Sign in link
    And Click on Login with Valid Username and Password
    And Click on the Get Started button for Array  Datastructures

  @AP1
  Scenario: User select Arrays from the drop down menu to load Array Page
  When The user select Arrays from the drop down menu in Array Page
  Then The user should be navigated to the Array Page in Array Page
  
  @AP2
  Scenario Outline: Checking the Topics Covered
    When The User clicks on "<name>" link in Array Page
    Then user should be redirected to that "<name>" page in Array Page
    And User clicks on Try here button in Array Page
    And user should be redirected to a page having an tryEditor with a Run button to test in Array Page

    Examples: 
      | name                      |
      | Arrays in Python          |
      | Arrays Using List         |
      | Basic Operations in Lists |
      | Applications of Array     |

 @AP3
  Scenario Outline: The user is able run code in tryEditor for Arrays in Python page
    Given  The User clicks on "<name>" link in Array Page    
    And User clicks on Try here button in Array Page
    When The user enter a valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> in Array Page
    Then The user clicks on run button in Array Page
    And The user should be presented with Run result in Array Page

    Examples: 
    | name                 | Sheetname       | RowNumber |
    |  Arrays in Python    | ArraypythonCode |     0     |
    | Arrays Using List    | ArraypythonCode |     0     |
    |Basic Operations in Lists| ArraypythonCode |  0     |
    | Applications of Array   | ArraypythonCode  | 0     |
    
    @AP4 
    Scenario Outline: The user gets errr with invalid code in tryEditor for Arrays in Python page
    Given  The User clicks on "<name>" link in Array Page   
    And User clicks on Try here button in Array Page
    When The user enter a valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> in Array Page
    Then The user clicks on run button in Array Page
    And The user should be presented with Error popup in Array Page

    Examples: 
    | name                 | Sheetname       | RowNumber |
    |  Arrays in Python    | ArraypythonCode |     1     |
    | Arrays Using List    | ArraypythonCode |     1     |
    | Basic Operations in Lists| ArraypythonCode |  1     |
    | Applications of Array   | ArraypythonCode  | 1     |
    
    
    @AP5
    Scenario Outline: Testing Practice Questions link
    When The User clicks on Array in Python link in Array Page   
    And User clicks on Practice Questions Link in Array Page 
    Then User click on "<Practiselinkname>" from practice Page in Array  
    And  user enters a valid code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question in Array Page 
    And The user clicks on Run button in Array Page 
    Then The user should be presented with successful submission message in Array Page 

    Examples: 
      | Practiselinkname                       |  Sheetname    | RowNumber |
      | Search the array                       | ArraypythonCode| 2 |
      | Max Consecutive Ones                   | ArraypythonCode| 3 |
      | Find Numbers with Even Number of Digits| ArraypythonCode| 4 |
      | Squares of  a Sorted Array             | ArraypythonCode| 5 |
      
    
      