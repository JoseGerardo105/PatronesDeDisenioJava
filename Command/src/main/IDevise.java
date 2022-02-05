package main;

//Con esta interfaz podemos crear n cantidad de dispositivos
public interface IDevise {

    void on();

    void off ();
    
    //Si vamos a desacoplar los métodos de nuestra Interfaz, debemos de generar una clase por cada método
    //En este caso como solo hay dos métodos crearemos dos nuevas clases: OnDevice, OffDevice
}
