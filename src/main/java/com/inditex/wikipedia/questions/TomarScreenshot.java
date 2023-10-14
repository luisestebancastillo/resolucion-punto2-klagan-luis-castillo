package com.inditex.wikipedia.questions;

import com.inditex.wikipedia.config.BaseConfig;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.inditex.wikipedia.config.hooks.Hooks.driver;

/**
 * Clase que representa una pregunta (question) para tomar un screenshot de la página actual y verificar su captura.
 *
 * @see Question
 * @see TakesScreenshot
 */
public class TomarScreenshot extends BaseConfig implements Question<Boolean> {

    /**
     * Realiza la acción de tomar un screenshot de la página actual y verifica su captura.
     *
     * @param actor El actor que realiza la acción.
     * @return Verdadero si se capturó el screenshot con éxito; falso en caso contrario.
     */
    @Override
    public Boolean answeredBy(Actor actor) {

        // Capturar el screenshot como bytes
        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

        // Comprobar si se tomó un screenshot (no está vacío)
        return screenshot != null && screenshot.length > 0;
    }

    /**
     * Método estático para obtener una instancia de la pregunta para tomar un screenshot de la página actual.
     *
     * @return Una instancia de la pregunta.
     */
    public static TomarScreenshot deLaPaginaActual() {
        return new TomarScreenshot();
    }
}
