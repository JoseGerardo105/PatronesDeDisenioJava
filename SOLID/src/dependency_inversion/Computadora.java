package dependency_inversion;


/*
Inversión de dependenci: Las entidades deben depender de abstracciones y no de concreciones
Un módulo de alto nivel no debe depender de uno de bajo nivel, sino de abstracciones
 */
//Entidad de alto nivel
public class Computadora {

    private ITeclado teclado;
    private IMouse mouse;

    /*
    De esta manera estaríamos imcumpliendo los principios solid, no se pueden crear los
    nuevos objetos dentro del constructor, estos objetos deberían entrar como parámetros
    public Computadora(){
        this.teclado = new Teclado();
        this.mouse = new Mouse();
    }
     */
    
    public Computadora(ITeclado teclado, IMouse mouse) {
        this.teclado = teclado;
        this.mouse = mouse;
    }

    public void encender() {
        //Para este método conectar, crearemos una nueva interfaz
        this.teclado.conectar();
        this.mouse.conectar();
    }
}
