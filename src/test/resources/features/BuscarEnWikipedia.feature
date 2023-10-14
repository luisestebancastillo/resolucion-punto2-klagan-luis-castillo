Feature: Buscar en Wikipedia

Scenario: Buscar en wikipedia y validar información
  Given un navegador web en la pagina de Google
  When Se ingresa automatización en el buscador
  When Se navega a la pagina Automatización - Wikipedia, la enciclopedia libre
  Then Se comprueba el año en el que se hizo el primer proceso automático hacia el año 270 a. C.
  And Se toma screenshot de la página de Wikipedia