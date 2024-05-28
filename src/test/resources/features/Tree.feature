@TreePage
Feature: Tree page feature

  Background: User checks Get Started in Tree pane
    Given User enters homepage url
    When User Clicks on Get Started button
    And User clicks on the Sign in link
    And Click on Login with Valid Username and Password
    When User finds the Tree pane and clicks on Get Started button
    Then User navigated to Tree page

  @TP1
  Scenario Outline: User checks links in Tree page
    When User clicks on "<links>" in the tree page
    Then User should navigated to "<links>" page
    And User clicks on TryHere button
    Then User should redirected to Try Editor with Run button to test

    Examples: 
      | links                          |
      | Overview of Trees              |
      | Terminologies                  |
      | Types of Trees                 |
      | Tree Traversals                |
      | Traversals-Illustration        |
      | Binary Trees                   |
      | Types of Binary Trees          |
      | Implementation in Python       |
      | Binary Tree Traversals         |
      | Implementation of Binary Trees |
      | Applications of Binary trees   |
      | Binary Search Trees            |
      | Implementation Of BST          |

  @TP2
  Scenario Outline: The user is able run valid code in tryEditor for trees in Python page
    When User clicks on "<links>" in the tree page
    And User clicks on TryHere button
    When user enter a valid python code from sheet "<sheetName>" and <RowNumber> tryEditor of Tree page
    And user clicks on run button
    Then user should be presented with Run result

    Examples: 
      | links                          | sheetName      | RowNumber |
      | Overview of Trees              | TreePythonCode |         0 |
      | Terminalogies                  | TreePythonCode |         0 |
      | Types Of Trees                 | TreePythonCode |         0 |
      | Tree Traversals                | TreePythonCode |         0 |
      | Traversals-Illustration        | TreePythonCode |         0 |
      | Binary Trees                   | TreePythonCode |         0 |
      | Types of Binary Trees          | TreePythonCode |         0 |
      | Implementation in Python       | TreePythonCode |         0 |
      | Binary Tree Traversals         | TreePythonCode |         0 |
      | Implementation of Binary Trees | TreePythonCode |         0 |
      | Applications of Binary trees   | TreePythonCode |         0 |
      | Binary Search Trees            | TreePythonCode |         0 |
      | Implementation Of BST          | TreePythonCode |         0 |

  @TP3
  Scenario Outline: The user gets error alert for Invalid code in tryEditor for trees in Python page
    When User clicks on "<links>" in the tree page
    And User clicks on TryHere button
    When The user enter a Invalid python code from sheet "<sheetName>" and <RowNumber> tryEditor of Tree page
    And user clicks on run button
    Then The user should be presented with Error popup

    Examples: 
      | links                          | sheetName      | RowNumber |
      | Overview of Trees              | TreePythonCode |         1 |
      | Terminalogies                  | TreePythonCode |         1 |
      | Types Of Trees                 | TreePythonCode |         1 |
      | Tree Traversals                | TreePythonCode |         1 |
      | Traversals-Illustration        | TreePythonCode |         1 |
      | Binary Trees                   | TreePythonCode |         1 |
      | Types of Binary Trees          | TreePythonCode |         1 |
      | Implementation in Python       | TreePythonCode |         1 |
      | Binary Tree Traversals         | TreePythonCode |         1 |
      | Implementation of Binary Trees | TreePythonCode |         1 |
      | Applications of Binary trees   | TreePythonCode |         1 |
      | Binary Search Trees            | TreePythonCode |         1 |
      | Implementation Of BST          | TreePythonCode |         1 |

  @TP4
  Scenario: User clicks on Practice questions link in Overview of Trees Data page
    When User clicks on Overview of Trees link in Tree page
    And User clicks on Practice questions in over view of trees
    Then User should be navigated to Blank page
