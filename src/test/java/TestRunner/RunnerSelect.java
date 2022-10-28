package TestRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import  org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Users//Calvin Nurcahya//IdeaProjects//ui Automation//src//test//resources//features//SelectMenu.feature",
        glue = "StepDef"
)
public class RunnerSelect {
}
