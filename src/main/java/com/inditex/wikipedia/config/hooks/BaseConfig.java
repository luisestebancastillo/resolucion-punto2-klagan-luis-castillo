package com.inditex.wikipedia.config.hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Clase de configuración base que proporciona métodos y atributos comunes para la automatización de pruebas.
 */
public class BaseConfig {

    // Atributo que proporciona funcionalidad para realizar esperas explícitas
    protected WebDriverWait wait;

    /**
     * Constructor de la clase.
     * Inicializa la espera explícita utilizando una instancia proporcionada por el objeto Hooks.
     */
    public BaseConfig() {
        // Asigna la espera explícita desde el objeto Hooks (puede variar según la implementación).
        wait = Hooks.wait;
    }

    /**
     * Realiza una espera explícita hasta que el elemento web especificado sea visible.
     * @param target El elemento web para el que se espera la visibilidad.
     */
    public void explicitWait(WebElement target) {
        // Realiza una espera explícita hasta que el elemento web sea visible.
        wait.until(ExpectedConditions.visibilityOf(target));
    }
}
