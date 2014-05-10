package cukes.world

import com.google.inject.Inject
import groovy.transform.CompileStatic

@CompileStatic
class ScenarioWorldWithDependencies {

    @Inject
    User user

    @Inject
    Mailbox mailbox

}
