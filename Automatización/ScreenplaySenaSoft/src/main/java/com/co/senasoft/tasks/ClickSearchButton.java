package com.co.senasoft.tasks;

import com.co.senasoft.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.AWTException;


public class ClickSearchButton implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(HomePage.BTN_SEARCH));
    }

    public static ClickSearchButton clickSearch()
    {
        return Tasks.instrumented(ClickSearchButton.class);
    }
}
