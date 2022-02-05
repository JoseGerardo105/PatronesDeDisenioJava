package main;

/*
Factory method
 */
public interface IPizzeria {

    //Con esta Interfaz podemos crear n cantidad de pizzerias y cada una de ellas podrá crear una pizza
    Pizza crearPizza(String tipo);
}
