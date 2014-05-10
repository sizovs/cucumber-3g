package cukes

import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(Cucumber)
@Cucumber.Options(
        strict = true,
        format = ["pretty", "html:build/reports/cucumber"],
        features = ["src/test/resources/cukes"],
        glue = ["src/test/groovy/cukes/stepdefs"]
)

class RunCukesTest {

}
