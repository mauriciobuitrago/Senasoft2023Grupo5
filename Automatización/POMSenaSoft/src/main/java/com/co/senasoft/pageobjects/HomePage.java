package com.co.senasoft.pageobjects;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.booking.com/")
public class HomePage extends PageObject {
    public By getBTN_LIST_LANGUAGE() {
        return BTN_LIST_LANGUAGE;
    }

    public void setBTN_LIST_LANGUAGE(By BTN_LIST_LANGUAGE) {
        this.BTN_LIST_LANGUAGE = BTN_LIST_LANGUAGE;
    }

    public By getBTN_LANGUAGE() {
        return BTN_LANGUAGE;
    }

    public void setBTN_LANGUAGE(By BTN_LANGUAGE) {
        this.BTN_LANGUAGE = BTN_LANGUAGE;
    }

    public By getTEXT_DEUTSCH() {
        return TEXT_DEUTSCH;
    }

    public void setTEXT_DEUTSCH(By TEXT_DEUTSCH) {
        this.TEXT_DEUTSCH = TEXT_DEUTSCH;
    }

    By BTN_LIST_LANGUAGE = By.xpath("//button[@data-testid='header-language-picker-trigger']");
    By BTN_LANGUAGE = By.xpath("//div[@class = 'aca0ade214 ebac6e22e9 cd2e7d62b0']/div[1]//ul[2]/li[1]/button");
    By TEXT_DEUTSCH = By.xpath("//p[contains(text(),'Finden Sie Angebote für Hotels, Ferienunterkünfte und vieles mehr')]");
}
