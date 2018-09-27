package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(features ={"src/test/java/feature1"},glue = "Steps")
    public class testrunner_visa
    {



}
