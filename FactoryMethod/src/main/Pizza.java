package main;

public class Pizza {

    private int cantidadRevanadas;
    private String especialidad;

    public Pizza(int cantidadRevanadas, String especialidad) {
        this.cantidadRevanadas = cantidadRevanadas;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Cantidad revanadas: " + this.cantidadRevanadas+", Especialidad: "+this.especialidad;
    }

}
