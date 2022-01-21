Feature: Google Search
  As a user of google
  I am validating the search functionality.

  Background:
    Given I navigate to Google Search Page

  Scenario Outline: Search Cucumber keyword on Google with example
    When I enter search text "<search_keyword>" on search field and click on google search button
    Then I verify google search results are related to "<search_keyword>" keyword

    Examples:
    | search_keyword |
    | Cucumber       |