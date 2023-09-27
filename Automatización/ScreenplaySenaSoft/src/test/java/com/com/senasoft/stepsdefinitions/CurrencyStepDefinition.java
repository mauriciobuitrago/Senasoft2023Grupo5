package com.com.senasoft.stepsdefinitions;

import com.co.senasoft.Questions.ValidationCurrency;
import com.co.senasoft.Questions.ValiditionWrongLogin;
import com.co.senasoft.tasks.ClickCurrencyButton;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class CurrencyStepDefinition {
    @Given("^the user is on the web page$")
    public void theUserIsOnTheWebPage() throws InterruptedException {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com/attractions/searchresults/co/medellin.html?label=es-co-booking-desktop-vjGZbEFOhRc3a9njxeT3IwS652829002024%25253Apl%25253Ata%25253Ap1%25253Ap2%25253Aac%25253Aap%25253Aneg%25253Afi%25253Atikwd-65526620%25253Alp1003665%25253Ali%25253Adec%25253Adm&aid=2311236&start_date=2023-10-01&source=search_box"));
        Thread.sleep(3000);
    }

    @When("^the user clicks on the currency icon to change it$")
    public void theUserClicksOnTheCurrencyIcon() throws InterruptedException {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickCurrencyButton.clickCurrencyButton());
        Thread.sleep(3000);
    }

    @Then("^the user should see the succesful currency exchange$")
    public void theUserShouldSeeTheSuccesfulCurrencyExchange() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationCurrency.validationCurrency()
                , Matchers.is("US$16")));

    }

}
