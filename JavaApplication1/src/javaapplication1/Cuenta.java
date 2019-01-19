/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Emiliano
 */
public class Cuenta
{
    
    int a;
    int b;
    
    public Cuenta()
    {}
    
    public  Cuenta(int Ca, int Cb)
    {
        a = Ca;
        b = Cb;
    }
    
    void setValue(char var, int valor)
    {
        if (var == 'A' || var == 'a')
        {
            a = valor;
        }
        if(var == 'B' || var == 'b')
        {
            b = valor;
        }
        
    }
    
    int sumar()
    {
      return a + b;
    }
    
    int restar()
    {
       return a - b;
    }
   
}
