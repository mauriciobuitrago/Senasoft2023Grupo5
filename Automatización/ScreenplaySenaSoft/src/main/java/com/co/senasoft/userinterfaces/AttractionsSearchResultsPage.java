package com.co.senasoft.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AttractionsSearchResultsPage {
    public static final Target BTN_CURRENCY = Target.the("it is used to change the currency")
            .locatedBy("//span[@class=\"e4adce92df\"]");

    public static final Target BTN_SELECT_CURRENCY = Target.the("it is used to change the currency")
            .locatedBy("//span[@class=\"cf67405157\"]");

    public static final Target LBL_PRICE = Target.the("it is used to compare a text")
            .locatedBy("//div[contains(text(),'US$16')]");


}
