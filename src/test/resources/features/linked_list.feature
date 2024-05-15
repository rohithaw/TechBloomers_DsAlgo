@DsAlgoLinked_ListPage
Feature: LinkedList feature
  I want to use this template for my feature file

  Background: User is on the Home page
   Given User clicks the Get Started button in <Linked List> pane or select <Linked List> from the drop down menu
   Then User should be able to see <Linked List> page
  

  @tag1
  Scenario Outline: Linked List scenario
    Given User is on the Linked List page
    And   User is able to see <name> links on Linked List page 
    And   User clicks on <name> links button on Linked List page 
    When  User is redirected <name> link page 
    And   User able to see Try Here button on the <name> link page
    And   User clicks on Try Here button
    And   User is redirected to Try Editor page 
    And   User is able to see a Run button to test 
    Then  User validates Try Here button with valid input
    And   User Validates Try Here button with invalid input 
  
     Examples: 
      | name  |
      |Introduction|
      |Creating Linked List|
      |Types of Linked List|
      |Implement Linked List in Python|
      |Traversal|
      |Insertion|
      |Deletion|
  
  @tag2
  Scenario: To check <Practice Quetions>link
  
  Given User is on linked List <link> page 
  When  User is able to see<Practice Questions> link
  And   User clicks on < Practice Questions> link
  Then  User is redirected to a blank page
