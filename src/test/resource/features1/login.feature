Feature: login page credential

Background:
Given user should navigate to login page

Scenario Outline: validate the login feature with valid credential
When user should enter email <email>
And user should enter password <password>
And user should click on login page 
Then user should navigate to profile page
Examples: 
|email          |password|
|harshvardhan9661@gmail.com|Harsh@9334|
|harshrcpl@gmail.com|Harsh@9334|

Scenario Outline: validate the login feature with invalid credential
When user should enter email <email>
And user should enter password <password>
And user should click on login page 
Then user should get proper warning message
Examples: 
|email          |password|
|harshvardha9661@gmail.com|Harsh@9334|
|harshrcp@gmail.com|Harsh@9334|

Scenario: verify the forgotten password functionality 
When user should click on forgotten password link
Then user should navigate to forgotten page 
And user should enter their email address 
And then user should again navigate to login page
And user should see correct message in login page 

Scenario: verify the login functionality using tab key
When user enter email address "harshvardhan9661@gmail.com"
And press tab key
And user enter password "Harsh@9334"
And double press tab key
And click on enter
Then user should navigate to profile page 

Scenario: Verify the text into the Password field is toggled to hide its visibility
When user enter password into password fielde "Harshvardhan" 
Then fetch the value of entered and verify the entered value 

@smoke
Scenario: verify the logging feature again after closing brower
When user should enter email "harshvardhan9661@gmail.com"
And user should enter password "Harsh@9334"
And user should click on login page 
And user should navigate to profile page
And user should close the browser
And after closing user should again open the browser 
Then user should see the logout button inside profile page 

#TC_LF_019 
Scenario: Verify user is able to navigate to different pages from Login page
When user should click on continue button under new customer section
And user should navigate to Registration page 
And user should navigate back 
Then user should again navigated to login page
 
#TC_LF_021
Scenario: Verify the Breakcrumb,PageHeading,PageTitle and PageURL of Login page
When user should fetch Breakcrumb PageHeading PageTitle and PageURL of login page
Then Breakcrumb PageHeading PageTitle and PageURL should show currenctly


