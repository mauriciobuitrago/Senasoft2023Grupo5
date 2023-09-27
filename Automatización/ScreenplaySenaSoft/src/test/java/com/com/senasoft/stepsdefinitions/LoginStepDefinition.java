package com.com.senasoft.stepsdefinitions;

import com.co.senasoft.models.LoginData;
import com.co.senasoft.models.RegisterData;
import com.co.senasoft.questions.ValidationLogin;
import com.co.senasoft.tasks.ClickCloseModal;
import com.co.senasoft.tasks.ClickLoginButton;
import com.co.senasoft.tasks.Login;
import com.co.senasoft.tasks.Register;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

public class LoginStepDefinition {
    @And("^the user clicks on the 'iniciar sesion' button$")
    public void theUserClicksOnTheIniciarSesionButton() throws InterruptedException {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickCloseModal.ClickClose());
        OnStage.theActorInTheSpotlight().attemptsTo(ClickLoginButton.clickButtonLogin());
        Thread.sleep(3000);
    }

    @When("^the user enter his login data$")
    public void theUserEnterHisLoginData(List<LoginData> loginDataList) throws InterruptedException {
        LoginData loginData;
        loginData = loginDataList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enterData2(loginData));
        Thread.sleep(1000);
    }

    @Then("^the user should see the successful login$")
    public void theUserShouldSeeTheSuccessfulLogin() {
      OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationLogin.validationText()
              , Matchers.is("¿Eres un robot?")));

    }


}
