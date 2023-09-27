package com.co.senasoft.tasks;

import com.co.senasoft.userinterfaces.OptionComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickLoginButton implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OptionComponent.BTN_CREAR_CUENTA)
        );
    }
    public static ClickLoginButton clickButtonLogin()
    {
        return Tasks.instrumented(ClickLoginButton.class);
    }

    }

