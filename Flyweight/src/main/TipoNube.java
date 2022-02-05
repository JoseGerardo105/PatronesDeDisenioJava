package main;

//Únicamente pueden existir estos 3 tipos de nubes con la característica que exixtirán n de ellas
//Teniendo en cuenta esto, no podríamos generar un objeto nube para cada objeto, ya que ello consume 
//muchos recursos a nuestra computadora.
//Lo que podemos hacer es implementar el patrón de diseño Flyweight, pudiendo generar únicamente
//un objeto por cada tipo de nube y que ese objeto se recicle de tal forma que pueda ser pintado
//en diferentes lugares

public enum TipoNube {
    CHICA,
    MEDIANA,
    GRANDE
}
