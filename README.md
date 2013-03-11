Ejemplo Struts
=======================

En este ejemplo realizado como ejercicio para el máster de desarrollo de aplicaciones con J2EE podemos ver un uso básico de Struts1.2 en una aplicación para el registro de usuarios en una aplicación Web.

El ejercicio consta de: 

WEB_INF:

-<strong>index.jsp</strong> donde el usuario rellenara el formulario de registro.<br>
-<strong>RegistroCorrecto.jsp</strong> donde será enviado si el registro se realizo con éxito.<br>
-<strong>RegistroIncorrecto.jsp</strong> será llamado si ocurrió algún error.<br>
-<strong>estiloRegistro.css</strong> una muy básica pagina de estilos.<br>

Source Packages:

-<strong>RegistroDeUsuarioForm</strong>  FormBean encargado de procesar el formulario.<br>
-<strong>RegistroAction</strong>   Action encargado re procesar el request y redireccionar a la JSP <br>
-<strong>ValidacionPassword</strong>  Regla de validación personalizada para el campo password<br>

ConfigurationFiles:

-<strong>Struts-config-xml</strong>  Archivo de configuración para el mapeo de la aplicación<br>
-<strong>Validation-xml</strong>  Archivo para definir que reglas de validación afectan a cada campo del formulario<br>
-<strong>Validator-rules.xml</strong>   archivo de configuración de la validaciones.<br>
-<strong>web-xml</strong>  aquí es donde configuramos los parámetros que afectan al action principal<br> 

Además del uso del Actionservlet y los ActionForm podemos observar que también hemos implementado los ValidationAction, además hemos crear alguna regla de validación personalizada, concretamente hemos creado una regla para la que el usuario inserte un pasword con un alto nivel de seguridad, ósea que el usuario debe introducir un password con caracteres en mayúsculas minúsculas y números.
Una vez el usuario a cumplimentado debidamente el formulario, es enviado al ActionServlet quien se encarga de redireccionar al JSP pertinente, mediante los actionForwad, dependiendo si el registro se realizo correctamente o no.
 

