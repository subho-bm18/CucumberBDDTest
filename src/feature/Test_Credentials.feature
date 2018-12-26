Feature: Login
@LoginUsername
Scenario: Verify the Login Credentials of XYZ Applications
	Given I navigates to XYZ application 
	When I enters the following credentials
	|abc     |xyz     |
	|dez     |xy123   |
	|vcd     |zzz     |
	Then I verify that the page displays search text box
	
@FillDetails
Scenario: Verify the details to enter in new form
	Given I opens XYZ application 
	When I fill up the new account opening form with the below data
	|FirstName|LastName|PhoneNum  |Email        |Gender|Address                  |
	|Subhodeep|Ganguly |9748084401|abc@gmail.com|Male  |City:Delhi, Pin :110088  |
	|Arpita   |Ganguly |9988667788|gef@gmail.com|Female|City:Kolkata, Pin :743133|
	|Vombol   |Bhatta  |8971652225|xyz@gmail.com|Kid   |City:Punjab, Pin :700159 |
	And I fetch the details from JSON input file
	And I click on Save Button
	Then the details should be saved
	And I should be able to verify the details in UI with input file
	

