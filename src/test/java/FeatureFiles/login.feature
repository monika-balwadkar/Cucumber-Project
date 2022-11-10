Feature: Salesforce Application login feature
Scenario Outline: Login

Given Initialize the web driver
When user navigates to website "https://login.salesforce.com/?locale=in"
And enter <username> and <password> and click on login button
Then user should be able to login successfully

Examples:
|username||password|
|viraj||viraj123|
|kiyaan||kiyan2333|