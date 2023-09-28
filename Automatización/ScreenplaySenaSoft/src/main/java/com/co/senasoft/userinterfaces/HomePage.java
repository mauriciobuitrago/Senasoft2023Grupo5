package com.co.senasoft.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target BTN_CLOSE_MODAL = Target.the("close modal")
            .locatedBy("//button[@aria-label= 'Ignorar información sobre el inicio de sesión.']");

    public static final Target BTN_FLIGHTS = Target.the("it is used to click on flights")
            .locatedBy("  //a[@id=\"flights\"]");



}
