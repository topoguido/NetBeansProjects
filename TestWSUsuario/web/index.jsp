<%-- 
    Document   : index
    Created on : 21/12/2017, 14:35:22
    Author     : Emiliano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Test Usuario</title>
    </head>
    <body>
        <form name="formUsuario" action="LoginServlet" method="POST">
            <input type="text" name="Usuario" value="" />
            <input type="password" name="Password" value="" />
            <input type="submit" value="Consultar" name="btnConsultar" />
        </form>
    </body>
</html>
