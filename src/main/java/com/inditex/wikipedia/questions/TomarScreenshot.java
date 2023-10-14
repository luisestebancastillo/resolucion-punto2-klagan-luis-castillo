package com.inditex.wikipedia.questions;

import com.inditex.wikipedia.config.hooks.BaseConfig;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.inditex.wikipedia.config.hooks.Hooks.driver;

public class TomarScreenshot extends BaseConfig implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        // Capturar el screenshot como bytes
        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

        // Comprobar si se tomó un screenshot (no está vacío)
        return screenshot != null && screenshot.length > 0;
    }

    public static TomarScreenshot deLaPaginaActual() {
        return new TomarScreenshot();
    }
}