# Plan de pruebas Movie Swiper
***
## Descripción
Movie Swiper es un aplicación que utiliza la API de TMDb para buscar películas.
***
## Alcance
* Se validará que para usuarios registrados al seleccionar una película desde el detalle como favorita, sea agregada en la sección My Favorite.
* Se validará que para usuarios registrados al swiper una pelicula como favorita desde la sección Explore, sea agrega en la sección My Favorite.
* Se validará que para usuarios no registrados (invitados) no se habilite la selección de películas como favoritas ni la sección de My Favorite.
* Se validará que al agregar o eliminar una película como favorita, se actualice el listado de My Favorite.
### Fuera del alcance:
* No se validará funcionalidades diferente al agregar o eliminar una película como favorita.
## Estrategia de la prueba
La estrategia para la ejecución de las pruebas será la siguiente:
* Se desarrollarán y ejecutarán los escenarios automatizados para el flujo de agregar o eliminar una película como favorita.
* Se ejecutará la batería de pruebas para validar el corrector funcionamiento y estabilización de las automatizaciones de manera local.
## Prerrequisitos
* Usarios de pruebas previamente registrados en la plataforma de TMDb.
* Tener un dispositivo Android en modo Debug.
* Tener instalado en JDK, Android SDK, Gradle y Appium en la máquina donde se ejecutarán las pruebas.
* Tener instalada la APK estable de Movie Swiper.
* Contar con disponibilidad del analista de desarrollo para solución de dudas y errores que se puedan presentar.
## Supuestos
* Los resultados de las pruebas unitarias en el ambiente de desarrollo fueron exitosos para cada uno de los casos planteados. 
* Los resultados de las pruebas de aceptación en los ambientes de desarrollo y certificación fueron exitosos para cada uno de los casos planteados.
