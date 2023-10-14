package com.inditex.wikipedia.questions;

import com.inditex.wikipedia.config.BaseConfig;
import com.inditex.wikipedia.ui.PaginaWikipedia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.ScrollToTarget;
import org.openqa.selenium.JavascriptExecutor;

import static com.inditex.wikipedia.config.hooks.Hooks.driver;

/**
 * Clase que representa una pregunta (question) para validar si un año está presente en un elemento de la página.
 *
 * @see Question
 * @see JavascriptExecutor
 */
public class ValidaAño extends BaseConfig implements Question<Boolean> {

    private String año;

    /**
     * Constructor de la clase que recibe el año a validar.
     *
     * @param año El año a validar.
     */
    public ValidaAño(String año) {
        this.año = año;
    }

    /**
     * Realiza la acción de validar si el año está presente en un elemento de la página.
     *
     * @param actor El actor que realiza la acción.
     * @return Verdadero si el año está presente; falso en caso contrario.
     */
    @Override
    public Boolean answeredBy(Actor actor) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Realiza un scroll para asegurarse de que el elemento sea visible
        actor.attemptsTo(new ScrollToTarget(PaginaWikipedia.PARRAFO_AÑO));

        // Ejecuta un script JavaScript para resaltar el parrafo que contiene el año
        js.executeScript("var element = arguments[0];" +
                "var text = element.textContent;" +
                "var selection = window.getSelection();" +
                "var range = document.createRange();" +
                "range.selectNodeContents(element);" +
                "selection.removeAllRanges();" +
                "selection.addRange(range);", PaginaWikipedia.PARRAFO_AÑO.resolveFor(actor));

        // Verifica si el texto del elemento contiene el año
        return PaginaWikipedia.PARRAFO_AÑO.resolveFor(actor).getText().contains(año);
    }

    /**
     * Método estático para obtener una instancia de la pregunta para validar un año en la página.
     *
     * @param año El año a validar.
     * @return Una instancia de la pregunta.
     */
    public static ValidaAño validarAño(String año) {
        return new ValidaAño(año);
    }
}
