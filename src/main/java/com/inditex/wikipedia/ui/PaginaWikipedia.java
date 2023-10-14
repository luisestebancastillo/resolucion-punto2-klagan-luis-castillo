package com.inditex.wikipedia.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * Clase que representa la página web de Wikipedia y contiene los elementos de destino específicos.
 */
public class PaginaWikipedia {

    /**
     * Elemento de destino para el párrafo que contiene 'el año del primer proceso automático'.
     */
    public static final Target PARRAFO_AÑO = Target.the("Párrafo que contiene 'el año del primer proceso automático'")
            .located(new By.ByXPath("/html/body/div[2]/div/div[3]/main/div[3]/div[3]/div[1]/p[28]"));

    // Puedes agregar más elementos de destino aquí si es necesario

}
