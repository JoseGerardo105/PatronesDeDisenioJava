package main;

public interface ITransaccion {

    float getCantidad();

    void setCantidad(float cantidad);

    float getBalance();

    void setBalance(float balance);

    TipoTransaccion getTipoTransaccion();

    void setTipoTransaccion(TipoTransaccion tipoTransaccion);
}
