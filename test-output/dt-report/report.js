$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/hooks.feature");
formatter.feature({
  "line": 1,
  "name": "Sign in",
  "description": "",
  "id": "sign-in",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4147895000,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Test demowebshop with valid credentials",
  "description": "",
  "id": "sign-in;test-demowebshop-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User has navigated to login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User provides username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user signs in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Hooksdemo.user_has_navigated_to_login_page()"
});
formatter.result({
  "duration": 5024792600,
  "status": "passed"
});
formatter.match({
  "location": "Hooksdemo.user_provides_username_and_password()"
});
formatter.result({
  "duration": 200452500,
  "status": "passed"
});
formatter.match({
  "location": "Hooksdemo.user_signs_in_successfully()"
});
formatter.result({
  "duration": 3051519600,
  "status": "passed"
});
formatter.after({
  "duration": 4318280400,
  "status": "passed"
});
formatter.before({
  "duration": 3201299400,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Test demowebshop with invalid data",
  "description": "",
  "id": "sign-in;test-demowebshop-with-invalid-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "Application is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I provide valid username and invalid password",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should view a error message",
  "keyword": "Then "
});
formatter.match({
  "location": "IncorrectLoginHooks.application_is_opened()"
});
formatter.result({
  "duration": 5271389700,
  "status": "passed"
});
formatter.match({
  "location": "IncorrectLoginHooks.i_provide_valid_username_and_invalid_password()"
});
formatter.result({
  "duration": 184268800,
  "status": "passed"
});
formatter.match({
  "location": "IncorrectLoginHooks.i_should_view_a_error_message()"
});
formatter.result({
  "duration": 751595800,
  "error_message": "org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression //span[contains(text(),\u0027Login was unsuccessful.\u0027] because of the following error:\nSyntaxError: Failed to execute \u0027evaluate\u0027 on \u0027Document\u0027: The string \u0027//span[contains(text(),\u0027Login was unsuccessful.\u0027]\u0027 is not a valid XPath expression.\n  (Session info: chrome\u003d85.0.4183.121)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:53\u0027\nSystem info: host: \u0027LAPTOP-2UMOGMU0\u0027, ip: \u0027192.168.1.110\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.121, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\DEEKSH~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:63202}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 9eaed015ad428250cc7868cdbe0d9d03\n*** Element info: {Using\u003dxpath, value\u003d//span[contains(text(),\u0027Login was unsuccessful.\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepDefinition.IncorrectLoginHooks.i_should_view_a_error_message(IncorrectLoginHooks.java:31)\r\n\tat ✽.Then I should view a error message(Features/hooks.feature:11)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 94801200,
  "status": "passed"
});
});