package main;

public class Teclado implements ITeclado{

    @Override
    public void conectar() {
        System.out.println("Conexión teclado vía USB");
    }
}
