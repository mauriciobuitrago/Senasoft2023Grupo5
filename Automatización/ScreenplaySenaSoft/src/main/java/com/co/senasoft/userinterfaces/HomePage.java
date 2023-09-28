package com.co.senasoft.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target BTN_CLOSE_MODAL = Target.the("close modal")
            .locatedBy("//button[@aria-label= 'Ignorar información sobre el inicio de sesión.']");
    public static final Target TXT_DESTINY = Target.the("it is used to enter the destiny location")
            .locatedBy("//input[@name = 'ss']");
    public static final Target BTN_DESTINY = Target.the("it is used to select the destiny location")
            .locatedBy("//ul[@class = 'a72ed04875']//li[1]");
    public static final Target TXT_CHECKIN_DATE= Target.the("it is used to select the checkin date")
            .locatedBy("//span[@data-date= '2023-09-29']");
    public static final Target TXT_CHECKOUT_DATE= Target.the("it is used to select the checkOUT date")
            .locatedBy("//span[@data-date= '2023-10-04']");

    public static final Target BTN_SEARCH_FILTERS= Target.the("it is used to click on the filters")
            .locatedBy("//button[@data-testid= 'occupancy-config']");
    public static final Target BTN_ADULT_INCREASE= Target.the("It is used to increase the number of adults")
            .locatedBy("//div[@class = 'df856d97eb']//div[1]//div[@class = 'bfb38641b0']//button[2]");
    public static final Target BTN_CHILDREN_INCREASE= Target.the("It is used to increase the number of children")
            .locatedBy("//div[@class = 'df856d97eb']//div[2]//div[@class = 'bfb38641b0']//button[2]");
    public static final Target BTN_SELECT_CHILDREN_AGE1= Target.the("It is used to click select children")
            .locatedBy("//div[@data-testid= 'kids-ages']/div[1]");
    public static final Target BTN_CHILDREN_AGE1= Target.the("It is used to select age")
            .locatedBy("//div[@data-testid= 'kids-ages']/div[1]//select//option[7]");
    public static final Target BTN_SELECT_CHILDREN_AGE2= Target.the("It is used to click select children2")
            .locatedBy("//div[@data-testid= 'kids-ages']/div[2]");
    public static final Target BTN_CHILDREN_AGE2= Target.the("It is used to select age2")
            .locatedBy("//div[@data-testid= 'kids-ages']/div[2]//select//option[6]");


    public static final Target BTN_ROOMS_INCREASE= Target.the("It is used to increase the number of rooms")
            .locatedBy("//div[@class = 'df856d97eb']//div[5]//button[2]");
    public static final Target BTN_READY= Target.the("It is used to confirm the filters")
            .locatedBy("//button[@class = 'a83ed08757 c21c56c305 bf0537ecb5 ab98298258 d2529514af af7297d90d d285d0ebe9']");
    public static final Target BTN_SEARCH= Target.the("It is used to confirm the filters")
                .locatedBy("//button[@class = 'a83ed08757 c21c56c305 a4c1805887 f671049264 d2529514af c082d89982 aa11d0d5cd']");

}
