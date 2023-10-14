package com.inditex.wikipedia.steps;

import com.inditex.wikipedia.actors.Luis;
import com.inditex.wikipedia.questions.TomarScreenshot;
import com.inditex.wikipedia.questions.ValidaAño;
import com.inditex.wikipedia.tasks.AbrirPagina;

import com.inditex.wikipedia.tasks.BuscaEnGoogle;
import com.inditex.wikipedia.tasks.Scrollear;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


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

    @When("Se navega a la pagina (.*)$")
    public void queElUsuarioNavegaAlResultadoWikipedia(String busqueda) {
        luis.attemptsTo(Scrollear.scrollyBusqueda(busqueda));
    }

    @Then("Se comprueba el año en el que se hizo el primer proceso automático (.*)$")
    public void queElUsuarioValidaElAño(String año) {
        luis.should(seeThat("Validar el año del primer proceso automatico", ValidaAño.validarAño(año)));
    }

    @And("Se toma screenshot de la página de Wikipedia")
    public void queElUsuarioTomaScreenshot() {
        luis.should(seeThat(TomarScreenshot.deLaPaginaActual()));
    }
}
