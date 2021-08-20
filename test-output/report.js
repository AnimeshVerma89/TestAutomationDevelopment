$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Login.feature");
formatter.feature({
  "name": "Login in to the Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has launched browser",
  "keyword": "Given "
});
formatter.step({
  "name": "User navigates to the Application URL",
  "keyword": "When "
});
formatter.step({
  "name": "Clicks Signin link on the \"My Store\" page",
  "keyword": "And "
});
formatter.step({
  "name": "Navigates to \"Login - My Store\" Page",
  "keyword": "Then "
});
formatter.step({
  "name": "Enters username as \"\u003cUsername\u003e\" and password as \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Clicks on SignIn button on the \"Login - My Store\" page",
  "keyword": "And "
});
formatter.step({
  "name": "Navigates to \"My account - My Store\" Page",
  "keyword": "Then "
});
formatter.step({
  "name": "User validates \"test demo\" Account Information page",
  "keyword": "And "
});
formatter.step({
  "name": "Clicks Signout link on the \"My account - My Store\" page",
  "keyword": "When "
});
formatter.step({
  "name": "Navigates to \"Login - My Store\" Page",
  "keyword": "Then "
});
formatter.step({
  "name": "Quit Launched Browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "testautomation2022@gmail.com",
        "Password@123"
      ]
    },
    {
      "cells": [
        "testautomation2023@gmail.com",
        "Password@123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has launched browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_has_launched_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to the Application URL",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_navigates_to_the_Application_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks Signin link on the \"My Store\" page",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.clicks_Signin_link_on_the_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigates to \"Login - My Store\" Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.navigates_to_Page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enters username as \"testautomation2022@gmail.com\" and password as \"Password@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.enters_username_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks on SignIn button on the \"Login - My Store\" page",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.clicks_on_SignIn_button_on_the_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigates to \"My account - My Store\" Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.navigates_to_Page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User validates \"test demo\" Account Information page",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_validates_Account_Information_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks Signout link on the \"My account - My Store\" page",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.clicks_Signout_link_on_the_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigates to \"Login - My Store\" Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.navigates_to_Page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Quit Launched Browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.quit_Launched_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has launched browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_has_launched_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to the Application URL",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_navigates_to_the_Application_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks Signin link on the \"My Store\" page",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.clicks_Signin_link_on_the_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigates to \"Login - My Store\" Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.navigates_to_Page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enters username as \"testautomation2023@gmail.com\" and password as \"Password@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.enters_username_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks on SignIn button on the \"Login - My Store\" page",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.clicks_on_SignIn_button_on_the_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigates to \"My account - My Store\" Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.navigates_to_Page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User validates \"test demo\" Account Information page",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_validates_Account_Information_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks Signout link on the \"My account - My Store\" page",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.clicks_Signout_link_on_the_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigates to \"Login - My Store\" Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.navigates_to_Page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Quit Launched Browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.quit_Launched_Browser()"
});
formatter.result({
  "status": "passed"
});
});