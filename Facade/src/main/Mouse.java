package main;

public class Mouse implements IMouse{

    @Override
    public void conectar() {
        System.out.println("Conexión mouse vía USB");
    }
}
