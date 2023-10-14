package com.inditex.wikipedia.questions;

import com.inditex.wikipedia.config.hooks.BaseConfig;
import com.inditex.wikipedia.ui.PaginaGoogle;
import com.inditex.wikipedia.ui.PaginaWikipedia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.ScrollToTarget;
import org.openqa.selenium.JavascriptExecutor;

import static com.inditex.wikipedia.config.hooks.Hooks.driver;

public class ValidaAño extends BaseConfig implements Question<Boolean> {

    private String año;

    public ValidaAño(String año) {
        this.año = año;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        actor.attemptsTo(new ScrollToTarget(PaginaWikipedia.PARRAFO_AÑO));
        js.executeScript("var element = arguments[0];" +
                "var text = element.textContent;" +
                "var selection = window.getSelection();" +
                "var range = document.createRange();" +
                "range.selectNodeContents(element);" +
                "selection.removeAllRanges();" +
                "selection.addRange(range);", PaginaWikipedia.PARRAFO_AÑO.resolveFor(actor));


        return  PaginaWikipedia.PARRAFO_AÑO.resolveFor(actor).getText().contains(año);
    }
    public static ValidaAño validarAño(String año) {
        return new ValidaAño(año);
    }
}
