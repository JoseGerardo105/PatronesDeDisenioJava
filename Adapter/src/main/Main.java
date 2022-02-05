package main;

//Esta es la clase cliente
public class Main {

    public static void main(String[] args) {

        //Lo único que se modifica en la clase cliente es esta línea
        //Aunque el cliente piense que está trabajando con una conexión SQL, en el fondo está trabajando con una conexión No Sql, puntualmente con la clase ConexionMongoDB
        IConexionSQL conexion = new AdaptadorDB(new ConexionMongoDB());

        conexion.conexion();

        String resultado = conexion.runQuery();
        System.out.println(resultado);
    }
}
