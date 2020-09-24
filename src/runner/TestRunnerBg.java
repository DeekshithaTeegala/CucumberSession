package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/bgdemo.feature",glue= {"stepDefinition"},
      plugin= {"pretty","html:test-output/dt-report","json:json_output/cucumberdt_report","junit:junit_xml/cucumber-dt.xml"},
      monochrome=true)
public class TestRunnerBg {

}
