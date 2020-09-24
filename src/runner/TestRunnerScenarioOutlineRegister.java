package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/scenarioOutlineDemo.feature",glue= {"stepDefinition"},
      plugin= {"pretty","html:test-output/dt-report","json:json_output/cucumberdt_report","junit:junit_xml/cucumber-dt.xml"},
      monochrome=true)
//tags= {"@valid"},
public class TestRunnerScenarioOutlineRegister {

}
