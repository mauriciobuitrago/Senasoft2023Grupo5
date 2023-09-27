package com.com.senasoft.stepsdefinitions;

import com.co.senasoft.models.RegisterData;
import com.co.senasoft.tasks.ClickRegisterButton;
import com.co.senasoft.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class RegisterStepDefinition {
    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp()
    {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^the user enter to the web page$")
    public void theUserEnterToTheWebPage() throws InterruptedException {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com/"));
        Thread.sleep(3000);
    }

    @And("^the user clicks on the 'hazte una cuenta' button$")
    public void theUserClicksOnTheHazteUnaCuentaButton() throws InterruptedException {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickRegisterButton.clickButton());
        Thread.sleep(3000);
    }

    @When("^the user enter his data$")
    public void theUserEnterHisData(List<RegisterData> registerDataList) throws InterruptedException {
        RegisterData registerData;
        registerData = registerDataList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Register.enterData(registerData));
        Thread.sleep(3000);
    }

    @Then("^the user should see the succesful register$")
    public void heUserShouldSeeTheSuccesfulRegister() {

    }


}
