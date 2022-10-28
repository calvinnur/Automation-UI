Feature: search in book feature

  Scenario: user want to search in book feature

    Given User go to “https://demoqa.com/books”
    When User in “Book Store” page
    And User search book “qa engineer”
    Then User see “No rows found”