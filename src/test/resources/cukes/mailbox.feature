Feature: Mailbox

  Scenario: Registered users have a new message in the mailbox #1
    Given I am "Johnny"
    When I check my mailbox
    Then I should have a "Welcome, Johnny" message

  Scenario: Registered users have a new message in the mailbox #2
    Given I am "Eduards"
    When I check my mailbox
    Then I should have a "Welcome, Eduards" message