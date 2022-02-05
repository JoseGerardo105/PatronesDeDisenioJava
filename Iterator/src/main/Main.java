package main;

/*
Iterador:
Este patrón nos proveera un mecanismo el cual nos permita iterar una colección,
de tal manera que ciertos atributos y ciertos métodos se encuentren protegidos.
Además, provee un mecanismo estándar para acceder secuencialmente a los elementos
de una colección
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        GuiaTelefonica guia = new GuiaTelefonica();
        guia.addNumero("123");
        guia.addNumero("124");
        guia.addNumero("125");
        guia.addNumero("126");
        guia.addNumero("127");
        guia.addNumero("128");
        guia.addNumero("129");

        /*Si en dado caso un objeto quiere saber todos los números telefónicos que existen
        en la guía, nosotros podemos proteger los atributos y métodos de la guia 
        telefónica, con la implementación del patrón ITERATOR
        
        PASOS:
        1. Geenerar una interfaz --> Iterador
        2. Generamos una clase que implemente la interfaz Iterador
        */
        
        
        
        /*
        Internamente nuestro cliente no sabe que existe un arraylist
        sino que unicamente desea iterar
        */
        Iterador iterador = new IteradorGuia(guia);
        while (iterador.contieneSiguiente()) {            
            System.out.println(iterador.siguiente());
        }
        
    }

}
