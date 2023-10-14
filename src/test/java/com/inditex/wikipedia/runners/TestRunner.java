package com.inditex.wikipedia.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features", // Ruta de archivos .feature
        glue = {"com.inditex.wikipedia.steps", "com.inditex.wikipedia.config.hooks"} // ruta de archivo de steps y hooks
)
public class TestRunner {

}