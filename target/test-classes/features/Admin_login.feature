Feature: Admin Login
Verify that the Admin can log onto the site
  

     Scenario: Logon as Admin User
        	Given Open the chrome browser and the application
		    And I enter the "admin" credentials
		    When I Press on the sign in button
		    Then I will successfully login
		    And I will see the welcome page message
