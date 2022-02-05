package dependency_inversion;

/*
Inversión de dependenci: Las entidades deben depender de abstracciones y no de concreciones
Un módulo de alto nivel no debe depender de uno de bajo nivel, sino de abstracciones
 */
public class Main {

    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        Teclado teclado = new Teclado();

        Computadora computadora = new Computadora(teclado, mouse);
        computadora.encender();
    }
}
