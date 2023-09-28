package com.co.senasoft.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/language.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = "com.co.senasoft.stepsdefinitions"
)
public class LanguageRunner {
}
