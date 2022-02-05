/*
Abierto cerrado --> Este principio nos dice que nuestras entidades del tipo que sean, pudiendo ser:
clase, módulo, entidad y/o función debe estar abierta a la extensión pero cerrada a la modificación
 */
package open_closed;


public class Rectangulo implements IFigura{

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

    @Override
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
    */
}
