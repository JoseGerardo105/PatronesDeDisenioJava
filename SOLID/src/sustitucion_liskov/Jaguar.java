package sustitucion_liskov;

/*
Sustitución Liskov:
Vamos a abstraer nuestro pensamiento, de tal forma que las clases hijas implementen 
los métodos que realmente necesitam
 */
public class Jaguar extends Animal implements IFelinoSalvaje {

    /*Se cumple el principio de Liskov ya que la clase padre implementa todo lo que 
    contiene la clase padre
     */
    private int edad;
    private float peso;

    public Jaguar(int edad, float peso) {
        this.setEdad(edad);
        this.setPeso(peso);
        /*
            También podríamos hacerlo de la siguiente manera
        this.edad = edad;
        this.peso = peso
         */
    }

    public Jaguar() {
        edad = 0;
        peso = 0;
    }

    public Jaguar(int edad) {
        this.edad = edad;
        this.peso = 0;
    }

    public Jaguar(float peso) {
        this.edad = 0;
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Mi edad es: " + getEdad() + ", Mi peso es: " + getPeso();
    }

    @Override
    public void rugir() {
        System.out.println("El jaguar ruge");
    }

    @Override
    public void cazar() {
        System.out.println("El jaguar caza");
    }

    //Polimorfismo: Cambiar el comportamiento de métodos de la clase padre
    @Override
    public void dormir() {
        System.out.println("El jaguar duerme");
    }

    @Override
    public void comer() {
        System.out.println("El jaguar come");
    }
}
