package test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\features",
		glue = "step",
		tags = "",
		dryRun = false,
		monochrome = true,
		plugin = {
				"pretty",
				"html:target/reports/cucumber.html",
				"json:target/reports/cucumber1.json"
		}
		
		)


public class Runner {
	
}
