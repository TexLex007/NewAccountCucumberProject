Feature: Techfios Other billing login page functionality validation

 Background: 
    Given User is on the techfios login page

Scenario Outline: User should be able to login with valid credentials 
	and open a new account	
	When User enters the "<username>" in the username field
	When User enters the "<password>" in the password field
	And User clicks on login
	Then User should land on Dashboard page 
	And User clicks on bank cash
	And User clicks on new account
	And User enters "<accountTitle>" in the account title field in accounts page 
	And User enters "<description>" in the description field in accounts page 
	And User enters "<initialBalance>" in the initial balance field in accounts page  
	And User enters "<accountNumber>" in the account number field in accounts page 
	And User enters "<contactPerson>" in the contact person field in accounts page 
	And User enters "<Phone>" in the phone field in accounts page   
	And User clicks on submit
	Then User should be able to validate account created successfully
	
	Examples: 
	|username||password||accountTitle||description||initialBalance||accountNumber||contactPerson||Phone|
	|demo@techfios.com||abc123||Bamboo Title||Bamboo Deposit||10000||963696369||Anup||0123456789|