package cukes.stepdefs

import static cucumber.api.groovy.EN.Then
import static cucumber.api.groovy.EN.When

When(~'^I check my mailbox$') { ->
    mailbox.checkMailbox()
}

Then(~'^I should have a "([^"]*)" message') { String message ->
    mailbox.hasMessageWithText(message)
}


