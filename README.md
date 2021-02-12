## Taller de Introducción a Heroku

En este proyecto se realizo una aplicacion web para calcular la desviación estándar y media de un conjunto de n números reales. Usando como estructura de datos una LinkedList.

### VISIÓN GENERAL
**Spark** Framework es un conjunto de librerías para el desarrollo de aplicaciones web en Java inspirado en el framework Sinatra para Ruby. Spark incluye por defecto el servidor de aplicaciones Jetty de manera que las aplicaciones web creadas con Spark pueden lanzarse como cualquier programa Java.

**Heroku** es una plataforma como servicio de computación en la Nube que soporta distintos lenguajes de programación.

La **media** es el promedio de un conjunto de datos. El promedio es la medida de ubicación más común para un conjunto de números. El promedio ubica el centro de los datos.

La **desviación estándar** es una medida de la extensión o dispersión de un conjunto de datos. Cuanto más dispersos estén los valores, mayor será la desviación estándar.

Las **LinkedList** son un tipo de datos abstractos comunes que se utilizan para mantener colecciones de datos.

### APP WEB
Aqui puede acceder a la aplicacion web para este proyecto.

[![Deployed to Heroku](https://www.herokucdn.com/deploy/button.png)](https://enigmatic-waters-77275.herokuapp.com/index)

### Integración Continua

[![CircleCI](https://circleci.com/gh/StivenVanegas/AREP-TALLER2.svg?style=svg)](https://app.circleci.com/pipelines/github/StivenVanegas/AREP-TALLER2)

### REQUISITOS
* Java
* Maven
* Git
* Heroku

### JAVADOC

Para generar la documentacion java del proyecto ejecute las siguientes instrucciones.

`mvn javadoc:javadoc`

`mvn site`

`mvn site:run`

Y a continuación ir a la siguiente direccion web

`http://localhost:8080/apidocs/index.html`

### AUTOR
* Janer Stiven Vanegas Trujillo