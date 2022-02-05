package simple_responsability;

/*
Responsabilidad única: Las clases deben tener una responsabilidad concreta
Una clase debe unicamente realizar una tarea, para tener una alta cohesión
 */
public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(3, 4);
        Presentacion presentacion = new Presentacion();
        presentacion.mostrar(rectangulo);
    }
}
