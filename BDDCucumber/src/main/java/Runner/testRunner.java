package Runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


//@RunWith(Cucumber.class)
@CucumberOptions(
features = "G:\\Siddharth\\Workspace\\latest\\BDDCucumber\\Feature_Files\\test.feature"
,glue={"StepDefinition"}
//plugin= {"pretty"},
//monochrome=true
)

public class testRunner extends AbstractTestNGCucumberTests {

}
