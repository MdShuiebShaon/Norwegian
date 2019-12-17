$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Guest_explores.feature");
formatter.feature({
  "line": 1,
  "name": "explores shore excursions - By destinations , Port",
  "description": "",
  "id": "explores-shore-excursions---by-destinations-,-port",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Guest explores shore excursions destinations",
  "description": "",
  "id": "explores-shore-excursions---by-destinations-,-port;guest-explores-shore-excursions-destinations",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is navigated to home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User navigated to Shore Excursion page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User search for destination Alaska Cruises",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Shore Excursions page is present",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Results are filtered by Alaska Cruises",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Filter By Ports are only belong to Alaska, British Columbia",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "guest_explores_stepdefinition.User_is_navigated_to_home_page()"
});
formatter.result({
  "duration": 41132151800,
  "status": "passed"
});
formatter.match({
  "location": "guest_explores_stepdefinition.User_navigated_to_Shore_Excursion_page()"
});
formatter.result({
  "duration": 13913156200,
  "status": "passed"
});
formatter.match({
  "location": "guest_explores_stepdefinition.User_search_for_destination_Alaska_Cruises()"
});
formatter.result({
  "duration": 19063960800,
  "status": "passed"
});
formatter.match({
  "location": "guest_explores_stepdefinition.Shore_Excursions_page_is_present()"
});
formatter.result({
  "duration": 80238000,
  "status": "passed"
});
formatter.match({
  "location": "guest_explores_stepdefinition.Results_are_filtered_by_Alaska_Cruises()"
});
formatter.result({
  "duration": 5904996300,
  "status": "passed"
});
formatter.match({
  "location": "guest_explores_stepdefinition.Filter_By_Ports_are_only_belong_to_Alaska_British_Columbia()"
});
formatter.result({
  "duration": 20521808500,
  "status": "passed"
});
formatter.match({
  "location": "guest_explores_stepdefinition.close_the_browser()"
});
formatter.result({
  "duration": 1055942900,
  "status": "passed"
});
});