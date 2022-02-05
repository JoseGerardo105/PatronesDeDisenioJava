package main;

public class Lavadora implements ILineaBlanca, IVisitable{
    public float getPrecio(){
        return 20f;
    }

    @Override
    public float aplicarDescuento(IVisitor visitor) {
        return visitor.visit(this);
    }
}
