Feature: Automation for logout functionality 

Background: 
Given User should successfully login with valid credential <userid> <password>
|userid| harshvardhan9661@gmail.com|
|password|Harsh@9334|
And user click on myaccount dropdown menu 
@logout
Scenario: Verify Logging out by selecting Logout option from 'My Account' dropmenu
When user select logout option 
And user should click on continue button
Then user should successfully navigate to Home page 

@logout
Scenario: Verify 'Account Logout' page
When user select logout option 
And user should be fetch pagetitle,pageheading,pageurl, and breadcrum of logout page
Then pagetitle,pageheading,pageurl, and breadcrum should be appropiate


 