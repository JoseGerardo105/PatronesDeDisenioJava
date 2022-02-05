package main;

/*
Decorator: Agrega responsabilidades adicionales a un objeto dinámicamente. A un objeto
ya creado en tiempo de ejecución, podemos agregarle mas funcionalidades sin tener que utilizar
la herencia. Dejar la herencia de lado no significa que estamos programando mal

El truco de decorator es que nuestras clases deben implementar la misma interfaz que nuestros
objetos principales y tener un atributo privado del tipo que deseamos hacer el wrap
 */
public interface IPizza {

    String descripcion();

    float precio();
}
