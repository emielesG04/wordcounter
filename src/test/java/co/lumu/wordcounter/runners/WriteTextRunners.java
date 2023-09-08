package co.lumu.wordcounter.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/write_text.feature",
        glue = {"co.lumu.wordcounter.stepdefinitions","co.lumu.wordcounter.setup"},
        snippets = CucumberOptions.SnippetType.CAMELCASE, tags = "")
public class WriteTextRunners {
}
