Feature: Free CRM Call Feature

@Regression
Scenario Outline: Free CRM Call Test Scenario

Given user is in Login Page
 
When title of login page is Free HRM  
Then user enters "<username>" and "<password>"
Then user clicks on login button

Then Click on Admin link
Then click on Settings option
Then click on logout option

Examples: 

    | username                | password   | firstname | lastname |
	| Admin                   | admin123   | Demo1   | Reddy    |
	
	