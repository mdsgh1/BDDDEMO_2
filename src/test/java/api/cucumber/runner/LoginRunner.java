package api.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (features = {"src/test/java/api/cucumber/features/loginwithexample.feature"},glue = {"api.cucumber.steps"},
        //plugin = {"pretty","html:target/Htmlreports"})
        plugin = {"pretty","json:target/report.json"})
        //plugin = {"pretty","junit:target/report.xml"})
public class LoginRunner {
}
