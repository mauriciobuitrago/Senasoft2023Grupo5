package com.co.senasoft.Questions;

import com.co.senasoft.userinterfaces.AttractionsSearchResultsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidationCurrency implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(AttractionsSearchResultsPage.LBL_PRICE).viewedBy(actor).asString();
    }
    public static ValidationCurrency validationCurrency(){
        return new ValidationCurrency();
    }
}
