/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

public abstract class Usuario {

    /*
    Esta será nuestra clase padre, y dentro de ella vamos a definir todos los algoritmos que 
    las clases hijas van a utilizar
     */
    public void autenticacion() {
        System.out.println("Todos los usuarios necesitan autenticarse");
    }

    //Acciones que las clases hijas deben de definir como ejecutar
    //La clase hija debe definir el como
    abstract void formaTrabajar();

}
