package Runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
features = "G:\\Siddharth\\Workspace\\latest\\BDDCucumber\\Feature_Files\\test.feature"
,glue={"StepDefinition"}
)

public class testRunner {

}
