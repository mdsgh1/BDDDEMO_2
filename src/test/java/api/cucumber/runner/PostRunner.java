package api.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/api/cucumber/features/posts.feature"},glue = {"api.cucumber.steps"},plugin = {"pretty","html:target/Htmlreports"}, tags = "@SmokeTest")
public class PostRunner {
}
