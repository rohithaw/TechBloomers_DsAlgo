@DsAlgoHomePage
Feature: Home Page Feature

  Background: User is on the homepage
    Given User enters homepage url

  @HP1
  Scenario: To validate the Home Page
    Then User should be able to navigate to the home page and see the text - Preparing for the Interviews You are at the right place
    And User should see the Get Started button

  @HP2
  Scenario: Testing the Get Started button on the homepage
    When User Clicks on Get Started button
    Then Home Page is displayed with the all the seven datastructure modules
    And User should be able to see the Register link
    And User should be able to see the Sign in link
    And User should be able to see the datastructures dropdown with all six modules

  @HP3
  Scenario Outline: User is on Home page and click get started link on Datastructure Modules without sign in
    When The user clicks on Get Started link on homepage "<option>" without login
    Then The user get warning message "<Message>"

    Examples: 
      | option         | Message               |
      | Datastructures | You are not logged in |
      | Arrays         | You are not logged in |
      | Linkedlist     | You are not logged in |
      | Stack          | You are not logged in |
      | Queue          | You are not logged in |
      | Tree           | You are not logged in |
      | Graph          | You are not logged in |

  @HP4
  Scenario Outline: User is on Home page and click dropdown on home page without sign in
    When The user clicks on dropdown "<option>" without login
    Then The user get warning message again "<Message>"

    Examples: 
      | option     | Message               |
      | Arrays     | You are not logged in |
      | Linkedlist | You are not logged in |
      | Stack      | You are not logged in |
      | Queue      | You are not logged in |
      | Tree       | You are not logged in |
      | Graph      | You are not logged in |

  @HP5
  Scenario: To validate the Sign in link
    When User Clicks on Get Started button
    And User clicks on the Sign in link
    Then User gets redirected to the Sign in page and see the username field and password field
    And User should be able to see the message - If you don't have an account, please Register!

  @HP6
  Scenario: To validate the Register link
    When User Clicks on Get Started button
    And User clicks on the Register Link
    Then User is redirected on the Register Page and should be able to see the Register button