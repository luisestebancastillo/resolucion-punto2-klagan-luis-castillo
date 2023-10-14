# Proyecto de Automatización de Pruebas con Selenium y Serenity BDD

Este es un proyecto de muestra para la automatización de pruebas utilizando Selenium y Serenity BDD con Java y Maven. El objetivo de este proyecto es proporcionar un punto de partida para la automatización de pruebas web utilizando estas herramientas.

## Requisitos Previos

Asegúrate de tener instalados los siguientes requisitos previos:

1. Java Development Kit (JDK) - [Descargar e Instalar](https://www.oracle.com/java/technologies/javase-downloads.html)
2. Maven - [Descargar e Instalar](https://maven.apache.org/download.cgi)
3. Un IDE (Eclipse, IntelliJ IDEA, etc.) - Opcional, pero muy recomendado para el desarrollo y ejecución de pruebas.

## Configuración del Proyecto

1. Clona este repositorio en tu máquina local:

    git clone https://github.com/luisestebancastillo/resolucion-punto2-luiscastillo-inditex.git


2. Abre el proyecto en tu IDE (Eclipse, IntelliJ IDEA, etc.).

3. Configura las dependencias de Maven si es necesario. Normalmente, Maven descargará las dependencias automáticamente.

## Ejecución de Escenarios de Prueba

Este proyecto contiene escenarios de prueba de muestra en el paquete `src/test/java`. Puedes ejecutarlos utilizando Maven o desde tu IDE.

### Usando Maven

Desde la línea de comandos, ve al directorio raíz del proyecto y ejecuta los siguientes comandos:

1. Para compilar el proyecto:

```xml
mvn clean compile
```


2. Para ejecutar los escenarios de prueba:

```xml
   mvn clean verify
```

### Desde tu IDE

1. Abre el proyecto en tu IDE.

2. Busca el archivo de definición de características de Cucumber (por ejemplo, `src/test/resources/features/sample.feature`) que contiene los escenarios.

3. Ejecuta los escenarios desde tu IDE utilizando el runner de Serenity-Cucumber. Asegúrate de configurar adecuadamente las etiquetas (tags) de Cucumber para seleccionar los escenarios que deseas ejecutar.


## Contribuciones

¡Siéntete libre de contribuir a este proyecto! Puedes agregar más escenarios de prueba, mejorar la estructura del proyecto o hacer cualquier otro tipo de mejora.

Espero que este README te ayude a configurar y ejecutar tu proyecto de automatización de pruebas con Selenium y Serenity BDD. A medida que desarrolles más escenarios y funcionalidades, asegúrate de mantener actualizado este README con instrucciones adicionales o detalles importantes sobre el proyecto.

