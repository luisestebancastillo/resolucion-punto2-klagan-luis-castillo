package com.inditex.wikipedia.tasks;

import com.inditex.wikipedia.config.hooks.BaseConfig;
import com.inditex.wikipedia.ui.PaginaGoogle;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ScrollToTarget;

public class Scrollear extends BaseConfig implements Task {

    private String elemento;

    public Scrollear(String elemento) {
        this.elemento = elemento;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        explicitWait(PaginaGoogle.AUTOMATIZACION_WIKIPEDIA.resolveFor(actor));
        actor.attemptsTo(new ScrollToTarget(PaginaGoogle.AUTOMATIZACION_IBM),
                Click.on(PaginaGoogle.AUTOMATIZACION_WIKIPEDIA));

    }

    public static Scrollear scrollyBusqueda(String elemento) {
        return new Scrollear(elemento);
    }

}
