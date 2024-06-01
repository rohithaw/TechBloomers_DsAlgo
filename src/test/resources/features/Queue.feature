@DSALGO
   Feature: Queue feature
   I want to use this template for my feature file
  
  Background:
   Given User enters homepage url
   When  User Clicks on Get Started button
   And   User clicks on the Sign in link
   And Click on Login with Valid Username and Password
   Then  User clicks on the Get Started button in Queue pane 
 

   @Q1
   Scenario: Queue Page scenario
    When   User selects Queue from the drop down menu
    Then   User is navigated to the queue page
    And    User clicks on Implementation of Queue in Python link on queue page  
   Then    User clicks on the practice Questions link on queue page
    And    User is navigated to a blank page from queue page

   
   @Q2
   Scenario Outline: Queue page links validation  
    When  User clicks on the "<name>" links on queue page 
    Then  User navigated to the "<name>" links queue page
    And   User clicks on  Try here button on queue page 
    And   User is directed to Queue tryEditor Page with a run button to test
    
     Examples: 
      | name                                   | 
      | Implementation of Queue in Python      |     
      | Implementation using collections.deque | 
      | Implementation using array             |  
      | Queue Operations                       |
    
    
    @Q3
    Scenario Outline: Queue  links validation with valid input
     
   When   User clicks on the "<name>" links on queue page
    And   User clicks on  Try here button on queue page
   When   User enters a code in Queue try Editor from sheet "<sheetName>" and <RowNumber>
   Then   User clicks on run button on queue page
   And    User can see the output on queue page
      Examples:
     |name                                    | sheetName       |RowNumber |
     | Implementation of Queue in Python      | Queuecode       |0       |
     | Implementation using collections.deque | Queuecode       |0       |
     | Implementation using array             | Queuecode       |0       |  
     | Queue Operations                       | Queuecode       |0       |
     
     @Q4
     Scenario Outline: Queue  links validation with Invalid input
     
    When  User clicks on the "<name>" links on queue page
    And   User clicks on  Try here button on queue page
   When   User enters a code in Queue try Editor from sheet "<sheetName>" and <RowNumber>
   Then   User clicks on run button on queue page
   And    User can see the Errormessage alert on queue page
      Examples:
     |name                                    | sheetName       |RowNumber |
     | Implementation of Queue in Python      | Queuecode       |1       |
     | Implementation using collections.deque | Queuecode       |1       |
     | Implementation using array             | Queuecode       |1       |  
     | Queue Operations                       | Queuecode       |1       |
   
  