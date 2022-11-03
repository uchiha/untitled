package runners.first;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
//                objectFactory = CustomObjectFactoryTwo.class,
                features = {"src/test/java/features"},
                glue = {"stepdefinitions"},
                plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber.json"}
        )
public class SampleTestNgRunner extends AbstractTestNGCucumberTests {
}
