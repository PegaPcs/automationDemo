$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("../AutomationSuite/src/test/java/com/excellus/bdd/aut/pcs/regsuite/smoke/F01_00_benefit_creation.feature");
formatter.feature({
  "line": 1,
  "name": "Create New Benefit functionality",
  "description": "\t\t\tDescription: Verifing Create New Benefit functionality.",
  "id": "create-new-benefit-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 5,
      "value": "#Background keyword to put the common Steps across all the Scenarios in one place"
    }
  ],
  "line": 9,
  "name": "Create New Benefit Scenario",
  "description": "",
  "id": "create-new-benefit-functionality;create-new-benefit-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User opens browser and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "User enter valid \"\u003cUserName\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User clicks on Login button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Login should be successful",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Home page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User clicks on New Menu",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User clicks on Benefit sub-menu",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User Logged off",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "create-new-benefit-functionality;create-new-benefit-scenario;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 21,
      "id": "create-new-benefit-functionality;create-new-benefit-scenario;;1"
    },
    {
      "cells": [
        "kmahesh",
        "rules@12345"
      ],
      "line": 22,
      "id": "create-new-benefit-functionality;create-new-benefit-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 22,
  "name": "Create New Benefit Scenario",
  "description": "",
  "id": "create-new-benefit-functionality;create-new-benefit-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User opens browser and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "User enter valid \"kmahesh\" and \"rules@12345\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User clicks on Login button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Login should be successful",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Home page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User clicks on New Menu",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User clicks on Benefit sub-menu",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User Logged off",
  "keyword": "Then "
});
formatter.match({
  "location": "BenefitTest.user_opens_browser_and_launch_the_application()"
});
formatter.result({
  "duration": 233298438,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kmahesh",
      "offset": 18
    },
    {
      "val": "rules@12345",
      "offset": 32
    }
  ],
  "location": "BenefitTest.user_enter_valid_and(String,String)"
});
formatter.result({
  "duration": 9904875,
  "status": "passed"
});
formatter.match({
  "location": "BenefitTest.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 149440,
  "status": "passed"
});
formatter.match({
  "location": "BenefitTest.login_should_be_successful()"
});
formatter.result({
  "duration": 1002088225,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElements(DefaultElementLocator.java:85)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementListHandler.invoke(LocatingElementListHandler.java:36)\r\n\tat com.sun.proxy.$Proxy16.size(Unknown Source)\r\n\tat com.excellus.bdd.aut.pcs.pageobjects.LoginPO.verifyIsLoginSuccess(LoginPO.java:102)\r\n\tat com.excellus.bdd.aut.pcs.testasserts.BenefitTest.login_should_be_successful(BenefitTest.java:49)\r\n\tat ✽.Then Login should be successful(../AutomationSuite/src/test/java/com/excellus/bdd/aut/pcs/regsuite/smoke/F01_00_benefit_creation.feature:14)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "BenefitTest.home_page_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BenefitTest.user_clicks_on_New_Menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BenefitTest.user_clicks_on_Benefit_sub_menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BenefitTest.user_navigates_to_Benefit_Overview_screen()"
});
formatter.result({
  "status": "skipped"
});
});