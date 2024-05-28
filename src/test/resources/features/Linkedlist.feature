@DsAlgoLinkedlistPage
Feature: LinkedList feature
  I want to use this template for my feature file

 Background:
   Given User enters homepage url
   When  User Clicks on Get Started button
   And   User clicks on the Sign in link
   And   Click on Login with Valid Username and Password
   Then  User clicks on the Get Started button in Linked list pane 
  

  @L1
   Scenario: Linked list Page scenario
    When    User selects Linked list from the drop down menu
    Then    User is navigated to the Linked list page 
    And     User clicks on Introduction link on Linked list page  
   Then     User clicks on the practice Questions link on Linked list page
    And     User is navigated to a blank page from Linked list page

   
  @L2
   Scenario Outline: Linked list page links validation 
    When  User clicks on the "<name>" links on Linked list page 
    Then  User navigated to the "<name>" links Linked list page
    And   User clicks on  Try here button on the links page
    And   User is directed to tryEditor Page with a run button to test on Links page
     Examples: 
      | name  |
      |Introduction|
      |Creating Linked LIst|
      |Types of Linked List|
      |Implement Linked List in Python|
      |Traversal|
      |Insertion|
      |Deletion|
      
   @L3   
    Scenario Outline:Linked list links validation with valid input 
    When  User clicks on the "<name>" links on Linked list page
    And   User clicks on  Try here button on the links page 
   When   User enters a code in Linkedlist try Editor from sheet "<sheetName>" and <RowNumber>
   Then   User clicks on run button on Linkedlist try Editor
    And   User can see the output on Linkedlist
    Examples:
     |name                                    | sheetName            |RowNumber |
     | Introduction                           |  Linkedlistcode       |0       |
     | Creating Linked LIst                   |  Linkedlistcode       |0       |
     | Types of Linked List                   |  Linkedlistcode       |0       |  
     | Implement Linked List in Python        |  Linkedlistcode       |0       |
     |Traversal                               |  Linkedlistcode       |0       |
     |Insertion                               |  Linkedlistcode       |0       |
     |Deletion                                | Linkedlistcode        |0       |
   
   
   @L4  
    Scenario Outline: Linked list links validation with Invalid input 
    When  User clicks on the "<name>" links on Linked list page
    And   User clicks on  Try here button on the links page 
   When   User enters a code in Linkedlist try Editor from sheet "<sheetName>" and <RowNumber>
   Then   User clicks on run button on Linkedlist try Editor
    And   User can see the Errormessage alert on Linkedlist
    Examples:
     |name                                    | sheetName            |RowNumber |
     |Introduction                            |  Linkedlistcode       |1       |
     |Creating Linked LIst                    |  Linkedlistcode       |1       |
     |Types of Linked List                    |  Linkedlistcode       |1       |  
     |Implement Linked List in Python         |  Linkedlistcode       |1       |
     |Traversal                               |  Linkedlistcode       |1       |
     |Insertion                               |  Linkedlistcode       |1       |
     |Deletion                                |  Linkedlistcode       |1       |
   
