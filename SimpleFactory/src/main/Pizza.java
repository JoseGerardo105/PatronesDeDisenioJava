package main;

public class Pizza {
    private int cantidadRevanadas;

    public Pizza(int cantidadRevanadas) {
        this.cantidadRevanadas = cantidadRevanadas;
    }

    @Override
    public String toString() {
        return "Cantidad revanadas: "+this.cantidadRevanadas;
    }

    
}
