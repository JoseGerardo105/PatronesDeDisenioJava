package main;

/*
Prototype: Especifica el tipo de objeto a crear utilizando una instancia como prototipo y crea
nuevos objetos copiando este prototipo
 */
public class Enemigo {

    //A partir de esta clase vamos a implementar prototype
    private String imagen;
    private int posX;
    private int posY;
    private int cantidadVida;

    public Enemigo(String imagen, int posX, int posY, int cantidadVida) {
        this.imagen = imagen;
        this.posX = posX;
        this.posY = posY;
        this.cantidadVida = cantidadVida;
    }

    //Forma 1: Implementando prototype, utilizando un constructor
    public Enemigo(Enemigo enemigo) {
        this.imagen = enemigo.getImagen();
        this.posX = enemigo.getPosX();
        this.posY = enemigo.getPosY();
        this.cantidadVida = enemigo.getCantidadVida();
    }

    //Forma 2: Implementando prototype, generando un propio método de instancia
    public Enemigo clone() {
        //Con this utilizamos el 2do constructor
        return new Enemigo(this);

        //También podríamos llamar al otro constructor:
        //return new Enemigo(this.imagen, this.posX, this.posY, this.cantidadVida);
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getCantidadVida() {
        return cantidadVida;
    }

    public void setCantidadVida(int cantidadVida) {
        this.cantidadVida = cantidadVida;
    }

    @Override
    public String toString() {
        return "Imagen: " + imagen + ", posX:" + posX + ", posY: " + posY + ", cantidadVida: " + cantidadVida;
    }

}
