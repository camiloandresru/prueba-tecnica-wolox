# Scripts de Automatización SerenityBDD Movie Swiper Android App
***
Automatización móvil usando SerenityBDD y Appium aplicando patrón Screenplay.
***
## Consideraciones
* Tener el celular en modo Debug (Activar Opciones de Desarrollador).
* Obtener la información del dispositivo con el comando en una terminal:
    `adb devices`
* Cambiar en el _serenity.properties_ los capabilities con la información sobre la cual se desea ejecutar:
    `appium.platformVersion`
    `appium.deviceName`
* Tener la App instalada o el Apk en una ruta especifica para indicarla en el _serenity.properties_.
* Comando de ejecución de los escenarios automatizados:
    `./gradlew clean test --tests [runner] -Dcucumber.options="--tags @[tag]" aggregate --info`
* Ruta de Documentación Viva:
    `${user.dir}\target\site\serenity\index.html`
***
## Información de interés
* [Serenity System Properties and Configuration](https://serenity-bdd.github.io/theserenitybook/latest/serenity-system-properties.html).
* [Appium Desired Capabilities](http://appium.io/docs/en/writing-running-appium/caps/)
