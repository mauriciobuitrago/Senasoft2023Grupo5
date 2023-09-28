package com.com.senasoft.stepsdefinitions;

import com.co.senasoft.questions.ReservationValidation;
import com.co.senasoft.tasks.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class HotelReservationStepDefinition {


    @When("^the user applies the search filters$")
    public void theUserAppliesTheSearchFilters() throws InterruptedException {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchFilters.filter());
    }

    @And("^the user clicks the search button$")
    public void theUserClicksTheSearchButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickSearchButton.clickSearch());
    }

    @And("^the user apply more specific filters in search results$")
    public void theUserApplyMoreSpecificFiltersInSearchResults() throws InterruptedException {
        OnStage.theActorInTheSpotlight().attemptsTo(SpecificsFilters.specificsFilters());
        Thread.sleep(4000);
    }

    @And("^the user selects a hotel$")
    public void theUserSelectsAHotel() throws InterruptedException {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectHotel.selectHotel());
        Thread.sleep(2000);
    }
    // funciona hasta la pasarela de pago o reserva completa si es sin descuento genius
    // varian constantemente los hoteles
    @And("^the user makes the reservation$")
    public void theUserMakesTheReservation() throws InterruptedException {
        OnStage.theActorInTheSpotlight().attemptsTo(HotelReservation.reservation());
        Thread.sleep(1000);
    }

    @Then("^the user should see a confirmation message$")
    public void theUserShouldSeeAConfirmationMessage() {
        OnStage.theActorInTheSpotlight().can(GivenWhenThen.seeThat(ReservationValidation.lblCompare()
        , Matchers.is(true)));
    }
}
