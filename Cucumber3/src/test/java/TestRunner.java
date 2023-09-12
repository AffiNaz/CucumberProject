import org.junit.runner.RunWith;
import cucumber.api.junit.*;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Dell_PC1\\Documents\\Ebay\\FrameWork\\Cucumber\\Cucumber3\\src\\main\\java\\Features\\login2.feature",
		glue={"stepDefination"},
		monochrome = true,
		strict = true,
		dryRun = false
		)

public class TestRunner {

}
