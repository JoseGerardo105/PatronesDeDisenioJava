package main;
 /*
Singleton: Lo vamos a implementar siempre que necesitemos trabajar con una instancia
única dentro de nuestra aplicación 
*/
public class Main {

    public static void main(String[] args) {
        //Los tres objetos son el mismo
        ConexionDB conexion = ConexionDB.obtenerConexion();
        ConexionDB conexion2 = ConexionDB.obtenerConexion();
        ConexionDB conexion3 = ConexionDB.obtenerConexion();

        //Con el atributo host nos podemos sersiorar que es el mismo objeto
        conexion.host = "Localhost";
        System.out.println(conexion.host);
        System.out.println(conexion2.host);
        System.out.println(conexion3.host);

        //El método hashCode, nos va a retornar un hash único para cada objeto
        System.out.println(conexion.hashCode());
        System.out.println(conexion2.hashCode());
        System.out.println(conexion3.hashCode());

    }

}
