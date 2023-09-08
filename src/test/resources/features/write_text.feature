#Author: elvismieles@gmail.com

Feature: write text
  As a user of the system
  I want to enter a text
  To count the words and characters in the text

  Background:
    Given I log in the page
  @ValidateCounter
  Scenario: Message when there is no text
    Then I see the 0 words 0 characters

  @ValidateCounter @AddText
  Scenario Outline: Copy text
    When he enters the text <text>
    Then I see the <message>

    Examples:
    |text                                              |message              |
    |I'm Elvis M Honeys QA Automation                  |6 words 32 characters|
    |I'm Elvis M Mieles System Engineer QA Automation  |8 words 48 characters|
    |I want to be part of the QA-lUMU family           |9 words 39 characters|
