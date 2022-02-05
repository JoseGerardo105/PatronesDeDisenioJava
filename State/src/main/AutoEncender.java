package main;

public class AutoEncender implements IEstadoAuto{
    
    //Ponemos una constante de tipo auto
    private final Auto auto;

    public AutoEncender(Auto auto) {
        this.auto = auto;
    }
    
    @Override
    public void encender() {
        System.out.println("El auto está encendido");
    }

    @Override
    public void manejar() {
        System.out.println("El auto está en movimiento");
        auto.setEstadoActual(auto.getAutoMovimiento());
    }

    @Override
    public void apagar() {
        System.out.println("El auto está apagado");
        auto.setEstadoActual(auto.getAutoApagado());
    }
    
}
