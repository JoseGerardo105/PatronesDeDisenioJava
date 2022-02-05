package main;

public class OnDevise implements ICommand {

    //Debemos implementar la Interfaz ICommand
    //Todas las clases que implementen ICommand deben de tener un atributo privado de tipo Device
    private IDevise devise;

    public OnDevise(IDevise devise) {
        this.devise = devise;
    }

    @Override
    public void operacion() {
        this.devise.on();
    }
}
