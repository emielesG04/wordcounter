#Author: elvismieles@gmail.com

Feature: write text
  As a user of the system
  I want to enter a text
  To count the words and characters in the text

  Background:
    Given I log in the page

  Scenario: Message when there is no text
    Then I see the message Start typing, or copy and paste your document here...