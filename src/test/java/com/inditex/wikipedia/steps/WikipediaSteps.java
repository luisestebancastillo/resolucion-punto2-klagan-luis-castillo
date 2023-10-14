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


/**
 * Clase que contiene los pasos de las pruebas de automatización relacionadas con la página de Google y Wikipedia.
 *
 * @see Given
 * @see When
 * @see Then
 * @see And
 */
public class WikipediaSteps {
    Luis luis = Serenity.sessionVariableCalled("Luis");

    /**
     * Paso que abre un navegador web en la página de Google.
     */
    @Given("un navegador web en la pagina de Google")
    public void queElUsuarioAbreLaPaginaDeGoogle() {
        luis.attemptsTo(AbrirPagina.enURL("https://www.google.com/"));
    }

    /**
     * Paso que ingresa un término de búsqueda en el buscador de Google.
     *
     * @param busqueda Término de búsqueda ingresado.
     */
    @When("^Se ingresa (.*) en el buscador")
    public void queElUsuarioBuscaEnGoogle(String busqueda) {
        luis.attemptsTo(BuscaEnGoogle.porTexto(busqueda));
    }

    /**
     * Paso que navega a una página relacionada con los resultados de búsqueda en Google.
     *
     * @param busqueda Término de búsqueda utilizado para navegar.
     */
    @When("Se navega a la pagina (.*)$")
    public void queElUsuarioNavegaAlResultadoWikipedia(String busqueda) {
        luis.attemptsTo(Scrollear.scrollyBusqueda(busqueda));
    }

    /**
     * Paso que comprueba el año en el que se realizó el primer proceso automático en la página.
     *
     * @param año Año a ser validado.
     */
    @Then("Se comprueba el año en el que se hizo el primer proceso automático (.*)$")
    public void queElUsuarioValidaElAño(String año) {
        luis.should(seeThat("Validar el año del primer proceso automático", ValidaAño.validarAño(año)));
    }

    /**
     * Paso que toma un screenshot de la página de Wikipedia.
     */
    @And("Se toma screenshot de la página de Wikipedia")
    public void queElUsuarioTomaScreenshot() {
        luis.should(seeThat(TomarScreenshot.deLaPaginaActual()));
    }
}