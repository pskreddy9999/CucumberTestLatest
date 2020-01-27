Feature: Free CRM Login Feature

@smoke
Scenario Outline: Free CRM Login Test Scenario

Given user is in Login Page
When title of login page is Free HRM
Then wait for some time   
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then click on maintenance link

Then click on Settings option
Then click on logout option

Examples:
	| username                | password   | firstname | lastname |
	| Admin                   | admin123  | Test2   |  Pemmana |

 

#psathish15@outlook.com  sathish11@

		