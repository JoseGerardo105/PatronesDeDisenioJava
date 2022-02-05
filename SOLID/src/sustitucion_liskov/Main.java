package sustitucion_liskov;
/* 
Sustitución Liskov:
Vamos a abstraer nuestro pensamiento, de tal forma que las clases hijas implementen 
los métodos que realmente necesitam
*/
public class Main {
    public static void main(String[] args) {
        Jaguar yagua = new Jaguar(2, 112);
        yagua.cazar();
    }
}
