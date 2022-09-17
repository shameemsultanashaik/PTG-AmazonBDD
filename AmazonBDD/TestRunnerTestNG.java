package runner;

//  import org.junit.runner.RunWith;

// import cucumber.api.testng.AbstractTestNGCucumberTests;
// import io.cucumber.junit.Cucumber;
 // import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// @RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",glue={"glueCode"},plugin= {"pretty","json:target/cucumber.json"})
public class TestRunnerTestNG extends AbstractTestNGCucumberTests{

}
