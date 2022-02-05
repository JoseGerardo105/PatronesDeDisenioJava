/*
Responsabilidad única: Las clases deben tener una responsabilidad concreta
Una clase debe unicamente realizar una tarea, para tener una alta cohesión
 */
package simple_responsability;

public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + ", área= "+area()+"}";
    }

    public double area() {
        return base * altura;
    }
    
    /*
    Con esto nuestra clase ya no cumple el principo de responsabilidad simple
    Ya que la clase tiene varias funciones y por ende una baja cohesión,
    por tanto el método de mostrar debería ir en otra clase que se encargue de
    ello --> Presentacion
    public void mostrar(){
        System.out.println(this);
    }
    */
}
