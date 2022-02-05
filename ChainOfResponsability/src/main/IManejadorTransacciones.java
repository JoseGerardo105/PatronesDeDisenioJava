package main;

//Esta interfaz nos permitirá ejecutar la cadena de responsabilidades
//Con esta Interfaz, será el primer paso para poder aplicar el patrón de chain of responsability
public interface IManejadorTransacciones {
    /*Con este método podremos encadenar objetos, es decir, con este método vamos a ir apuntando al siguiente
    en caso que el objeto actual no pueda responder satisfactoriamente a la petición
    */
    void setNextManejador(IManejadorTransacciones next);
    
    void ejecutarTransaccion(ITransaccion transaccion);
    
}
