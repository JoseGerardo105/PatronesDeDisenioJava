package main;

/*
Clase que hará el papel de simple factory

Sinmple Factory, nos servirá para crear objetos complejos o para controlar la creación de objetos
Para la creación de objetos complejos simple factory nos será de mucha ayuda 
*/
public class Pizzeria {
    public Pizza crearPizzaChica(){
        //La pizzeria tiene bajo su control que tipo de objetos se pueden crear
        //La creación de un objeto puede pasar por procesos tales como: DB - File - API
        return new Pizza(6);
    }
    
    public Pizza crearPizzaMediana(){
        return new Pizza(8);
    }


    public Pizza crearPizzaGrande(){
        return new Pizza(12);
    }
}


