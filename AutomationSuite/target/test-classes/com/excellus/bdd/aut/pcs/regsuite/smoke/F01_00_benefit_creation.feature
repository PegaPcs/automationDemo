Feature: Create New Benefit functionality
					Description: Verifing Create New Benefit functionality.

Background: 
#Background keyword to put the common Steps across all the Scenarios in one place
	

@SmokeTest
Scenario Outline: Create New Benefit Scenario

	Given User opens browser and launch the application
	When User enter valid "<UserName>" and "<Password>"
	When User clicks on Login button
	Then Login should be successful
	Then Home page should be displayed
	When User clicks on New Menu
	And User clicks on Benefit sub-menu
	Then User Logged off

    Examples:
      | UserName|Password|
      | kmahesh|rules@12345|