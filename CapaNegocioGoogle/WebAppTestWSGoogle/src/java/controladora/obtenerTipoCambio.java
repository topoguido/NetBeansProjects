/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladora;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.DatatypeConfigurationException;
import negocio.Administradora;
import negocio.IOException_Exception;
import negocio.MessagingException_Exception;

/**
 *
 * @author Emiliano
 */
public class obtenerTipoCambio extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, DatatypeConfigurationException, MessagingException_Exception, IOException_Exception {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String fecha = request.getParameter("Fecha");
            String monedaDesde = request.getParameter("MonedaDesde");
            String monedaHasta = request.getParameter("MonedaHasta");
            String tipoCotizacion = request.getParameter("tipoCotizacion");
           
            Administradora admin = new Administradora();
            
            
            SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
            String strFecha = fecha;
            Date fecha1 = null;
            try {
                fecha1 = formatoDelTexto.parse(strFecha);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
            
            ArrayList res = admin.obtenerTipoCambio("gonzalo.gutierrez@kersconsulting.com.ar", "Boca1987!", monedaDesde, monedaHasta, tipoCotizacion, fecha1);
            if(res.isEmpty())
            {}
            else
            {
                request.setAttribute("mensaje", "Compra: " + res.get(0) + "/ Venta: " + res.get(1));
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(obtenerTipoCambio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException_Exception ex) {
            Logger.getLogger(obtenerTipoCambio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException_Exception ex) {
            Logger.getLogger(obtenerTipoCambio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(obtenerTipoCambio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException_Exception ex) {
            Logger.getLogger(obtenerTipoCambio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException_Exception ex) {
            Logger.getLogger(obtenerTipoCambio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
