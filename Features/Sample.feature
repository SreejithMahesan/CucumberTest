@Login
Feature: Login Feature


Scenario Outline: Verify user is able to login with a valid username and password


Given A user is on the ToolsQa login page
And the User enters the "<UserName>" in the UserNamebox
And the User enters the "<Password>"
When the User clicks the login button
Then the User is logged in to the system

Examples:
|UserName|Password|
|User1|Password01|
|User2|Password02|
|User3|Password03|
