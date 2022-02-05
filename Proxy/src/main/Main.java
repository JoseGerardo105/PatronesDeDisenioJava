package main;

/*
Proxy:
Tiene como objetivo limitar funcionalidades de nuestro sistema
 */
public class Main {

    public static void main(String[] args) {
        
        Usuario usuario = new Usuario(2);
        
        //Estamos simulando el trabajo con una base de datos
        IServicio servicio = new ProxyServicio(new Servicio(), usuario);
        
        //Regla futura
        //Para el crud tiene acceso solo administradores
        servicio.leer(); //Usuarios no administradores
        servicio.escribir();
        
        servicio.actualizar();
        servicio.eliminar();
        
        //Con proxy limitaremos ciertas funciones que el cliente antes podía realizar
    }
}
