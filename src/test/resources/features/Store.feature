Feature: store data

  Scenario: user want to store the data

Given User go to “https://demoqa.com/books”
When User in “Book Store” page
And User search book “Git Pocket Guide”
And User click book “Git Pocket Guide”
Then User see “Git Pocket Guide”