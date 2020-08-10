$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MainPage.feature");
formatter.feature({
  "line": 3,
  "name": "Main page feature",
  "description": "",
  "id": "main-page-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@MainPage"
    }
  ]
});
formatter.before({
  "duration": 3631099040,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on Main Page",
  "keyword": "Given "
});
formatter.match({
  "location": "MainPageSD.verifyTitle()"
});
formatter.result({
  "duration": 184657970,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify Lowest Temprature is Displayed",
  "description": "",
  "id": "main-page-feature;verify-lowest-temprature-is-displayed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@Lowest_Highest_Temprature"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I click on Today button on Main Page",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I verify Lowest Tempreture is Displayed Correctly",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verify Highest Tempreture is Displayed Correctly",
  "keyword": "And "
});
formatter.match({
  "location": "MainPageSD.clickOnToday()"
});
formatter.result({
  "duration": 6145389768,
  "status": "passed"
});
formatter.match({
  "location": "MainPageSD.verifyminTemp()"
});
formatter.result({
  "duration": 11228299598,
  "status": "passed"
});
formatter.match({
  "location": "MainPageSD.verifymaxTemp()"
});
formatter.result({
  "duration": 12151745678,
  "status": "passed"
});
formatter.after({
  "duration": 128508213,
  "status": "passed"
});
});