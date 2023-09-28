package com.co.senasoft.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FlightPage {
    public static final Target LBL_ORIGIN_FLIGHT = Target.the("it is used to click the origin")
            .locatedBy("//span[contains(text(),'Aeropuerto internacional Matecaña')]");
    public static final Target LBL_CANCEL_PEREIRA = Target.the("it is used to click delete")
            .locatedBy("//span[contains(text(),'Pereira')]");

    public static final Target LBL_ORIGIN_FLIGHT_ENTER= Target.the("it is used to enter de origin")
            .locatedBy(" //input[@class=\"css-x72e3o \"]");
    public static final Target LBL_ORIGIN_CHECK = Target.the("it is used to enter de destination")
            .locatedBy("//span[@class=\"css-3cj1dx\"]");
    public static final Target LBL_DESTIMY_FLIGHT = Target.the("it is used to click the destiny")
            .locatedBy("//span[contains(text(),'¿A dónde?')]");

    public static final Target LBL_DESTINATION_FLIGHT= Target.the("it is used to enter de destination")
            .locatedBy(" //input[@class=\"css-x72e3o \"]");

    public static final Target LBL_DESTINATION_CHECK = Target.the("it is used to enter de destination")
            .locatedBy("//span[@class=\"css-3cj1dx\"]");


    public static final Target BTN_SUBMIT_FLIGHT = Target.the("it is used to submit the flight information")
            .locatedBy("//button[@data-ui-name=\"button_search_submit\"]");


    public static final Target BTN_SEE_FLIGHT = Target.the("it is used to see the flight information")
            .locatedBy("//button[@data-testid=\"flight_card_bound_select_flight\"]");


    public static final Target BTN_NEXT_FLIGHT = Target.the("it is used to click the next button")
            .locatedBy("//div[@data-testid=\"flight_details_inner_modal_select_button\"]");

    public static final Target BTN_NEXT_AIR_TICKET = Target.the("it is used to click the next button of air ticket")
            .locatedBy("//div[@data-testid=\"checkout_ticket_type_inner_next\"]");

    public static final Target TXT_EMAIL_FLIGHT = Target.the("it is used to enter the email")
            .locatedBy("//input[@name=\"booker.email\"]");


    public static final Target TXT_NUMBER_FLIGHT = Target.the("it is used to enter the number")
            .locatedBy("//input[@name=\"number\"]");

    public static final Target BTN_NEXT_DATA_FLIGHT2 = Target.the("it is used to click on the next button")
            .locatedBy("//div[@data-testid=\"checkout_extras_inner_next\"]");
    public static final Target BTN_PASSENGER = Target.the("it is used to click on the next button")
            .locatedBy("//div[@data-testid=\"passenger_title\"]");



    public static final Target TXT_FIRST_NAME_FLIGHT = Target.the("it is used to enter the first name")
            .locatedBy("//input[name=\"passengers.0.firstName\"]");

    public static final Target TXT_LAST_NAME_FLIGHT = Target.the("it is used to enter the last name ")
            .locatedBy("//input[@name=\"passengers.0.lastName\"]");

    public static final Target SELECT_GENDER_FLIGHT = Target.the("it is used to click the gender")
            .locatedBy("//input[@name=\"passengers.0.gender\"]");

    public static final Target SELECT_GENDER_FLIGHT2 = Target.the("it is used to select the gender")
            .locatedBy("//select[@name=\"passengers.0.gender\"]//option[2]");
    public static final Target TXT_BIRTHDAY_DAY = Target.the("it is used to enter the day of birthday")
            .locatedBy("//input[@placeholder=\"DD\"]");

    public static final Target TXT_BIRTHDAY_MONTH = Target.the("it is used to enter the month of birthday")
            .locatedBy("//select[@data-testid=\"traveller_data_field_passenger_0_mm\"]//option[05]");
    public static final Target TXT_BIRTHDAY_YEAR = Target.the("it is used to enter the year of birthday")
            .locatedBy("//select[@data-testid=\"traveller_data_field_passenger_0_yyyy\"]");

    public static final Target BTN_NEXT_DATA = Target.the("it is used to click on the next button")
            .locatedBy("//div[@data-testid=\"checkout_extras_inner_next\"]");




















}
