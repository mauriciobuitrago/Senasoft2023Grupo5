package com.co.senasoft.steps;

import com.co.senasoft.pageobjects.HomePage;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class LanguageStep {
    HomePage homePage = new HomePage();

    @Step
    public void openBrowser(){
        homePage.open();
    }

    @Step
    public void CloseModal(){
        homePage.getDriver().findElement(homePage.getBTN_CLOSE_MODAL()).click();
    }

    @Step
    public void ClickListLanguaje(){
        homePage.getDriver().findElement(homePage.getBTN_LIST_LANGUAGE()).click();
    }

    @Step
    public void ClickLanguaje() {
        homePage.getDriver().findElement(homePage.getBTN_LANGUAGE()).click();
    }

    @Step
    public void Validation()
    {
        Assert.assertThat(homePage.getDriver().findElement(homePage.getTEXT_DEUTSCH()).isDisplayed(), Matchers.is(true));
    }
}
