package main;

public class Manzana implements IFruta, IVisitable{
    public float getPrecio(){
        return 2f;
    }

    @Override
    public float aplicarDescuento(IVisitor visitor) {
        return visitor.visit(this);
    }
}
