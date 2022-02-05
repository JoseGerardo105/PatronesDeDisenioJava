package main;

/*
Singleton Concurrente: Lo vamos a implementar siempre que necesitemos trabajar con una instancia
única dentro de nuestra aplicación 
Con la palabra reservada syncronized en el método de instancia, podremos garantizar
que únicamente se cree un objeto a pezar de la concurrencia
 */
public class Main {

    public static void main(String[] args) {
        //Trabajando con hilos para evaluar la concurrencia
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ConexionDB conexion1 = ConexionDB.obtenerConexion();
                conexion1.host="hola";
                System.out.println(conexion1.hashCode());
                System.out.println(conexion1.host);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ConexionDB conexion2 = ConexionDB.obtenerConexion();
                System.out.println(conexion2.hashCode());
                System.out.println(conexion2.host);
            }
        });
        
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                ConexionDB conexion3 = ConexionDB.obtenerConexion();
                System.out.println(conexion3.hashCode());
                System.out.println(conexion3.host);
            }
        });
        
        t1.start();
        System.out.println("");
        t2.start();
        System.out.println("");
        t3.start();
        
    }
}
