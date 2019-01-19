/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import capaNegocioEtiquet.Administradora;
import capaDatosEtiquet.F5660005;
/**
 *
 * @author ge0022
 */
public class main {
        public static void main (String[] args) {
    
        
        Administradora admin = new Administradora();
        /*ArrayList lista = new ArrayList();
        lista = admin.getEtiqueta("AC0000526");
        System.out.println(lista.get(0));
        */
        admin.getEtiqueta("AC0005226");
        if(!admin.getEtiqueta("AC0005226").isEmpty())
        {
            System.out.println("Etiqueta:"+admin.getEtiqueta("AC0005226").get(0));
        }
        else
        {
            System.out.println("Nada que mostrar");
        }
}
    
}
