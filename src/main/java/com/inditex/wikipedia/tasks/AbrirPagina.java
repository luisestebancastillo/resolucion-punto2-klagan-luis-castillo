package com.inditex.wikipedia.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

/**
 * Clase que implementa la tarea de abrir una página web en un navegador.
 */
public class AbrirPagina implements Task {

    // Atributo que almacena la URL de la página web a abrir
    private String url;

    /**
     * Constructor de la clase.
     * @param url La URL de la página web que se abrirá.
     */
    public AbrirPagina(String url) {
        this.url = url;
    }

    /**
     * Método que realiza la tarea de abrir la página web especificada.
     * @param actor El actor que ejecuta la tarea.
     */
    @Override
    public <T extends Actor> void performAs(T actor) {
        // Realiza la acción de abrir la URL proporcionada
        actor.attemptsTo(
                Open.url(url)
        );
    }

    /**
     * Método estático para crear una instancia de la tarea con la URL especificada.
     * @param url La URL de la página web que se abrirá.
     * @return Una instancia de la clase AbrirPagina con la URL especificada.
     */
    public static AbrirPagina enURL(String url) {
        return new AbrirPagina(url);
    }
}
