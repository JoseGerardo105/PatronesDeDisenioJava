package main;

/*
Esta clase va realizar las tareas complejas de nuestro sistema y únicamente va exponer al cliente
los métodos que le interese
 */
public class Fachada {

    private Computadora computadora;

    /*
    Con fachada(Facade), nosotros vamos a proporcionar nosotros vamos a proporcionar una interfaz al cliente
    de tal manera que el cliente pueda utilizar sistemas complejos de una forma muy sencilla
    La fachada jugará un papel intermediario entre el cliente y nuestro sistema complejo
    */
    
    public Fachada() {
        //Nuestra computadora necesita diferentes componentes, un teclado y un mouse, como al cliente no
        //le interesa saber esto, esa tarea la vamos a delegar a la fachada 
        //Este patrón de diseño no es creacional
        
        ITeclado teclado = new Teclado();
        IMouse mouse = new Mouse();
        this.computadora = new Computadora(teclado, mouse);
    }

    //Posteriormente podemos crear los métodos que sí le interesan al cliente
    public void encender(){
        //Estos métodos de intancia van a realizar las tareas complejas
        //Todas las tareas complejas las va realizar la fachada
        this.computadora.encender(); 
    }
}
