package com.co.senasoft.Questions;

import com.co.senasoft.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValiditionWrongLogin implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LoginPage.LBL_WRONG_PASSWORD).viewedBy(actor).asString();
    }

    public static ValiditionWrongLogin validitionWrongLogin(){
        return new ValiditionWrongLogin();
    }

}
