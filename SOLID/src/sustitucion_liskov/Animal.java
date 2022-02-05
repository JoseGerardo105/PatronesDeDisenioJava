package sustitucion_liskov;

/*
Sustitución Liskov:
Vamos a abstraer nuestro pensamiento, de tal forma que las clases hijas implementen 
los métodos que realmente necesitam
*/
public class Animal {

    public void dormir() {
        System.out.println("El animal duerme");
    }

    public void comer() {
        System.out.println("El animal come");
    }
}
