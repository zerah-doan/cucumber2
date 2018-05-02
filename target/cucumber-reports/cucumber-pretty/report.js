$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testGoogle.feature");
formatter.feature({
  "line": 1,
  "name": "test google page functionality",
  "description": "",
  "id": "test-google-page-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7882408260,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Search simple word",
  "description": "",
  "id": "test-google-page-functionality;search-simple-word",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@TagB"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I open yahoo search",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefs.java:32"
});
formatter.result({
  "duration": 833570821,
  "status": "passed"
});
formatter.after({
  "duration": 1215717968,
  "status": "passed"
});
});