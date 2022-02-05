package main;

import java.util.HashMap;


/*
Mediator:
Define un objeto que encapsula como los objetos van a interactuar entre sí
 */
 /*
Esta será la clase que tomarpa el papel de mediator
 */
public class SalaChat {

    //Para tener un control de los usuarios que se encuentran en la sala
    private HashMap<String, Usuario> usuarios;
    
    public SalaChat() {
        //Vamos a instanciar al hashmap
        this.usuarios = new HashMap<String, Usuario>();
    }

    //Agregaremos los participantes a nuestro mapa
    public void addParticipante(Usuario usuario) {
        //key == nombre del usuario
        //Objeto valor == usuario
        this.usuarios.put(usuario.getNombre(), usuario);
    }

    //
    public void enviarMensaje(Usuario usuarioRemitente, Usuario usuarioReceptor, String mensaje) {
        //Aquí es donde colocaremos la lógica necesaria para que los objetos puedan comunicarse entre sí
        if (this.usuarios.get(usuarioRemitente.getNombre()) != null
                && this.usuarios.get(usuarioReceptor.getNombre()) != null) {
            //Si ambos usuarios existen en el mapa, tanto remitente como receptor
            mensaje = "De: " + usuarioRemitente.getNombre() + " mensaje: " + mensaje;
            usuarioReceptor.recibirMensaje(mensaje);
        }
        
    }
}
