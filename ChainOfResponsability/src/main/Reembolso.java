package main;

public class Reembolso implements IManejadorTransacciones{

    private IManejadorTransacciones next;
    
    @Override
    public void setNextManejador(IManejadorTransacciones next) {
        this.next = next;
    }

    @Override
    public void ejecutarTransaccion(ITransaccion transaccion) {
        if (transaccion.getTipoTransaccion()==transaccion.getTipoTransaccion().REEMBOLSO) {
            float cantidad = transaccion.getBalance()+transaccion.getCantidad(); 
            System.out.println("El nuevo balance después de un reembolso es de: "+cantidad);
        } else{
            System.out.println("Operación no válida");
        }
    }
    
}
