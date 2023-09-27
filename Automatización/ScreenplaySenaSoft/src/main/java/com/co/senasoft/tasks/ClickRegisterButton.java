package com.co.senasoft.tasks;

import com.co.senasoft.userinterfaces.HomePage;
import com.co.senasoft.userinterfaces.OptionComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickRegisterButton implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.BTN_CLOSE_MODAL),
                Click.on(OptionComponent.BTN_CREAR_CUENTA)
        );
    }

    public static ClickRegisterButton clickButton()
    {
        return Tasks.instrumented(ClickRegisterButton.class);
    }
}
