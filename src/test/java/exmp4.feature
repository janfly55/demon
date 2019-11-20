Feature: demo on use of tags in cucumber
@First
Scenario: Regression Testing
Given User is testing for the login funtionality
Then User able to login successfully

@Second
Scenario: System Testing
Given User is testing the search funtionality
Then search works successfully

@Demo
Scenario: display the name of the tester
Then "Janani" is tester on testme app


