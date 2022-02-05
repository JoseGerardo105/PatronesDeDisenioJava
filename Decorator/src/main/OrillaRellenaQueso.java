package main;

/*
Decorator: Agrega responsabilidades adicionales a un objeto dinámicamente. A un objeto
ya creado en tiempo de ejecución, podemos agregarle mas funcionalidades sin tener que utilizar
la herencia. Dejar la herencia de lado no significa que estamos programando mal

El truco de decorator es que nuestras clases deben implementar la misma interfaz que nuestros
objetos principales y tener un atributo privado del tipo que deseamos hacer el wrap
 */
public class OrillaRellenaQueso implements IPizza {

    private IPizza pizza;

    public OrillaRellenaQueso(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String descripcion() {
        return this.pizza.descripcion() + " Orilla rellena de queso";
    }

    @Override
    public float precio() {
        return this.pizza.precio() + 4;
    }

}
