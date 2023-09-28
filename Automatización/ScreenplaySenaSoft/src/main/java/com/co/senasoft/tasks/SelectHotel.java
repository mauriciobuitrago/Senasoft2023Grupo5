package com.co.senasoft.tasks;

import com.co.senasoft.userinterfaces.SearchResultsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
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
        actor.attemptsTo(Click.on(SearchResultsPage.BTN_HOTEL_DISPONIBILITY));
        actor.attemptsTo(Switch.toWindow("https://www.booking.com/hotel/co/apartamento-la-fantastica-cartagena-colombia.es-ar.html?aid=304142&label=gen173bo-1FCAEoggI46AdILFgDaDKIAQGYASy4ARfIAQzYAQHoAQH4AQOIAgGYAgKoAgO4AtOX06gGwAIB0gIkZjEyNDEwNTctNWIwNS00ZTljLWE3MzEtYWY5YzM0MGMzZDUw2AIF4AIB&sid=f90aad5e4f66edf8b8d166c42f027a69&age=14;age=14;all_sr_blocks=852790001_352688287_6_0_0;checkin=2023-09-29;checkout=2023-10-04;dest_id=-579943;dest_type=city;dist=0;group_adults=3;group_children=2;hapos=1;highlighted_blocks=852790001_352688287_6_0_0;hpos=1;matching_block_id=852790001_352688287_6_0_0;nflt=class%3D3;no_rooms=2;req_adults=3;req_age=14;req_age=14;req_children=2;room1=A%2C14;room2=A%2CA%2C14;sb_price_type=total;sr_order=price;sr_pri_blocks=852790001_352688287_6_0_0__67500000;srepoch=1695861758;srpvid=4d2e04f3663800fc;type=total;ucfs=1&#hotelTmpl"));
       // actor.attemptsTo(Switch.toWindow("Casa vacacional J.A, Cartagena de Indias-Precios actualizados 2023"));

        /*
        try {
            Robot robot = new Robot();
            for (int i = 0; i <= 1; i++) {
                // Presiona la tecla Control (Ctrl)
                robot.keyPress(KeyEvent.VK_CONTROL);
                // Presiona la tecla "-" (tecla de menos)
                robot.keyPress(KeyEvent.VK_TAB);
                // Suelta la tecla "-"
                robot.keyRelease(KeyEvent.VK_TAB);
                // Suelta la tecla Control (Ctrl)
                robot.keyRelease(KeyEvent.VK_CONTROL);
            }
        } catch (AWTException e) {
            e.printStackTrace();
        } */


            //actor.attemptsTo(Switch.toWindow("https://www.booking.com/hotel/co/casa-vacacional-ja.es.html?aid=304142&label=gen173nr-1FCAEoggI46AdIM1gEaDKIAQGYAQq4ARfIAQzYAQHoAQH4AQyIAgGoAgO4Ar-N06gGwAIB0gIkY2ExMWViMmQtODZkZi00NzQ3LThiNGEtYTgxY2NiYTdlMzI22AIG4AIB&sid=9cd3888f64ff741130354caf45584aba&age=4;age=5;all_sr_blocks=960342801_368767565_5_0_0;checkin=2023-09-29;checkout=2023-10-04;dest_id=-579943;dest_type=city;dist=0;group_adults=3;group_children=2;hapos=1;highlighted_blocks=960342801_368767565_5_0_0;hpos=1;matching_block_id=960342801_368767565_5_0_0;no_rooms=3;req_adults=3;req_age=4;req_age=5;req_children=2;room1=A;room2=A%2C5;room3=A%2C4;sb_price_type=total;sr_order=price;sr_pri_blocks=960342801_368767565_5_0_0__21675000;srepoch=1695860439;srpvid=465d0264db3300d0;type=total;ucfs=1&#hotelTmpl"));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }




    }

    public static SelectHotel selectHotel()
    {
        return Tasks.instrumented(SelectHotel.class);
    }
}
