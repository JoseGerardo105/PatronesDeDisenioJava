package main;

//Interfaz que nos permite implementar n cantidad de Factorys
public interface IAbstractFactory {
    //Crearemos n cantidad de métodos los cuales nos permiten crear objetos
    
    /*
    Definición de métodos
    Factory method: 1 solo método
    Abstract metod: n métodos
    */
    
    IComputadora crearComputadora();
    ITablet crearTablet();
    
}
