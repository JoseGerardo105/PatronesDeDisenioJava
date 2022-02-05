package main;

public class OffDevise implements ICommand{

    //Debemos implementar la Interfaz ICommand
    
    private IDevise devise;
    
    public OffDevise(IDevise devise){
        this.devise = devise;
    }
    
    @Override
    public void operacion() {
        this.devise.off();
    }
    
    
}
