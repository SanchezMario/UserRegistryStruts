/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.actionForm;

import org.apache.struts.validator.ValidatorForm;

/**
 *
 * @author MarioSanchez
 */
public class RegistroDeUsuarioForm extends ValidatorForm{
    private String nombre; 
  private String apellido; 
  private String usuario; 
  private String password; 
  private String email; 
  private String telefono; 
  private String fax; 
  private boolean registrado;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isRegistrado() {
        return registrado;
    }

    public void setRegistrado(boolean registrado) {
        this.registrado = registrado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    

  
}
