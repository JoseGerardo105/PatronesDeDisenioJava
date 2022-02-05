package main;

public class AppleStore implements IAbstractFactory{

    
    
    @Override
    public IComputadora crearComputadora() {
        return new MacbookPro();
    }

    @Override
    public ITablet crearTablet() {
        return new IPad();
    }
    
}
