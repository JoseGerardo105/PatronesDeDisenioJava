package main;

/*
Template method:
Define una estructura algoritmoca cuya lógica quedará a cargo de la subclase .
Generaremos una clase padre la cual posea diferentes algoritmos que serán ejecutables a todas las clases hijas
Todas las clases hijas podrán utilizar estos algoritmos en concreto. De igual manera la clase padre tendrá algunos métodos
los cuales las clases hijas deben definir el comportamiento
*/

/*
Generaremos un sistema que posea una relación 1 a 1 entre un usuario y un tipo de usuario, un usuario en nuestro sistema
puede ser un administrador, un cliente, un vendedor, un repartidor etc.
*/
public class Main {

    public static void main(String[] args) {
        Usuario gerente = new Gerente();
        Usuario administrador = new Administrador();
        
        gerente.autenticacion();
        gerente.formaTrabajar();
        
        administrador.autenticacion();
        administrador.formaTrabajar();
    }
    
}
