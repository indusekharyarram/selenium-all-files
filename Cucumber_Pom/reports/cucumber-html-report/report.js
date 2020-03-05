$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/guru99.feature");
formatter.feature({
  "line": 2,
  "name": "Guru99 website",
  "description": "",
  "id": "guru99-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@guru99_Feature"
    }
  ]
});
formatter.scenario({
  "line": 15,
  "name": "",
  "description": "Check that main elements on a google homepage are displayed",
  "id": "guru99-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@tc02"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "launch an chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "the user opens google homepage",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "verify textbox",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "click the submit button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});