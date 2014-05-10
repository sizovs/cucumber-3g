## Example integration of Cucumber, Groovy, Guice and Gradle which supports:
- Thread-safe parallel scenario execution
- Sharing state among step definitions 
- IntelliJ-friendly package layout which does not require Glue path modification
- Test execution during Gradle "test" task


## Idea
The basic idea is to make proper use of World - an object that stepdefs delegate to which is unique to every scenario. 
In our case World keeps references to all Guice-managed dependencies which are directly accessible from stepdefs. One cool think about is that IntelliJ makes sure dependencies from World are visible inside stepdefs.

## Technical stuff
Env.groovy lives in the same directory as stepdefs live and thus is picked by Cucumber backend. 
Env.groovy registers special World closure which is invoked before each scenario. 
An object returned by the closure is set as a delegate for scenario. The trick is to return the whole new World.

registers special World closure which gets called before every scenario. 
