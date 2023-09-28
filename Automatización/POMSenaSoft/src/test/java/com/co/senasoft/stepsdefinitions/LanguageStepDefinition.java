package com.co.senasoft.stepsdefinitions;

import com.co.senasoft.pageobjects.HomePage;
import com.co.senasoft.steps.LanguageStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class LanguageStepDefinition {
    @Steps
    LanguageStep languageStep;

    @Given("that the user in on the page")
    public void thatTheUserInOnThePage() {
        languageStep.openBrowser();
    }

    @When("he clicks on the language icon")
    public void heClicksOnTheLanguageIcon() {
        languageStep.CloseModal();
        languageStep.ClickListLanguaje();
    }

    @And("clicks on Deutsch")
    public void clicksOnDeutsch() {
        languageStep.ClickLanguaje();
    }

    @Then("He shoud see the page in Deutsch")
    public void heShoudSeeThePageInDeutsch() {
        languageStep.Validation();
    }


}
