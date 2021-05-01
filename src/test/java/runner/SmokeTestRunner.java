package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports3",
                "json:target/json-report/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = ".\\src\\test\\resources\\features"  ,
        glue = "stepdefinitions",
        tags= "@smoke",
        dryRun = false

)


public class SmokeTestRunner {
}
