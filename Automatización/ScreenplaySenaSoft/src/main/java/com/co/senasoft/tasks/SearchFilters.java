package com.co.senasoft.tasks;

import com.co.senasoft.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.interactions.ClickAndHoldAction;

public class SearchFilters implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.BTN_CLOSE_MODAL));
        actor.attemptsTo(Enter.theValue("Pereira").into(HomePage.TXT_DESTINY));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(HomePage.BTN_DESTINY));
        actor.attemptsTo(
                Click.on(HomePage.TXT_CHECKIN_DATE),
                Click.on(HomePage.TXT_CHECKOUT_DATE),
                Click.on(HomePage.BTN_SEARCH_FILTERS),
                Click.on(HomePage.BTN_ADULT_INCREASE),
                Click.on(HomePage.BTN_CHILDREN_INCREASE),
                Click.on(HomePage.BTN_CHILDREN_INCREASE),
                Click.on(HomePage.BTN_SELECT_CHILDREN_AGE1),
                Click.on(HomePage.BTN_CHILDREN_AGE1),
                Click.on(HomePage.BTN_SELECT_CHILDREN_AGE2),
                Click.on(HomePage.BTN_CHILDREN_AGE2),
                Click.on(HomePage.BTN_ROOMS_INCREASE),
                Click.on(HomePage.BTN_READY)
        );
    }

    public static SearchFilters filter()
    {
        return Tasks.instrumented(SearchFilters.class);
    }
}
