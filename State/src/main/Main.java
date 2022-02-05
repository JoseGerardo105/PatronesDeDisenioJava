package main;

/*
State:
Permite que un objeto modifique su comportamiento cada vez que cambie su estado interno,
es decir, si un objeto cambia su estado este puede reaccionar de diferentes maneras,
dependiendo del estado en el que se encuentre, dando la ilusión que el objeto ha cambiado
de clase, pero como sabemos eso no es posible.

Satate es bastante sencillo y se siente bastante orgánico
 */
public class Main {

    public static void main(String[] args) {
        /*
        Posibles estados:
        Encendido --> Si esta encendido no puede encenderse, sino que se puede poner en movimiento o apagar
        En movimiento --> No puede encenderse, pero si se podrá apagar 
        Apagado --> No puede apagarse ni moverse, pero si puede encenderse
         */

        //Vamos a trabajar con una pequeña máquina de estado considerando las reglas anteriores
        Auto auto = new Auto();

        /*
        Pasos: 
        1. Generar una nueva interfaz donde colocaremos cada uno de los estados del auto
        2. Implementamos la Interfaz en nuestra clase
        3. Por cada estado generaremos una nueva clase
        4. Cada una de las clases de estado implementa la interfaz --> IEstadoAuto
        5. Dentro de las clases de estado, vamos a generar el comportamiento necesario, además de las reglas
        6. Dentro de auto generamos nuevos objetos, instancias de las clases estado, además del estado actual --> Todos los estados mas el actual
         */
        auto.apagar();
        auto.encender();
        auto.manejar();
    }

}
