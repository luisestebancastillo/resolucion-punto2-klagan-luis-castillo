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

}