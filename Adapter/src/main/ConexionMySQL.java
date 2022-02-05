package main;

public class ConexionMySQL implements IConexionSQL {

    @Override
    public void conexion() {
        System.out.println("Conexión MySQL");
    }

    @Override
    public String runQuery() {
        return "Consulta MySQL";
    }

}
