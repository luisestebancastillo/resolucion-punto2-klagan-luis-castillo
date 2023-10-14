package com.inditex.wikipedia.config.hooks;

import com.inditex.wikipedia.actors.Luis;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;



/**
 * Clase que contiene ganchos para configurar y limpiar el entorno de las pruebas de automatización.
 *
 * @see Before
 * @see After
 * @see WebDriverManager
 */
public class Hooks {
    public static final Logger log = LogManager.getLogger(Hooks.class);
    public static WebDriver driver;
    public static WebDriverWait wait;

    /**
     * Configura el controlador de Chrome y el actor "Luis" antes de ejecutar un escenario.
     */
    @Before
    public void setupWebDriver() {
        log.info("======================================");
        log.info("====== SETUP BROWSER AND DRIVER ======");
        log.info("======================================");
        // Configura la ruta del controlador de Chrome usando WebDriverManager
        WebDriverManager.chromedriver().setup();
        // Inicializa el controlador de Chrome con opciones personalizadas

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(false);
        chromeOptions.addArguments("--start-maximized");
        driver = new ChromeDriver(chromeOptions);

        // Crea una instancia del actor "Luis" y configura la capacidad de navegación
        Luis luis = new Luis("Luis");
        luis.whoCan(BrowseTheWeb.with(driver));

        // Asegura que el actor esté disponible en el contexto de los pasos
        Serenity.setSessionVariable("Luis").to(luis);

        // Configura un objeto WebDriverWait para esperas explícitas
        wait = new WebDriverWait(driver, 10);
    }

    /**
     * Cierra el controlador de Chrome al finalizar un escenario.
     */
    @After
    public void tearDownWebDriver() {
        // Cierra el controlador al finalizar el escenario
        driver.quit();
    }
}
