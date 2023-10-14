package com.inditex.wikipedia.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Clase que ejecuta pruebas de Cucumber con el framework Serenity BDD.
 * Configura las opciones de ejecución de las pruebas y define las rutas de las características y los pasos.
 * Utiliza la anotación @RunWith para usar CucumberWithSerenity como el runner de pruebas.
 *
 * @see CucumberWithSerenity
 * @see CucumberOptions
 * @see RunWith
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features", // Ruta de archivos .feature
        glue = {"com.inditex.wikipedia.steps", "com.inditex.wikipedia.config.hooks"} // Ruta de archivo de steps y hooks
)
public class TestRunner {

}