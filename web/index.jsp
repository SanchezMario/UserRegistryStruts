<%-- 
    Document   : index
    Created on : 26-oct-2012, 15:36:01
    Author     : MarioSanchez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="html" uri="http://jakarta.apache.org/struts/tags-html" %>
<%@taglib prefix="bean" uri="http://jakarta.apache.org/struts/tags-bean" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estiloRegistro.css" rel="stylesheet" type="text/css">
        <title>Ejempl Struts</title>
        <html:javascript formName="registroForm"/>
    </head>
    <body>
        <h1>Registro de usuario</h1>
        <table align="center">
            <tr>
                <td>
                    <fieldset>
                        <legend align= "center">Datos de registro</legend>

                        <html:form action="registrar" onsubmit="return validateRegistroForm(this)">

                            
                            <br>
                            Nombre* <br><html:text property="nombre"/><br>

                            Apellido* <br><html:text property="apellido"/><br>

                            Usuario* <br><html:text property="usuario"/><br>

                            Password* <br><html:password property="password"/><br>

                            Email* <br><html:text property="email"/><br>

                            Telefono <br><html:text property="telefono"/><br>

                            Fax <br><html:text property="fax"/><br>
                            <br>
                            <html:submit value="Enviar"/>
                            <html:cancel value="Cancelar"/>

                        </html:form>
                    </fieldset>
                    <div id="nota">
                    * Los campos marcados con asteriscos son obligatorios
                    </div>
                </td>
            </tr>
        </table>
    </body>
</html>
