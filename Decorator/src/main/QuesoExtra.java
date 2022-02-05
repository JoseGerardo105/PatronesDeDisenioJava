package main;

/*
Decorator: Agrega responsabilidades adicionales a un objeto dinámicamente. A un objeto
ya creado en tiempo de ejecución, podemos agregarle mas funcionalidades sin tener que utilizar
la herencia. Dejar la herencia de lado no significa que estamos programando mal

El truco de decorator es que nuestras clases deben implementar la misma interfaz que nuestros
objetos principales y tener un atributo privado del tipo que deseamos hacer el wrap
 */
//Con esta clase implementaremos el patrón decorator
public class QuesoExtra implements IPizza {

    //Composición
    //Con este objeto asignado podemos cambiar el comportamiento de la interfaz
    private IPizza pizza;

    public QuesoExtra(IPizza pizza) {
        this.pizza = pizza;
    }

    //Estamos envolviendo nuestro objeto y además estamos añadiendo mas funcionalidad
    @Override
    public String descripcion() {
        return this.pizza.descripcion() + " Queso extra";
    }

    @Override
    public float precio() {
        return this.pizza.precio() + 2;
    }
}
