package com.inditex.wikipedia.steps;

import com.inditex.wikipedia.actors.Luis;
import com.inditex.wikipedia.tasks.AbrirPagina;
import io.cucumber.java.es.Dado;
import net.serenitybdd.core.Serenity;


public class WikipediaSteps {
    Luis luis = Serenity.sessionVariableCalled("Luis");

    @Dado("un navegador web en la pagina de Google")
    public void queElUsuarioAbreLaPaginaDeWikipedia() {
        luis.attemptsTo(AbrirPagina.enURL("https://www.google.com/"));
    }
}
