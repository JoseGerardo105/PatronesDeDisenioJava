package main;

public class Main {

    public static void main(String[] args) {
        Manzana manzana = new Manzana();
        Lavadora lavadora = new Lavadora();

        /*
        Lo que haremos será dar descuentos teniendo en cuenta:
        fruta 10% de descuento
        Linea blanca 5% de descuento
         */
 /*1. Crearemos lo que es el algoritmo para el descuento en una nueva clase: DescuentoComun
        2. Crearemos una interfaz --> IVisitor: definiremos métodos generalmente son:
        Uno para cada producto: visit(IFruta) y visit(LineaBlanca), implementamos esta interfaz
        dentro de la clase de DescuentoComun
        3. Una vez realizados los algoritmos vamos a generar una nueva interfaz --> IVisitable
        Esta interfaz nos permitirá aplicar el descuento a diferentes productos
        implementamos esta interfaz en todos los productos los cuales queremos que tengan un descuento
         */
        IVisitor descuento = new DescuentoComun();

        System.out.println(manzana.aplicarDescuento(descuento));
        System.out.println(lavadora.aplicarDescuento(descuento));
    }

}
