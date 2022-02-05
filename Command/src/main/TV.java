package main;

public class TV implements IDevise {

    public boolean on;

    public TV() {
        this.on = false;
    }

    //Entonces lo que haremos será desacoplar los métodos siguientes de la clase que los manda llamar,
    //y para ello implementaremos el patrón de diseño command.
    @Override
    public void on() {
        this.on = true;
        System.out.println("TV encendida");
    }

    @Override
    public void off() {
        this.on = true;
        System.out.println("TV apagada");
    }

}
