package main;

/*
Virtual proxy: 
No restringe el acceso al objeto real sino que intenta retrasar su creación
 */
public class ProxyServicio implements IServicio {

    //Servicio será nuestro objeto costoso y únicamente lo vamos a crear cuando nuestro
    //usuario lo necesite
    private IServicio servicio;
    private Usuario usuario;

    public ProxyServicio(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public void leer() {
        this.obtenerServicio().leer();
    }

    public void escribir() {
        if (this.usuario.getNivelPermiso() >= 5) {
            //Es administrador
            this.obtenerServicio().escribir();
        } else {
            throw new UnsupportedOperationException("Error de seguridad");
        }
    }

    @Override
    public void actualizar() {
        if (this.usuario.getNivelPermiso() >= 5) {
            this.obtenerServicio().actualizar();
        } else {
            throw new UnsupportedOperationException("Error de seguridad");
        }
    }

    @Override
    public void eliminar() {
        if (this.usuario.getNivelPermiso() >= 5) {
            this.obtenerServicio().eliminar();
        } else {
            throw new UnsupportedOperationException("Error de seguridad");
        }
    }

    private IServicio obtenerServicio() {
        if (this.servicio == null) {
            //Si nuestro servicio aún no se encuentra instanciado, entonces lo instanciaremos
            //Es aquí donde crearemos el objeto por primera y única vez
            // todo el proceso de crearlo se hará una sola vez y cuando sea estrictamente necesario de crearlo
            this.servicio = new Servicio();
        }
        //Si el objeto está creado o no se retornará
        return this.servicio;
        //Con este nuevo método podremos modificar todos los demás métodos 
    }
}
