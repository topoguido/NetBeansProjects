/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Emiliano
 */
public class Administradora {
    
    private Autenticacion auth1 = new Autenticacion();
    TipoCambioRequest exch1 = new TipoCambioRequest();
    
    public ArrayList obtenerTipoCambio(String usr, String pass, String monedaDesde, String monedaHasta, String tipoCotizacion, Date fechaCotizacion) throws DatatypeConfigurationException, MessagingException_Exception, IOException_Exception{
    
    //public static void main (String [] args) throws MessagingException_Exception, IOException_Exception, DatatypeConfigurationException { 
    
    ArrayList resultado = new ArrayList();
    auth1.setUser(usr);
    auth1.setPassword(pass);

    exch1.setMonedaDesde(monedaDesde);
    exch1.setMonedaHasta(monedaHasta);
    exch1.setTipoCotizacion(tipoCotizacion);

    String FORMATER = "yyyy-MM-dd'T'HH:mm:ss";
        
    DateFormat format = new SimpleDateFormat(FORMATER);
        
    XMLGregorianCalendar gDateFormatted1 = DatatypeFactory.newInstance().newXMLGregorianCalendar(format.format(fechaCotizacion));
    
    exch1.setFecha(gDateFormatted1);
    
    TipoCambioResponse response=webServiceTipoDeCambio(auth1,exch1);
    if(response.getErrores().getError().isEmpty())
    {
        System.out.println(response.getCodMoneda());
        System.out.println(response.getCompra());
        System.out.println(response.getFecha());
        System.out.println(response.getTipoCotizacion());

        resultado.add(response.getCompra());
        resultado.add(response.getVenta());
    
    }
    else
    {
        for (int i=0;i<response.getErrores().getError().size();i++)
        {
          System.out.println(response.getErrores().getError().get(i).getCodigoError()) ; 
           System.out.println(response.getErrores().getError().get(i).getDescripcionError()) ; 
        }
    }
    
    return resultado;
    
   }
        
    

    private static TipoCambioResponse webServiceTipoDeCambio(negocio.Autenticacion autenticacion, negocio.TipoCambioRequest tipoCambioRequest) throws MessagingException_Exception, IOException_Exception {
        negocio.WSObtenerTipoCambio_Service service = new negocio.WSObtenerTipoCambio_Service();
        negocio.WSObtenerTipoCambio port = service.getWSObtenerTipoCambioPort();
        return port.webServiceTipoDeCambio(autenticacion, tipoCambioRequest);
    }
    
    private Autenticacion Auth;
    private TipoCambioRequest Exchange;

     
    public Autenticacion getAuth() {
        return Auth;
    }

    public void setAuth(Autenticacion Auth) {
        this.Auth = Auth;
    }

    public TipoCambioRequest getExchange() {
        return Exchange;
    }

    public void setExchange(TipoCambioRequest Exchange) {
        this.Exchange = Exchange;
    }
    
    
}
