package com.co.senasoft.tasks;

import com.co.senasoft.userinterfaces.SearchResultsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.SwitchToParentFrame;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;
import org.openqa.selenium.remote.server.handler.W3CActions;
import org.openqa.selenium.WebDriver;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.AWTException;
import java.util.List;

public class SelectHotel implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        // Obtén el identificador de la ventana principal
        String mainWindowHandle = BrowseTheWeb.as(actor).getDriver().getWindowHandle();

        // Realiza clic en el botón para abrir una nueva ventana (o pestaña)
        actor.attemptsTo(Click.on(SearchResultsPage.BTN_HOTEL_DISPONIBILITY));

        // Cambia a la nueva ventana (o pestaña)
        for (String windowHandle : BrowseTheWeb.as(actor).getDriver().getWindowHandles()) {
            if (!windowHandle.equals(mainWindowHandle)) {
                actor.attemptsTo(Switch.toWindow(windowHandle));
                break;
            }
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static SelectHotel selectHotel()
    {
        return Tasks.instrumented(SelectHotel.class);
    }
}
