package sustitucion_liskov;

/*
Sustitución Liskov:
Vamos a abstraer nuestro pensamiento, de tal forma que las clases hijas implementen 
los métodos que realmente necesitam
*/
public interface IFelinoCasero extends IFelino{
    void maullar();
}
