package main;

//Cada una de las clases -- Tipo transacción, van a implementar la Interfaz de manejador
public class Deposito implements IManejadorTransacciones {

    //Estas 3 clases: Deposito, Retiro y Reembolso, deberan ser capaces de responder a la petición de 
    //una transacción
    //Vamos a apuntar al siguiente objeto
    private IManejadorTransacciones next;

    @Override
    public void setNextManejador(IManejadorTransacciones next) {
        this.next = next;
    }

    @Override
    public void ejecutarTransaccion(ITransaccion transaccion) {
        //Aquí evaluaremos si nuestra clase es capáz de responder a la petición
        if (transaccion.getTipoTransaccion() == TipoTransaccion.DEPOSITO) {
            //Si esto ocurre, nuestra clase será capáz de responder a la petición
            float cantidad = transaccion.getCantidad() + transaccion.getBalance();
            System.out.println("El nuevo balance después de un depósito es: " + cantidad);
        } else {
            //Apuntamos al siguiente objeto
            /*
            Con esta línea de código nuestra clase Deposito se desblinda de que ella
            pueda responder a la petición, le da la responsabilidad a la siguiente clase.
            */
            this.next.ejecutarTransaccion(transaccion);
        }
    }

}
