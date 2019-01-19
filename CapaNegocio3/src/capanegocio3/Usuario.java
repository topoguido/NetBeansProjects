/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capanegocio3;

/**
 *
 * @author Emiliano
 */
public class Usuario {
    
    private String Usuario;
    private String Password;

    public Usuario(String Usuario, String Password) {
        this.Usuario = Usuario;
        this.Password = Password;
    }

    public String getUsuario() {
        return Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
   
    
    
    
}
