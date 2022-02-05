package main;

public class Transaccion implements ITransaccion{
    private float cantidad;
    private float balance;
    private TipoTransaccion tipoTransaccion;

    public Transaccion(float cantidad, float balance, TipoTransaccion tipoTransaccion) {
        this.cantidad = cantidad;
        this.balance = balance;
        this.tipoTransaccion = tipoTransaccion;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public TipoTransaccion getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(TipoTransaccion tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }
    
}
