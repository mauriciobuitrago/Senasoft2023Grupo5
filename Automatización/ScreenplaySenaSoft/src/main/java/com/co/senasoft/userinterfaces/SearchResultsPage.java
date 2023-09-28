package com.co.senasoft.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SearchResultsPage {
    public static final Target CKH_HOTEL_STARS = Target.the("its used to select valoration stars")
            .locatedBy("//div[contains(text(),'3 estrellas')]");
    public static final Target SELECT_FILTER = Target.the("its used to select filter")
            .locatedBy("//button[@data-testid = 'sorters-dropdown-trigger']");
    public static final Target BTN_LOWER_PRICE = Target.the("It is used to select the cheapest ones first")
            .locatedBy("//button[@data-id = 'price']");
    public static final Target BTN_HOTEL_DISPONIBILITY = Target.the("It is used to see hotel availability")
            .locatedBy("//div[@class = 'd4924c9e74']//div[3]//div[2]//h3");
    public static final Target BTN_SLIDE_RESERVATION = Target.the("It is used to scroll to the confirm reservation section")
            .locatedBy("//div[@id= 'group_recommendation']//table//td[3]//tr[2]/td/a");
    public static final Target BTN_RESERVA = Target.the("It is used to reserve and continue with the form steps")
            .locatedBy("//button[@class='txp-bui-main-pp bui-button bui-button--primary  hp_rt_input px--fw-cta js-reservation-button']");
}
