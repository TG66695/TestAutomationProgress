package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"steps", "hook"},
        tags = "@Test",
        plugin = {"rerun:target/rerun.txt", "json:target/reports/cucumber.json"}

)
public class TestRunner {

}
