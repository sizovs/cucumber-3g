package cukes.world

import com.google.inject.Inject
import groovy.transform.CompileStatic

@CompileStatic
class Mailbox {

    @Inject
    User user

    def messages = []

    def checkMailbox() {
        messages = new Message(text: "Welcome, $user.name")
    }

    def hasMessageWithText(String text) {
        messages.any { Message it -> it.text == text }
    }

    static class Message {
        def text
    }

}
