package main;

import java.util.Set;
import java.util.LinkedHashSet;

//En nuestro caso queremos que esta clase notifique el cambio
public class Producto implements IObservable{
    private int stock;
    //Con el tipo de lista set, los observadores no se repiten
    private Set<IObserver> observadores;

    public Producto(int stock) {
        this.stock = stock; 
        /*
        LinkedHashSet: Lo instanciamos de este tipo debido a que habeces las notificaciones se
        deben de hacer en orden, ejemplo: primero sea necesario notificar a un administrador
        que a un usuario normal. En el órden que se vayan agregando, en ese mismo orden se notifican
        */
        this.observadores = new LinkedHashSet<>();
    }

    public void venta(){
        this.setStock(this.stock-1);
        System.out.println("Producto vendido");
        notificarObservadores();
    }
    
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public void addObserver(IObserver o) {
        //Vamos a recibir diferentes observadores, por ende debemos de almacenarlos en alguna estructura
        this.observadores.add(o);
    }

    @Override
    public void notificarObservadores() {
        //Vamos a iterar los observadores, y posteriormente ejecutamos el método de notificación
        //Este método lo vamos a ejecutar cuando se ejecute una venta
        for (IObserver observador : observadores) {
            observador.notificacion("El producto se vendió");
        }
    }

    @Override
    public void removeObserver() {
    }
    
    
}

