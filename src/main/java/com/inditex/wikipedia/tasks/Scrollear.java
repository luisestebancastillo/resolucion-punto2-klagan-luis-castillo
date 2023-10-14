package com.inditex.wikipedia.tasks;

import com.inditex.wikipedia.config.BaseConfig;
import com.inditex.wikipedia.ui.PaginaGoogle;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ScrollToTarget;

/**
 * Clase que representa una tarea (task) para realizar un scroll en la página para encontrar un elemento específico.
 *
 * @see Task
 * @see ScrollToTarget
 * @see Click
 */
public class Scrollear extends BaseConfig implements Task {

    private String elemento;

    /**
     * Constructor de la clase que recibe el nombre del elemento a encontrar.
     *
     * @param elemento El nombre del elemento a encontrar.
     */
    public Scrollear(String elemento) {
        this.elemento = elemento;
    }

    /**
     * Realiza la acción de realizar un scroll en la página para encontrar un elemento específico.
     *
     * @param actor El actor que realiza la acción.
     */
    @Override
    public <T extends Actor> void performAs(T actor) {
        explicitWait(PaginaGoogle.AUTOMATIZACION_WIKIPEDIA.resolveFor(actor));

        // Realiza un scroll hasta el elemento AUTOMATIZACION_WIKIPEDIA y hace clic en él
        actor.attemptsTo(
                new ScrollToTarget(PaginaGoogle.AUTOMATIZACION_IBM),
                Click.on(PaginaGoogle.AUTOMATIZACION_WIKIPEDIA)
        );
    }

    /**
     * Método estático para obtener una instancia de la tarea para realizar un scroll y encontrar un elemento.
     *
     * @param elemento El nombre del elemento a encontrar.
     * @return Una instancia de la tarea.
     */
    public static Scrollear scrollyBusqueda(String elemento) {
        return new Scrollear(elemento);
    }
}

