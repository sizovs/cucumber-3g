package cukes.stepdefs

import com.google.inject.Guice
import cukes.world.ScenarioWorldModule
import cukes.world.ScenarioWorldWithDependencies

import static cucumber.api.groovy.Hooks.World

World {
    def injector = Guice.createInjector(new ScenarioWorldModule())
    def world = injector.getInstance(ScenarioWorldWithDependencies)
    world
}