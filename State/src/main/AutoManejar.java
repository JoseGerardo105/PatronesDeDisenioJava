package main;

public class AutoManejar implements IEstadoAuto{
    
    private final Auto auto;

    public AutoManejar(Auto auto) {
        this.auto = auto;
    }
    
    @Override
    public void encender() {
        System.out.println("El auto no se puede encender ya que está en movimiento");
    }

    @Override
    public void manejar() {
        System.out.println("El auto está en movimiento");
    }

    @Override
    public void apagar() {
        System.out.println("El auto está apagado");
        this.auto.setEstadoActual(auto.getAutoApagado());
    }
    
}
