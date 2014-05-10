package cukes.world

import com.google.inject.AbstractModule
import groovy.transform.CompileStatic

@CompileStatic
class ScenarioWorldModule extends AbstractModule {

    @Override
    protected void configure() {
        bindSingleton ScenarioWorldWithDependencies
        bindSingleton Mailbox
        bindSingleton User
    }

    def bindSingleton(Class clz) {
        bind(clz).in(com.google.inject.Singleton)
    }

}
