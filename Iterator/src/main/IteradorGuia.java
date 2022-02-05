package main;

/*
Con esta clase vamos a iterar nuetra guia telefónica y muy puntualmente el atributo guia
sin tener en cuenta los demás atributos aparte de la lista.
Con esto añadimos una capa de seguridad a la clase GuiaTelefonica de tal manera que no
expongamos sus atributos y sus métodos 
*/
public class IteradorGuia implements Iterador {

    //A esta clase únicamente le intersará trabajar con el atributo números de Guia telefónica
    private GuiaTelefonica guia;
    //Para tener un control sobre la iteración de la lista --> atributo posición
    private int posicion;

    public IteradorGuia(GuiaTelefonica guia) {
        this.guia = guia;
    }

    @Override
    public String siguiente() {
        return this.guia.getNumeros().get(this.posicion++);
    }

    @Override
    public boolean contieneSiguiente() {
        //Con esto evaluiaremos si es que estamos al final de la lista
        return this.posicion < this.guia.getNumeros().size() && this.guia.getNumeros().get(posicion) != null;
    }

}
