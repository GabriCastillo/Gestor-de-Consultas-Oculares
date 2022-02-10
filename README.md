# Gestor-de-Consultas-Oculares
Un gestor de clientes de una óptica, con operaciones CRUD para sus pacientes y revisiones. utilizando java y apache OpenJPA

Debido a la escaza información acerca de la tecnología apache OpenJPA, he decidido subir esta aplicación donde se ha logrado implementar dicha tecnología.

Antes de empezar, es necesario haber creado antes la base de datos sobre la que vamos a trabajar, ya que, debemos crear una conexión con ella. También debemos descargar:
 Driver de conexión de mysql: https://downloads.mysql.com/archives/c-j/ 
 Ultima versión de nuestro apache OpenJPA: https://openjpa.apache.org/downloads.html (Descargamos la versión binaria)
 
Los pasos para aquellos que se vean en la necesidad de utilizarlo son los siguientes:
  1.	Descargar e instalar el IDE de apache NetBeans.
  2.	Seleccionamos file, new Project, java with Ant,  java aplication.
  3.	En las librerías añadimos: mysql-connector-java –(ultima verision).
  4.	Creamos un paquete de entidades.
  5.	En el paquete entidades click derecho, new, other…, persistence, Entity Classes from Database.
  6.	En Database Connection, abrimos el desplegable y seleccionamos New Database Connection…
  7.	Seleccionamos el driver de Mysql(Connector/J driver).
  8.	Rellenamos la información de nuestra base de datos.
  9.	Añadimos las tablas con las que queremos trabajar.
  10.	Seleccionamos siguiente y esperamos a que se cree el encapsulamiento de las tablas.
  11.	En assossiation fecth seleccionamos lazy.
  12.	En Collection Type seleccionamos java.util.list.
  13.	Marcamos con un check los siguientes:
    •	Fully Qualified Database Table Names.
    •	Attributes for Refenerating Tables.
    •	Use Column Names in Relationships.
  14.	Finish.
  
En estos momentos se nos habrán creado clases en java que son encapsulaciones de las tablas de nuestra base de datos. Pero aun no hemos implementado openJPA.
  
  15.	Se nos ha creado una carpeta llamada META-INF con una clase llamada persistence.xml.
  16.	Abrimos dicha clase y en la pestaña Desing seleccionamos Persistence Library, new Persistance Library, Add JAR/Folder y seleccionamos el jar de openJPA que descargamos       previamente (utilicen el que dice “full”).
  17.	Ahora entramos en Source y similar a como se ve en mi archivo, ustedes deberán rellenarlo con sus respectivas clases, nombre y contraseña de la base de datos, conexión,     etc.
  
Habiendo seguido estos pasos, ya habrán conectado su base de datos con apache OpenJPA, para la gestión y demás operaciones, les recomiendo que vean el siguiente video: https://www.youtube.com/watch?v=dzOCS--ZrYg (Aquí también explican como conectar la base de datos con JPA).

Lo anterior fue la parte que mas dolores de cabeza da. A partir de acá es únicamente crear y empezar a probar.

