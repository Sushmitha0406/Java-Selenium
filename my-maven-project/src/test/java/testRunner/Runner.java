package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
    features={"src/test/java/features"},
    dryRun=!true,
    snippets=SnippetType.CAMELCASE,
    monochrome=true,
    glue={"steps", "hooks"},
    plugin={"pretty", "html:reports/CucumberReports.html", 
    "json:reports/result.json", "junit:reports/result.xml"}
    // tags="not @smoke"
    // tags="@smoke"
    // tags="@reg and @smoke"
    // tags="@prod, @reg"
    // tags="@E2E"
    )

public class Runner extends AbstractTestNGCucumberTests{

}
