package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class) //JUnit
@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue = {"steps", "hook", "custom_hook"},
        tags = "@Test",
        plugin = {"rerun:target/rerun.txt", "json:target/reports/cucumber_1.json"}
)
public class Runner {

}
