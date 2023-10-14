package com.inditex.wikipedia.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaWikipedia {

    public static final Target PARRAFO_AÑO = Target.the("Parrafo que contiene 'el año del primer proceso automatico'")
            .located(new By.ByXPath("/html/body/div[2]/div/div[3]/main/div[3]/div[3]/div[1]/p[28]"));

}
