package main;

public class PizzeriaCF implements IPizzeria {

    //Es la subclase la que deside que tipo de instancia necesita retornar
    @Override
    public Pizza crearPizza(String tipo) {
        
        //De esta forma estamos implementando el Factory Method
        
        if (tipo.equals("Peperoni")) {
            return new Pizza(8, "Peperoni");
        } 
        
        if (tipo.equals("Hawaiana")) {
            return new Pizza(8, "Hawaiana");
        }
        
        if (tipo.equals("Peperoni orilla rellena")) {
            return new PizzaOrillaRellena(12, "Peperoni");
        }
        
        return null;
        
    }

}
