Feature: Login

  Scenario: Successfull Login with valid credentials
    Given User Launch Chrome browser
    When User opens URL 
    Then click on Search bar and give input
    Then User enters Email and Password 
    And click on Signin
    
    And close browser
