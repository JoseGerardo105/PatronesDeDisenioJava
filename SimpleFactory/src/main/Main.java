package main;

public class Main {
    public static void main(String[] args) {
        //Implementación de simpleFactory
        Pizzeria pizzeriaCF = new Pizzeria();
        
        
        //Pizza pizzaPeperoni = new Pizza(8); //Instancia sin Simple Factory
        
        Pizza pizzaPeperoni = pizzeriaCF.crearPizzaChica();
        System.out.println(pizzaPeperoni);
    }
    
    
}
