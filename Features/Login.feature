#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Login in to the Application

  #Scenario: Login in to the application using valid credentials
    #Given User has launched chrome browser
    #When User navigates to the Application URL "http://automationpractice.com/index.php"
    #And Clicks Signin link on the "My Store" page 
    #Then Navigates to "Login - My Store" Page 
    #When Enters username as "testautomation2022@gmail.com" and password as "Password@123"
    #And Clicks on SignIn button on the "Login - My Store" page
    #Then Navigates to "My account - My Store" Page
    #And User validates "test demo" Account Information page
    #When Clicks Signout link on the "My account - My Store" page
    #Then Navigates to "Login - My Store" Page
    #And Quit Launched Browser


  Scenario Outline:
  Given User has launched chrome browser
    When User navigates to the Application URL "http://automationpractice.com/index.php"
    And Clicks Signin link on the "My Store" page 
    Then Navigates to "Login - My Store" Page 
    When Enters username as "<Username>" and password as "<Password>"
    And Clicks on SignIn button on the "Login - My Store" page
    Then Navigates to "My account - My Store" Page
    And User validates "test demo" Account Information page
    When Clicks Signout link on the "My account - My Store" page
    Then Navigates to "Login - My Store" Page
    And Quit Launched Browser
    
    Examples:
    |Username										|	Password|
    |testautomation2022@gmail.com	|Password@123|	
    |testautomation2023@gmail.com	|Password@123|	
