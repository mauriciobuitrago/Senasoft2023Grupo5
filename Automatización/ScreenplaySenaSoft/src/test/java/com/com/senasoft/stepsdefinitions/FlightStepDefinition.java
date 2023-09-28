package com.com.senasoft.stepsdefinitions;

import com.co.senasoft.tasks.ClickCloseModal;
import com.co.senasoft.tasks.ClickFlightButton;
import com.co.senasoft.tasks.SearchFlight;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;

public class FlightStepDefinition {
    @When("^he goes to the flight section$")
    public void heGoesToTheFlightSection() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickCloseModal.ClickClose());
        OnStage.theActorInTheSpotlight().attemptsTo(ClickFlightButton.clickButtonflight());

    }

    @And("^search for a flight$")
    public void searchForAFlight() {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchFlight.searchFlight());

    }

    @And("^the user enter his data for the flight$")
    public void theUserEnterHisDataForTheFlight() {

    }

    @Then("^he should see the payment gateway$")
    public void heShouldSeeThePaymentGateway() {

    }
}
