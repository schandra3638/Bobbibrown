$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com/bobbibrown/features/Account.feature");
formatter.feature({
  "name": "My Account",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Return User Sign-in",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Sign-in Page",
  "keyword": "Given "
});
formatter.match({
  "location": "AccountSignInPageStepDefinition.user_is_on_Sign_in_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter username \"csstester114@gmail.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountSignInPageStepDefinition.enter_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Password \"Tester@123\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountSignInPageStepDefinition.enter_Password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Sign-in button",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountSignInPageStepDefinition.click_on_Sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify whether user is on Account landing page",
  "keyword": "And "
});
formatter.match({
  "location": "AccountLandingPageStepDefinition.verify_whether_user_is_on_Account_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Sign-out link",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountLandingPageStepDefinition.click_on_Sign_out_link()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Create New User Account",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Sign-in Page",
  "keyword": "Given "
});
formatter.match({
  "location": "AccountSignInPageStepDefinition.user_is_on_Sign_in_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter username \"csstester114@gmail.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountSignInPageStepDefinition.enter_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Password \"Tester@123\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountSignInPageStepDefinition.enter_Password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Sign-in button",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountSignInPageStepDefinition.click_on_Sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify whether user is on Account landing page",
  "keyword": "And "
});
formatter.match({
  "location": "AccountLandingPageStepDefinition.verify_whether_user_is_on_Account_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Sign-out link",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountLandingPageStepDefinition.click_on_Sign_out_link()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});