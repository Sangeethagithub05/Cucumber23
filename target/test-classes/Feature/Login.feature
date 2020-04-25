Feature: Verifying Facebook Details
Scenario Outline: verfy login details with invalid credentials
Given user is on the Facebook page
When user enters the "<username>" and "<password>"
And user should click the login button
Then user should verufy the message

Examples:
|username|password|
|sangee|123|

