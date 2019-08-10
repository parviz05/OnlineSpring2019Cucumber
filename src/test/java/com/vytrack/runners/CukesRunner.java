package com.vytrack.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},// to specify where are the features
        //features contains scenarios
        //every scenario is like a test
        glue = {"com/vytrack/step_definitions/LoginStepDefinitions.java"},//where is the implementation for features

        //dryRun to generate step  definitions automatically
        // u will see them in the console output
        dryRun = true

)
public class CukesRunner {
}
