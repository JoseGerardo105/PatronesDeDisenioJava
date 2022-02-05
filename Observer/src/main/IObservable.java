package main;

//Esta interfaz debe tener por lo menos 2 métodos
public interface IObservable {
    void addObserver(IObserver o);
    void notificarObservadores();
    //Este último método es opcional
    void removeObserver();
}
