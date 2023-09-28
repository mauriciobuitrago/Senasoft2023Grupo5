package com.co.senasoft.tasks;

import com.co.senasoft.userinterfaces.FlightPage;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValueIntoTarget;
import net.serenitybdd.screenplay.actions.Scroll;

public class SearchFlight implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FlightPage.LBL_ORIGIN_FLIGHT),
                Click.on(FlightPage.LBL_CANCEL_PEREIRA),
               Enter.theValue("medellin").into(FlightPage.LBL_ORIGIN_FLIGHT_ENTER),
                Click.on(FlightPage.LBL_ORIGIN_CHECK),
                Click.on(FlightPage.LBL_DESTIMY_FLIGHT),
                Enter.theValue("monteria").into(FlightPage.LBL_DESTINATION_FLIGHT),
                Click.on(FlightPage.LBL_DESTINATION_CHECK),
                Click.on(FlightPage.BTN_SUBMIT_FLIGHT),
                Click.on(FlightPage.BTN_SEE_FLIGHT),
                Click.on(FlightPage.BTN_NEXT_FLIGHT)
        );
        actor.attemptsTo(Click.on(FlightPage.BTN_NEXT_AIR_TICKET));

        actor.attemptsTo(Scroll.to(FlightPage.TXT_EMAIL_FLIGHT),
                Enter.theValue("josegefor@gmail.com").into(FlightPage.TXT_EMAIL_FLIGHT),
                Enter.theValue("3103453656").into(FlightPage.TXT_NUMBER_FLIGHT),
                Enter.theValue("Jose").into(FlightPage.TXT_FIRST_NAME_FLIGHT),
                Enter.theValue("Gomez").into(FlightPage.TXT_LAST_NAME_FLIGHT),
                Enter.theValue("josegefor@gmail.com").into(FlightPage.TXT_EMAIL_FLIGHT),
                Click.on(FlightPage.SELECT_GENDER_FLIGHT),
                Click.on(FlightPage.SELECT_GENDER_FLIGHT2),
                Enter.theValue("11").into(FlightPage.TXT_BIRTHDAY_DAY),
                Click.on(FlightPage.TXT_BIRTHDAY_MONTH),
                Enter.theValue("2002").into(FlightPage.TXT_BIRTHDAY_YEAR),
                Click.on(FlightPage.BTN_NEXT_DATA));


    }
    public static SearchFlight searchFlight()
    {
        return Tasks.instrumented(SearchFlight.class);}
}
