package cukes.stepdefs

import static cucumber.api.groovy.EN.Given

Given(~'^I am "([^"]*)"$') { String username ->
    user.name = username
}