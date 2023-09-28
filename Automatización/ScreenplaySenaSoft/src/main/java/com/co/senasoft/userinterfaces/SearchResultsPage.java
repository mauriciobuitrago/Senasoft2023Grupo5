package com.co.senasoft.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SearchResultsPage {

    public static final Target CKH_HOTEL_STARS = Target.the("starts")
            .locatedBy("//div[contains(text(),'3 estrellas')]");
    public static final Target SELECT_FILTER = Target.the("starts")
            .locatedBy("//button[@data-testid = 'sorters-dropdown-trigger']");
    public static final Target BTN_LOWER_PRICE = Target.the("starts")
            .locatedBy("//button[@data-id = 'price']");
    public static final Target BTN_HOTEL_DISPONIBILITY = Target.the("holterl")
            .locatedBy("//div[@class = 'd4924c9e74']//div[3]//div[2]/div/div/div/div//div/div[1]");
    public static final Target BTN_SLIDE_RESERVATION = Target.the("holter pruebailo")
            .locatedBy("//a[@data-testid='Property-Header-Nav-Tab-Trigger-facilities']");
}
