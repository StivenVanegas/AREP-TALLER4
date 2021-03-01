## Taller de Introducción a Heroku

Para este taller se construyó un servidor Web (tipo Apache) en Java. El servidor es capaz de entregar páginas html. Igualmente el servidor provee un framework IoC para la construcción de aplicaciones web a partir de POJOS. El servidor puede atender múltiples solicitudes no concurrentes.

Para este taller se desarrolló un prototipo mínimo que demuestra capcidades reflexivas de JAVA y permita por lo menos cargar un bean (POJO) y derivar una aplicación Web a partir de él.

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

### COMPILE

   `mvn clean install`

### EXECUTE

### JAVADOC

Para generar la documentacion java del proyecto ejecute las siguientes instrucciones.

`mvn javadoc:javadoc`

`mvn site`

`mvn site:run`

Y a continuación ir a la siguiente direccion web

`http://localhost:8080/apidocs/index.html`

### AUTOR
* Janer Stiven Vanegas Trujillo