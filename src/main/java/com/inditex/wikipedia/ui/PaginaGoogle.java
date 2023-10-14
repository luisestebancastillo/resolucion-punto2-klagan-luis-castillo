package com.inditex.wikipedia.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * Clase que representa la página de inicio de Google y proporciona objetos de destino (Target) relacionados.
 */
public class PaginaGoogle {

    // Objeto de destino (Target) que representa el campo de búsqueda en Google
    public static final Target INPUT_GOOGLE = Target.the("INPUT 'Búsqueda en Google'")
            .located(By.id("APjFqb"));

    public static final Target AUTOMATIZACION_WIKIPEDIA = Target.the("Resultado Google para  'Wikipedia'")
            .located(By.cssSelector("#rso > div:nth-child(4) > div > div > div.kb0PBd.cvP2Ce.jGGQ5e > div > div > span > a"));

    public static final Target AUTOMATIZACION_IBM = Target.the("Resultado Google para  'IBM'")
            .located(By.cssSelector("div.MjjYud:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1) > a"));

}