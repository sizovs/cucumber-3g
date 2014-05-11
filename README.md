## Example integration of Cucumber, Groovy, Guice and Gradle

### Features
- Thread-safe parallel scenario execution
- Sharing state among step definitions 
- IntelliJ-friendly package layout which does not require Glue path modification
- Scenario execution during Gradle "test" task
- Simplicity :)

### Solution description
The basic idea is to make proper use of World - an object which stepdefs delegate to and which is unique to every scenario. In this solution World keeps references to all Guice-managed dependencies which are directly accessible from stepdefs. IntelliJ makes sure dependencies from World are visible inside stepdefs.

### Technical details
Env.groovy lives in the directory where stepdefs live and is therefore picked by Cucumber backend. Env.groovy registers special World closure which is invoked before each scenario. An object returned by the closure is set as a delegate for a scenario. The trick is to return a new, independent World object built from a fresh Guice Injector. Because scenarios do not share instances of Guice dependencies, it's possible to convey state in singletons without worrying about isolation.

### Notes
It's important to keep all step definitions within the same directory, otherwise Env.groovy might not be loaded when scenario is launched from IntelliJ due to Cucumber Plugin implementation specifics. 

