Feature: To validate the login funcionality of flipkart application

Scenario: To validae login with valid username and invalid password
Scenario: To validate login with empty username and empty password
Given To launch the chrome browser and maximise window
When To launch the url of the flipkart application
And To pass valid username in email field
And To pass invalid passwor in password field
And To click the login buton
And To check whether navigate to the home page or not
Then To close the browser
