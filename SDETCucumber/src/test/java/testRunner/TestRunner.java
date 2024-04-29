package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "features" }, glue = { "steps" }, plugin = { "pretty",
"html:TestReport.html" }, dryRun = false, monochrome = false, tags = "@P1", name = { "Link" })
public class TestRunner {

}
