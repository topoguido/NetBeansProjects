<%-- 
    Document   : index
    Created on : 07/12/2017, 15:15:51
    Author     : Emiliano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form name="form" method=post" action="login">
            <input type="text" name="usuario" value="">
            <input type="password" name="pass" value="">
            <input type="submit" value="guardar" name="guardar" />
        </form>
         <div name="resultado">
            <% if(request.getAttribute("mensaje")!=null){%>
            ${mensaje}
            <%}%>
        </div>
    </body>
</html>
