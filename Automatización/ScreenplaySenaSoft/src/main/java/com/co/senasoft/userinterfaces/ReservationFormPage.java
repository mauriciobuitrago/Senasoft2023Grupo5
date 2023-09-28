package com.co.senasoft.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ReservationFormPage {

    public static final Target TXT_FIRST_NAME = Target.the("it is used to enter the first name")
            .locatedBy("//input[@name = 'firstname']");
    public static final Target TXT_LAST_NAME = Target.the("it is used to enter the last name")
            .locatedBy("//input[@name = 'lastname']");
    public static final Target TXT_EMAIL = Target.the("it is used to enter the email")
            .locatedBy("//input[@id= 'email']");
    public static final Target TXT_PHONE = Target.the("it is used to enter the phone")
            .locatedBy("//Input[@id='phone']");
    public static final Target CHK_RESERVA = Target.the("it is used to check reservation for me")
            .locatedBy("//div[@class= 'bp-personal-details-form']//div[6]//div[1]//div/div");
    public static final Target SELECT_RESERVATION_HOUR = Target.the("it is used to click to select hour")
            .locatedBy("//div[@class= 'bui-input-select']");
    public static final Target LBL_HOUR_RESERVATION = Target.the("it is used to select hour")
            .locatedBy("//div[@class= 'bui-input-select']//option[4]");
    public static final Target BTN_NEXT_STEP = Target.the("it is used to navigate to next step")
            .locatedBy("//span[contains(text(),' Siguiente: últimos datos ')]");
    public static final Target CHK_ACEPT = Target.the("it is used to acept important data")
            .locatedBy("//div[@class='bui-card bp-card--privacy-consent-container bui-spacer--large  bui-u-bleed@small']//div//div//div/label");
    public static final Target BTN_CONFIRM_RESERVATION = Target.the("it is used to confirm reservation")
            .locatedBy("//button[@name = 'book']");
    public static final Target LABEL_RESERVATION_VALIDATION = Target.the("it is used to compare text validation")
            .locatedBy("//span[@class = 'conf-page-gem-offers__badge-text']");

}
