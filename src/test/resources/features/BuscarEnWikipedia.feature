Feature: Buscar en Wikipedia

Scenario: Buscar en wikipedia y validar información
  Given un navegador web en la pagina de Google
  When Se ingresa automatización en el buscador
  When Se navega al resultado de Wikipedia
  Then Se comprueba en que año se hizo el primer proceso automático
  And Se toma screenshot de la página de Wikipedia