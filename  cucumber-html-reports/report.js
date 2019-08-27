$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:SecurePay.feature");
formatter.feature({
  "name": "Secure pay contact us page validation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Auto generating data to fill on contact us form",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Customer launches browser",
  "keyword": "Given "
});
formatter.match({
  "location": "NavigateContactUS.Customer_launch_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search for Secure pay on Google home page",
  "keyword": "When "
});
formatter.match({
  "location": "NavigateContactUS.Google_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to Secure pay",
  "keyword": "And "
});
formatter.match({
  "location": "NavigateContactUS.LaunchSecurePay()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to Contact us page",
  "keyword": "And "
});
formatter.match({
  "location": "NavigateContactUS.ContactUsPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Contact us page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "NavigateContactUS.ContactUsValidation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Fill the details in Contact us form",
  "keyword": "Then "
});
formatter.match({
  "location": "NavigateContactUS.FillContactUsForms()"
});
formatter.result({
  "status": "passed"
});
});