package com.co.senasoft.tasks;

import com.co.senasoft.userinterfaces.HomePage;
import com.co.senasoft.userinterfaces.OptionComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickCloseModal implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.BTN_CLOSE_MODAL)
        );
    }
    public static ClickCloseModal ClickClose()
    {
        return Tasks.instrumented(ClickCloseModal.class);
    }
}
