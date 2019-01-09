@UserName
Feature: User validates whether the profile page has his name mentioned correctly

Scenario Outline:


Given the "<User>" is at home page
And the "<User>" navigates to the profile page
When the "<User>" validates the "<UserName>" in the profile page
Then the "<UserName>" should be displayed correctly

Examples:
|User|UserName|
|User01|UserName01|

