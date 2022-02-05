package main;

public class Computadora {

    private ITeclado teclado;
    private IMouse mouse;
    
   /*
    Computadora es nuestro sistema complejo, para que nosotros podamos crear una computadora necesitamos
    un teclado y un mouse --> dos variables
    */ 
    public Computadora(ITeclado teclado, IMouse mouse) {
        this.teclado = teclado;
        this.mouse = mouse;
    }

    public void encender() {
        this.teclado.conectar();
        this.mouse.conectar();
    }
}
