package com.co.senasoft.pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.booking.com/")
public class HomePage extends PageObject {
    By BTN_LIST_LANGUAGE = By.xpath("//button[@data-testid='header-language-picker-trigger']");
    By BTN_LANGUAGE = By.xpath("//div[@class = 'aca0ade214 ebac6e22e9 cd2e7d62b0']/div[1]//ul[2]/li[1]/button");
    By TEXT_DEUTSCH = By.xpath("//p[contains(text(),'Finden Sie Angebote für Hotels, Ferienunterkünfte und vieles mehr')]");
}
