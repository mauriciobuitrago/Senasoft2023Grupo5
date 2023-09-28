package com.co.senasoft.steps;

import com.co.senasoft.pageobjects.HomePage;
import net.thucydides.core.annotations.Step;

public class LanguageStep {
    HomePage homePage = new HomePage();

    @Step
    public void openBrowser(){
        homePage.open();
    }

    @Step
    public void CloseModal(){

    }
}
