package main;

public class DescuentoComun implements IVisitor {

    //Es en esta clase donde colocaremos el descuento para cada tipo de producto
    //De esta manera separamos los algoritmos de los objetos, en ningun momento los
    //objetos conocen si se les aplicará o no un descuento
    @Override
    public float visit(IFruta fruta) {
        return fruta.getPrecio() * 0.1f;
    }

    @Override
    public float visit(ILineaBlanca lineaBlanca) {
        return lineaBlanca.getPrecio() * 0.05f;
    }

}
