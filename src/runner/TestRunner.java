package runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		//format={"pretty"},
		features = "src/feature/",
		glue = {"stepDefinitions"}
		,tags = {"@FillDetails"}
		)
 
public class TestRunner {
}