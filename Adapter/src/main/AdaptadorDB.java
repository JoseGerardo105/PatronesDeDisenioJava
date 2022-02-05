package main;

//Esta clase hará el papel de clase adaptadora

/*
En este caso el adaptador servirá como puente entre el cliente y la interfaz IConexionNoSQL
Como el cliente espera la interfaz IConexionSQL debemos de implementarla
 */
public class AdaptadorDB implements IConexionSQL {

    //Para poder definir el comportamiento de los métodos necesitamos de el siguiente atributo
    //Con esto estaremos conectando Conexión SQL con Conexión noSQL, que por sí solas no pueden trabajar en conjunto
    private IConexionNoSQL noSQL;

    //Adaptaremos el comportamiento de una interfaz con otra interfaz
    public AdaptadorDB(IConexionNoSQL noSQL) {
        this.noSQL = noSQL;
    }

    @Override
    public void conexion() {
        this.noSQL.conexion();
    }

    @Override
    public String runQuery() {
        return this.noSQL.excecuteSentence();
    }

}
