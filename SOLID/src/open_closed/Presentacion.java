/*
Abierto cerrado --> Este principio nos dice que nuestras entidades del tipo que sean, pudiendo ser:
clase, módulo, entidad y/o función debe estar abierta a la extensión pero cerrada a la modificación
 */
package open_closed;


public class Presentacion {

    public void mostrar(IFigura figura) {
        System.out.println(figura);
    }
    
    
    /*
    Para una extensión de nuestro programa creando mas figuras no se cumpliria el principio de 
    open closed si lo dejaramos de esta manera, 
    public void mostrar(Rectangulo rectangulo) {
        System.out.println(rectangulo);
    }
    
    public void mostrar(Triangulo triangulo){
        System.out.println(triangulo);
    }
    debido a que como tal nuestro módulo (la clase), debe estar abierto a la modificación, que en 
    este caso se cumple, pero de la misma forma debería estar cerrado a la modificación y con
    otras clases este principio no se cumpliría, y lo que haríamos es crear nuevos métodos extendiendo
    cada vez mas la clase
    */
}
