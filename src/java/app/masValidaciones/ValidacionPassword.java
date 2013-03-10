/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.masValidaciones;

import java.io.Serializable;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.validator.Field;
import org.apache.commons.validator.Validator;
import org.apache.commons.validator.ValidatorAction;
import org.apache.commons.validator.util.ValidatorUtils;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.validator.Resources;

/**
 *
 * @author MarioSanchez
 * vamos a crear una clase para validar los password con struts
 */
public class ValidacionPassword implements Serializable{
     
    
    //metodo para comprovar que el pass sea valido
    public boolean comprobarPass(Object object,
                          ValidatorAction va,
                          Field field,
                          ActionMessages errors,
                          Validator vt,
                          HttpServletRequest request){
       
        int nLetras=0,nNumeros=0;
        //extreamos el password cargado en el formulario 
        String pass = ValidatorUtils.getValueAsString(object, field.getProperty());
        
        //bucle for para recorrer el String
        for(int f=0;f<pass.length();f++){
            //Extraemos los caracteres del pass conviertiendoloas a String para poder analizarlo
            String caracter= String.valueOf(pass.charAt(f));
            //analizamos si hay letras
            if (caracter.matches("[a-zA-Z]")){
            nLetras++;
            //vemos si hay numeros
        }else if ( caracter.matches("[0-9]")) {
            nNumeros++;
        }
        }
        //una vez tememos por cuatos numeros y letras esta compuesto el pass
        //llamamos al metodo auxiliar para comprovar que el pass sea valido
         
        if (validarPass(nLetras,nNumeros)==false){
             //si devuelve false se emite mensaje de error
            errors.add(field.getKey(),
             Resources.getActionMessage(request, va, field));
            // y el metodo devuelve false
             return false;
            //si todo es correcto..
        }else {
            //devuelve true
            return  true;
        
        } 
        
    }
    private boolean validarPass(int nLetras, int nNumeros) {
      boolean valido;
      if(nLetras<1 || nNumeros<1){
        valido=false;
    }else{
          valido=true;
      }return valido;
    }
    
    

}
