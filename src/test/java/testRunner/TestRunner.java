package testRunner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions( 
features = "src/test/java/features"
,glue= {"seleniumGlueCode"}
)


public class TestRunner {

}
