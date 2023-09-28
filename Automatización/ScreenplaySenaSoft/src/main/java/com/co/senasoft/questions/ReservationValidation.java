package com.co.senasoft.questions;

import com.co.senasoft.userinterfaces.ReservationFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ReservationValidation implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(ReservationFormPage.LABEL_RESERVATION_VALIDATION).viewedBy(actor).asBoolean();
    }

    public static ReservationValidation lblCompare()
    {
        return new ReservationValidation();
    }
}
