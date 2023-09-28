package com.co.senasoft.tasks;

import com.co.senasoft.userinterfaces.HomePage;
import com.co.senasoft.userinterfaces.SearchResultsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;



public class SpecificsFilters implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(SearchResultsPage.CKH_HOTEL_STARS),
                Click.on(SearchResultsPage.CKH_HOTEL_STARS),
                Click.on(SearchResultsPage.SELECT_FILTER),
                Click.on(SearchResultsPage.BTN_LOWER_PRICE)
        );
    }

    public static SpecificsFilters specificsFilters()
    {
        return Tasks.instrumented(SpecificsFilters.class);
    }
}
