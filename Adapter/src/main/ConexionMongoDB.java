package main;

public class ConexionMongoDB implements IConexionNoSQL{

    @Override
    public void conexion() {
        System.out.println("Conexión con MongoDB");
    }

    @Override
    public String excecuteSentence() {
        return "Consulta con MongoDB";
    }
    
}
