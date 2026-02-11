#login page program

Feature:login_page


Scenario:login is successful

Given browser1 is open
When enter login details<username>and<password>
#And browser is login
Then page navigate to website

Example:

|username|password|
|standard_user|secret_sauce|