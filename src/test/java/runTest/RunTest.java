package runTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(snippets = CucumberOptions.SnippetType.CAMELCASE,
                features = {"src/test/resources/features/"},
                glue = {"curso.etech.steps", "curso.etech.configuration"},
                plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}, monochrome = true,
                tags = "@loginCorreto")

public class RunTest {
}
