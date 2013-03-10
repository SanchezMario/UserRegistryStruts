Ejemplo Struts
=======================

En este ejemplo realizado como ejercicio para el máster de desarrollo de aplicaciones con J2EE podemos ver un uso básico de Struts1.2 en una aplicación para el registro de usuarios en una aplicación Web.

Además del uso del Actionservlet y los ActionForm podemos observar que también hemos implementado los ValidationAction además de crear alguna regla de validación personalizada, concretamente hemos creado una regla para la que el usuario inserte un pasword con un alto nivel de seguridad, ósea que el usuario debe introducir un password con caracteres en mayúsculas minúsculas y números.
Una vez el usuario a cumplimentado debidamente el formulario, es enviado al ActionServlet quien se encarga de redireccionar al jsp pertinente, mediante los actionForwad, dependiendo si el registro se realizo correctamente o no. 

