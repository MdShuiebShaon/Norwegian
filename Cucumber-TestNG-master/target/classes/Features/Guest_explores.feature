Feature: explores shore excursions - By destinations , Port

Scenario: Guest explores shore excursions destinations

Given User is navigated to home Page
And   User navigated to Shore Excursion page
When  User search for destination Alaska Cruises
Then  Shore Excursions page is present
And   Results are filtered by Alaska Cruises
Then   Filter By Ports are only belong to Alaska, British Columbia
Then  Close the browser



		