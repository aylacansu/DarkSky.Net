package runnerTest;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
// This creates cucumber reports
        plugin = {"pretty", "html:target/site/cucumber-pretty", "json:target/cucumber-html-reports/cucumber.json"},
        //This create auto method name in camelCase
        snippets = cucumber.api.SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false,
        //Path to your feature file
        features = {"src/test/resources/Features"},
        // Specify tags to be executed
        tags = {"@Lowest_Highest_Temprature"}, // to run all sceniario
        //Specify step definition package name (Note: make sure to have this package on current directory)
        glue = {"StepDefinition"}

        //pretty provides readable format



)


public class TestRunner {
    //don't write any code
}

