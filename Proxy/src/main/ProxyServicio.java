package main;

/*
Esta clase va a ser nuestro proxy y jugará el papel del servicio para el cliente, es decir, 
el cliente no sabrá que internamente ha sido reemplazado el servicio por un proxy
 */
public class ProxyServicio implements IServicio {

    //El proxy va a tener comunicación con el servicio original
    private IServicio servicio;
    private Usuario usuario;

    public ProxyServicio(IServicio servicio, Usuario usuario) {
        this.servicio = servicio;
        this.usuario = usuario;
    }

    @Override
    public void leer() {
        //Siempre tendrá permisos
        this.servicio.leer();
    }

    //Con lpo siguiente limitaremos funcionalidades de nuestro sistema
    //Para estos tres siguientes métodos hay restricciones y por tanto lo debemos validar
    @Override
    public void escribir() {
        if (this.usuario.getNivelPermiso() >= 5) {
            //Es administrador
            this.servicio.escribir();
        } else {
            throw new UnsupportedOperationException("Error de seguridad");
        }
    }

    @Override
    public void actualizar() {
        if (this.usuario.getNivelPermiso() >= 5) {
            this.servicio.actualizar();
        } else {
            throw new UnsupportedOperationException("Error de seguridad");
        }
    }

    @Override
    public void eliminar() {
        if (this.usuario.getNivelPermiso() >= 5) {
            this.servicio.eliminar();
        } else {
            throw new UnsupportedOperationException("Error de seguridad");
        }
    }

}
