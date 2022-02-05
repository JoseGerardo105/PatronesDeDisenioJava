package main;

/*
Decorator: Agrega responsabilidades adicionales a un objeto dinámicamente. A un objeto
ya creado en tiempo de ejecución, podemos agregarle mas funcionalidades sin tener que utilizar
la herencia. Dejar la herencia de lado no significa que estamos programando mal

El truco de decorator es que nuestras clases deben implementar la misma interfaz que nuestros
objetos principales y tener un atributo privado del tipo que deseamos hacer el wrap
 */
public class Main {

    public static void main(String[] args) {
        IPizza pizzaPeperoni = new PizzaPeperoni();
        System.out.println(pizzaPeperoni.descripcion());
        System.out.println(pizzaPeperoni.precio());

        IPizza pizzaHawaiana = new PizzaHawaiana();
        System.out.println(pizzaHawaiana.descripcion());
        System.out.println(pizzaHawaiana.precio());

        IPizza pizzaPeperoniConQueso = new QuesoExtra(new PizzaPeperoni());
        System.out.println(pizzaPeperoniConQueso.descripcion());
        System.out.println(pizzaPeperoniConQueso.precio());

        IPizza pizzaHawaianaOrillaRellenaQueso = new OrillaRellenaQueso(new PizzaHawaiana());
        System.out.println(pizzaHawaianaOrillaRellenaQueso.descripcion());
        System.out.println(pizzaHawaianaOrillaRellenaQueso.precio());

        //Pizza hawaiana con queso extra y orilla rellena
        IPizza pizzaHawaianaConQuesoOrillaRellena = new QuesoExtra(new OrillaRellenaQueso(new PizzaHawaiana()));
        System.out.println(pizzaHawaianaConQuesoOrillaRellena.descripcion());
        System.out.println(pizzaHawaianaConQuesoOrillaRellena.precio());

        //Estamos haciendo un wrapper y en cada wrapper nuevo, vamos añadiendo mas funcionalidad
        //a lo que inicialmente creamos, es decir la clase Pizza.
    }
}
