@sampleTest
Feature: Choosing a country
  Scenario: We are able to choose a country

    Given open https://riskmarket-ext.sidenis.com/
    When user inputs "Шенген" in element
    Then green baloon with text appears in country widget
    When a user clicks on the field "Туристы" in the element
    Then Enter the date "11.12.2001"
    Then Set flag to checkbox
    When Click on the "Dates" field
    When the user clicks on the field "Tourists" in the element
    Then Enter the date "11.12.2001"
    Then Set flag to checkbox
    Then Click on the "Dates" field
    Then Click on the number in the calendar
    When Click the button "Calculate"