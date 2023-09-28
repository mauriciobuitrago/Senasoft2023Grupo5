package com.co.senasoft.tasks;

import com.co.senasoft.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickFlightButton implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.BTN_FLIGHTS));
    }
    public static ClickFlightButton clickButtonflight()
    {
        return Tasks.instrumented(ClickFlightButton.class);
    }
}
