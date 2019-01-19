/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capanegocio;

/**
 *
 * @author Emiliano
 */
public class Numero {
    private int nro1;
    private int nro2;

    public Numero(int nro1, int nro2) {
        this.nro1 = nro1;
        this.nro2 = nro2;
    }

   public Numero() {
        
    }
    
    
    
    
    public int getNro1() {
        return nro1;
    }

    public int getNro2() {
        return nro2;
    }

    public void setNro1(int x) {
        this.nro1 = x;
    }

    public void setNro2(int b) {
        this.nro2 = b;
    }
    
    public int suma(int a,int b){
      return a + b;
    }
    
}
