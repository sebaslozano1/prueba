package beans;

import modelo.usuario;
import db.dbUsuario;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author jlozano
 */
@ManagedBean(name = "controler")
@RequestScoped
public class controler {

    usuario objusuario = new usuario();
    String mensaje = "";

    public controler() {

    }

    public String save() {

        String ruta = null;
        dbUsuario objdb = new dbUsuario();
        objdb.conectar();
        boolean estado = objdb.insertar2(objusuario);

        if (estado) {
            mensaje = "Usuario registrado con exito";
            ruta = "dos";

        } else {
            mensaje = "Ha ocurrido un error a lintentar registrar el usuario nuevo.";

        }
        return ruta;
    }

    public usuario getUsuario() {
        return objusuario;
    }

    public void setUsuario(usuario objusuario) {
        this.objusuario = objusuario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
