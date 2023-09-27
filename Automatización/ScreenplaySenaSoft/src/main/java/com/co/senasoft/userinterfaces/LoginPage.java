package com.co.senasoft.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target TXT_EMAIL = Target.the("it is used to enter the email")
            .locatedBy("//input[@name = 'username']");
    public static final Target BTN_SEND_EMAIL = Target.the("it is used to send the email")
            .locatedBy("//span[contains(text(),'Continuar con e-mail')]");

    public static final Target TXT_PASSWORD = Target.the("it is used to enter the password")
            .locatedBy("//input[@name='password']");

    public static final Target BTN_LOGIN  = Target.the("it is used to log in")
            .locatedBy("//button[@class = 'Iiab0gVMeWOd4XcyJGA3 wPxWIS_rJCpwAWksE0s3 Ut3prtt_wDsi7NM_83Jc TuDOVH9WFSdot9jLyXlw EJWUAldA4O1mP0SSFXPm whxYYRnvyHGyGqxO4ici']");

    public static final Target LBL_VALIDATION = Target.the("It is used to compare the final text")
            .locatedBy("//h3[contains(text(),\"¿Eres un robot?\")]");

    public static final Target LBL_WRONG_PASSWORD = Target.the("It is used to enter the wrong password")
            .locatedBy("//h3[contains(text(),'¿Eres un robot?')]");

}
