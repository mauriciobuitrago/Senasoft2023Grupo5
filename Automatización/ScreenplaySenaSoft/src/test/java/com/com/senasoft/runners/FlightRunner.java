package com.com.senasoft.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/reserva_vuelo.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "com.com.senasoft.stepsdefinitions"
)
public class FlightRunner {
}
