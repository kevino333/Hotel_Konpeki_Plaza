# Hotel Konpeki Plaza
Esta es una pagina web del hotel ficticio Konpeki Plaza, del universo creado por Mike Pondsmith, Cyberpunk 2077.


## Instalacion
Puedes instalar el proyecto desde github o desde un archivo war

### Desde GitHub
Al ser un proyecto Maven, cuando se clone, se descargaran todas las dependencias necesarias. y ya se podrá ejecutar.

### Desde el archivo war
* Desde eclipse, haz clic derecho en la ventana de proyectos y selecciona import > War file
* Elije la ubicación del archivo
* Una vez importado, haz clic derecho en el proyecto y selecciona configure > convert to Maven Project
* Te dejara un archivo Pom.xml, dentro de las etiquetas project, crea las etiquetas dependecies
```bash
   <dependencies>

   </dependecies>
```
* Aquí, puedes poner las dependencias necesarias. Para este proyecto necesitas las de Mysql.
```bash
  <!-- https://mvnrepository.com/artifact/com.mysql/mysql-connector-j -->
<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>9.3.0</version>
</dependency>
 ```
 * Después de guardar el archivo ya estará listo

