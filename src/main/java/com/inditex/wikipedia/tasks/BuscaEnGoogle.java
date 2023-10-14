package com.inditex.wikipedia.tasks;

import com.inditex.wikipedia.config.hooks.BaseConfig;
import com.inditex.wikipedia.ui.PaginaGoogle;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

/**
 * Clase que implementa la tarea de realizar una búsqueda en el motor de búsqueda de Google.
 */
public class BuscaEnGoogle extends BaseConfig implements Task {

    // Atributo que almacena el texto de búsqueda en Google
    private String texto;

    /**
     * Constructor de la clase.
     * @param texto El texto que se utilizará como término de búsqueda en Google.
     */
    public BuscaEnGoogle(String texto) {
        this.texto = texto;
    }

    /**
     * Método que realiza la tarea de buscar el texto especificado en Google.
     * @param actor El actor que ejecuta la tarea.
     */
    @Override
    public <T extends Actor> void performAs(T actor) {
    explicitWait(PaginaGoogle.INPUT_GOOGLE.resolveFor(actor));
    actor.attemptsTo(
            Enter.theValue(texto).into(PaginaGoogle.INPUT_GOOGLE).thenHit(Keys.ENTER)
    );
    }

    /**
     * Método estático para crear una instancia de la tarea con el texto de búsqueda especificado.
     * @param texto El texto que se utilizará como término de búsqueda en Google.
     * @return Una instancia de la clase BuscaEnGoogle con el texto de búsqueda especificado.
     */
    public static BuscaEnGoogle porTexto(String texto) {
        return new BuscaEnGoogle(texto);
    }
}