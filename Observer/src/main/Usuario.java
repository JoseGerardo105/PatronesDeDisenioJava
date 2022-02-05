package main;

public class Usuario implements IObserver {

    @Override
    public void notificacion(String mensaje) {
        System.out.println(mensaje);
    }

}
