<%-- 
    Document   : index
    Created on : 18/01/2018, 14:26:08
    Author     : Emiliano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tipo de cambio oficial</title>
    </head>
    <body>
       
        <form name="formTipoCambio" action="obtenerTipoCambio" method="POST">
            <p>Fecha: <input type="text" name="Fecha" value="" /></p>
            <p>Moneda desde:<input type="text" name="MonedaDesde" value="" /></p>
            <p>Moneda hasta:<input type="text" name="MonedaHasta" value="" /></p>
            <p>Tipo de cotizacion:<input type="text" name="tipoCotizacion" value="" /></p>
            
            <input type="submit" value="Consultar" name="Consultar" />
        </form>
        <div name="resultado">
            <% if(request.getAttribute("mensaje")!=null){%>
                ${mensaje}
            <%}%>
        </div>
    </body>
</html>
