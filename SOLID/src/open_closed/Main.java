package open_closed;

/*
Abierto cerrado --> Este principio nos dice que nuestras entidades del tipo que sean, pudiendo ser:
clase, módulo, entidad y/o función debe estar abierta a la extensión pero cerrada a la modificación
 */
public class Main {

    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(3, 4);
        Presentacion presentacion = new Presentacion();
        presentacion.mostrar(rectangulo);

        Triangulo triangulo = new Triangulo(3, 4);
        presentacion.mostrar(triangulo);
    }
}
