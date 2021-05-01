package runner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports",
                "json:target/json-report/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = ".\\src\\test\\resources\\features"  ,
        glue = "database.stepdefinitions",
        tags= "@dbread",
        dryRun = true

)

public class DBRunner {

}
