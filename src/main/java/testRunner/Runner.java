package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        features = "/Users/v.a.choudhary/Downloads/CucumberPOM/src/main/java/features/",
        plugin={ "pretty","html: cucumber-html-reports", "json: cucumber-html-reports/cucumber.json" },
        dryRun = false,
        glue = "stepDefinitions"

)

public class Runner {
}
