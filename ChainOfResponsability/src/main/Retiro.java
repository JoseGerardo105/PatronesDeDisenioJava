package main;

public class Retiro implements IManejadorTransacciones{
    
    private IManejadorTransacciones next;
    

    @Override
    public void setNextManejador(IManejadorTransacciones next) {
        this.next = next;
    }

    @Override
    public void ejecutarTransaccion(ITransaccion transaccion) {
        if (transaccion.getTipoTransaccion() == TipoTransaccion.RETIRO) {
            float cantidad = transaccion.getCantidad()-transaccion.getBalance();
            System.out.println("El nuevo balance después del retiro es de: "+cantidad);
        }
        else{
            this.next.ejecutarTransaccion(transaccion);
        }
    }
    
    
}
