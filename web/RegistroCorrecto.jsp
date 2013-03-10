<%-- 
    Document   : RegistroCorrecto
    Created on : 26-oct-2012, 16:23:55
    Author     : MarioSanchez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="estiloRegistro.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo Struts</title>
    </head>
    <body>
        <% String usuario = (String) request.getSession().getAttribute("usuario");%>
        
        <h1>Registro de usuario</h1>
        <br>
        <br>
        <br>
        <table align="center">
            <tr>
                <td>
                    <fieldset>
                        <legend align= "center">Resultado Registro</legend>
                        <h2>El usuario <%=usuario%> ha sido dado de alta</h2>
                       
                </td>
            </tr>
        </table>
    </body>
</html>
