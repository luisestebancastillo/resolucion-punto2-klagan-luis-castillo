package com.inditex.wikipedia.steps;

import com.inditex.wikipedia.actors.Luis;
import com.inditex.wikipedia.tasks.AbrirPagina;

import com.inditex.wikipedia.tasks.BuscaEnGoogle;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;


public class WikipediaSteps {
    Luis luis = Serenity.sessionVariableCalled("Luis");

    @Given("un navegador web en la pagina de Google")
    public void queElUsuarioAbreLaPaginaDeGoogle() {
        luis.attemptsTo(AbrirPagina.enURL("https://www.google.com/"));
    }

    @When("^Se ingresa (.*) en el buscador")
    public void queElUsuarioBuscaEnGoogle(String busqueda) {
        luis.attemptsTo(BuscaEnGoogle.porTexto(busqueda));
    }
}
