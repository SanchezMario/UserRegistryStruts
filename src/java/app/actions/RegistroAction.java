/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.actions;

import app.actionForm.RegistroDeUsuarioForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author MarioSanchez
 */
public class RegistroAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {


        //controlamos si se cancelo el registro.
        if (isCancelled(request)) {
            return mapping.findForward("fracaso");

        } else {
            //si no se canceló obtenemos el objeto usuario de RegistroDeUsuarioForm.
            RegistroDeUsuarioForm alta = (RegistroDeUsuarioForm) form;
            String usuario = alta.getUsuario();
            //lo Guardamos como atributo de la sesión.

            HttpSession sesion = request.getSession();
            sesion.setAttribute("usuario", usuario);

            //redirigir a la vista
            return mapping.findForward("exito");
        }
    }
}
