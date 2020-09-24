$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Check Login",
  "description": "",
  "id": "check-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Successful login with valid credentials",
  "description": "",
  "id": "check-login;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@valid"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters valid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should be able to see logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckLogin.user_is_on_login_page()"
});
formatter.result({
  "duration": 10526408200,
  "status": "passed"
});
formatter.match({
  "location": "CheckLogin.user_enters_valid_username_and_password()"
});
formatter.result({
  "duration": 291809000,
  "status": "passed"
});
formatter.match({
  "location": "CheckLogin.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 8398378400,
  "status": "passed"
});
formatter.match({
  "location": "CheckLogin.user_should_be_able_to_see_logout_button()"
});
formatter.result({
  "duration": 1664140200,
  "status": "passed"
});
});