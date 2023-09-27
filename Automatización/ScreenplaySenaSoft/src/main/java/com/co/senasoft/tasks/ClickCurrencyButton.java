package com.co.senasoft.tasks;

import com.co.senasoft.userinterfaces.AttractionsSearchResultsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickCurrencyButton implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AttractionsSearchResultsPage.BTN_CURRENCY)
        );
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                Click.on(AttractionsSearchResultsPage.BTN_SELECT_CURRENCY)
        );
    }
    public static ClickCurrencyButton clickCurrencyButton(){
        return Tasks.instrumented(ClickCurrencyButton.class);
    }
}
