package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Features/PlaceOrder.feature"},
		glue = {"StepDefinitions", "hooks"},
		plugin = {"pretty" ,
		          "html:target/HtmlReport.html"
		}
		
		)

public class TestRunner {
	

}
