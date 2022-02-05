package main;

public interface Iterador {

    //La interfaz tendrá dos métodos:
    //1 --> Cadena con el siguiente
    String siguiente();

    //2 --> booleano para saber si existe un siguiente
    boolean contieneSiguiente();
    
    /*
    En java ya existe una interfaz Iterator y nosotros podemos implementarla sin ningún problema
    */
    
}
