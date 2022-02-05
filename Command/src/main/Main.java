package main;

/*
Command:
Este patrón encapsula un mensaje como un objeto, especifica una forma fácil
de separar la ejecución de un comando del entorno que generó dicho comando
*/
public class Main {

    public static void main(String[] args) {
        /*1. Obligatoriamente debemos generar una nueva interfaz --> Command
        esta interfaz únicamente poseerá un método --> operacion --> solo un método
        */
        
        IDevise tv = new TV();
        ICommand on = new OnDevise(tv);
        ICommand off = new OffDevise(tv);
    
        //Si nosotros queremos ejecutar algún método de Devise, lo vamos a hacer mediante las
        //instancias
        
        //Si quiero que la tv se encienda
        on.operacion();
        off.operacion();
        
    }
    
}
