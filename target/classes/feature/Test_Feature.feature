Feature: Google Homepage
 
Scenario: Check that main elements on Google Homepage are displayed
	Given I launch Chrome browser
	When I open Google Homepage
	Then I verify that the page displays search text box
