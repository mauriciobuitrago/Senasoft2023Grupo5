package com.co.senasoft.tasks;

import com.co.senasoft.userinterfaces.HomePage;
import com.co.senasoft.userinterfaces.ReservationFormPage;
import com.co.senasoft.userinterfaces.SearchResultsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class HotelReservation implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(SearchResultsPage.BTN_SLIDE_RESERVATION));
        actor.attemptsTo(Click.on(SearchResultsPage.BTN_SLIDE_RESERVATION));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(SearchResultsPage.BTN_RESERVA));
        actor.attemptsTo(Enter.theValue("Laura").into(ReservationFormPage.TXT_FIRST_NAME));
        actor.attemptsTo(Enter.theValue("Gomez").into(ReservationFormPage.TXT_LAST_NAME));
        actor.attemptsTo(Enter.theValue("josefergo98@gmail.com").into(ReservationFormPage.TXT_EMAIL));
        actor.attemptsTo(Click.on(ReservationFormPage.CHK_RESERVA));
        actor.attemptsTo(Enter.theValue("3135882901").into(ReservationFormPage.TXT_PHONE));
        actor.attemptsTo(Click.on(ReservationFormPage.SELECT_RESERVATION_HOUR));
        actor.attemptsTo(Click.on(ReservationFormPage.LBL_HOUR_RESERVATION));
        actor.attemptsTo(Click.on(ReservationFormPage.BTN_NEXT_STEP));
        actor.attemptsTo(Click.on(ReservationFormPage.CHK_ACEPT));
        actor.attemptsTo(Click.on(ReservationFormPage.BTN_CONFIRM_RESERVATION));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static HotelReservation reservation()
    {
        return Tasks.instrumented(HotelReservation.class);
    }
}
