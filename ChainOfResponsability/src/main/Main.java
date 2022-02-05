package main;

public class Main {

    /*
    Vamos a simular una transacción bancaria utilizando la cadena de responsabilidad
     */
    public static void main(String[] args) {
        Transaccion transaccion = new Transaccion(100, 200, TipoTransaccion.CHEQUES);
    
        /*
        Para que podamos generar la cadena de responsabilidad satisfactoriamente, lo primero que
        necesitamos hacer es una nueva interfaz --> Manejador
        */
        
        IManejadorTransacciones deposito = new Deposito();
        IManejadorTransacciones retiro = new Retiro();
        IManejadorTransacciones reembolso = new Reembolso();
        
        //Con la n cantidad de instancias ahora vamos a encadenar
        deposito.setNextManejador(deposito);
        deposito.setNextManejador(retiro);
        deposito.setNextManejador(reembolso);
        
        deposito.ejecutarTransaccion(transaccion);
    }
}
