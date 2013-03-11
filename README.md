Ejemplo Struts
=======================

En este ejemplo realizado como ejercicio para el máster de desarrollo de aplicaciones con J2EE podemos ver un uso básico de Struts1.2 en una aplicación para el registro de usuarios en una aplicación Web.

El ejercicio consta de: 

WEB_INF:

-index.jsp donde el usuario rellenara el formulario de registro.
-RegistroCorrecto.jsp donde será enviado si el registro se realizo con éxito.
-RegistroIncorrecto.jsp será llamado si ocurrió algún error.
-estiloRegistro.css una muy básica pagina de estilos.

Source Packages:

-RegistroDeUsuarioForm FormBean encargado de procesar el formulario.
-RegistroAction  Action encargado re procesar el request y redireccionar a la JSP 
-ValidacionPassword Regla de validación personalizada para el campo password

ConfigurationFiles:

-Struts-config-xml Archivo de configuración para el mapeo de la aplicación
-Validation-xml Archivo para definir que reglas de validación afectan a cada    campo del formulario
-Validator-rules.xml  archivo de configuración de la validaciones.
-web-xml aquí es donde configuramos los parámetros que afectan al action principal 

Además del uso del Actionservlet y los ActionForm podemos observar que también hemos implementado los ValidationAction, además hemos crear alguna regla de validación personalizada, concretamente hemos creado una regla para la que el usuario inserte un pasword con un alto nivel de seguridad, ósea que el usuario debe introducir un password con caracteres en mayúsculas minúsculas y números.
Una vez el usuario a cumplimentado debidamente el formulario, es enviado al ActionServlet quien se encarga de redireccionar al JSP pertinente, mediante los actionForwad, dependiendo si el registro se realizo correctamente o no.
 

