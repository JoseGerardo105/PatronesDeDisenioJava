package main;

/*
Singleton: Lo vamos a implementar siempre que necesitemos trabajar con una instancia
única dentro de nuestra aplicación 
 */

 /*
Esta clase podrá ser instanciada una sola vez
 */
public class ConexionDB {

    //3. Para validar que solo se cree una instancia
    private static ConexionDB conexion;
    public String host;

    //1. Como solo se puede crear una instancia de esta clase el constructor debe ir privado
    private ConexionDB() {

    }

    //2. Generar un método el cual retorne un objeto de la misma clase
    //Vamos a utilizar este método para generar la instancia
    public static ConexionDB obtenerConexion() {
        //4. Validacion en cuanto a si el objeto está instanciado o no
        if (conexion == null) {
            //No se ha instanciado
            conexion = new ConexionDB();
        }

        return conexion;
    }

}
