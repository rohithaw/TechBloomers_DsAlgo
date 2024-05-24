@DsAlgoQueuePage
   Feature: Queue feature
   I want to use this template for my feature file
  
   Background: User is on the Home page
   Given User clicks the Get Started button in <Queue> pane or select <Queue> from the drop down menu
   Then User should be able to see <Queue> page 
   
   @tag1
    Scenario Outline: Queue page links display test scenario
     
     Given User is on the home page 
     When user clicks on get started button in <Queue> pane
     Then User is able to see <Queue> page
     And  user is able to see <name> links on <Queue> page
     
    Examples: 
      | name  | 
      | Implementation of Queue in Python|     
      | Implementation using collections.deque | 
      | Implementation using array|  
      | Queue Operations| 
 
  @tag2
   Scenario Outline: To check the <name> link on <Queue> page

    When User clicks the <name> link button
    Then User should be redirected to the <name> page
    And User should be able to see Try Here button
     
    Examples: 
      | name  | 
      | Implementation of Queue in Python|     
      | Implementation using collections.deque | 
      | Implementation using array|  
      | Queue Operations|
  
  @tag3
    Scenario Outline: User validates <Try Here> button 
    
    When User validates <Try Here> button in the <name> page
    Then User should be redirected to a page having Try Editor with a run button to test
    
    
    Examples: 
      | name  | 
      | Implementation of Queue in Python|     
      | Implementation using collections.deque | 
      | Implementation using array|  
      | Queue Operations|
 
  
  @tag4
    Scenario Outline: User validates Try Here button with valid  and Invalid input
    
    When User validates <Try Here> button in the <name>page with <valid code>
    And  User clicks <run>
    Then User is able to see output on the console 
    
    Examples: 
      | name  |                                   
      | Implementation of Queue in Python|        
      | Implementation using collections.deque | 
      | Implementation using array|  
      | Queue Operations|
  
  
  @tag5
    Scenario Outline: User validates Try Here button with invalid input
    
    When User validates Try Here button in the<name>page with invalid code
    And  User clicks run
    Then It should display Nameerror message 
    
    Examples: 
      | name  | 
      | Implementation of Queue in Python|     
      | Implementation using collections.deque | 
      | Implementation using array|  
      | Queue Operations|
   
   
  @tag6
   Scenario: To check the <Practice Questions> link 

    When User click <Practice Questions> button
    Then User should be redirected to the blank page
   

         