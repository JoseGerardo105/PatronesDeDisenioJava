package main;

/*
Flyweight: 
Este patrón nos permite reutilizar objetos de tal manera que podamos crear aplicaciones
con la mínima cantidad de recursos necesarios 
*/
public class Main {
    public static void main(String[] args) {
        NubeFactory factory = new NubeFactory();
        
        for (int i = 0; i < 100; i++) {
            Nube nube = factory.getNube(TipoNube.CHICA); 
        }
        
        for (int i = 0; i < 200; i++) {
            Nube nube = factory.getNube(TipoNube.MEDIANA); 
        }
        
        for (int i = 0; i < 300; i++) {
            Nube nube = factory.getNube(TipoNube.GRANDE); 
        }
        
        
        //A pesar de las 600 iteraciones únicamente se generaron 3 objetos
        //En memoria únicamente tenemos 3 objetos
        System.out.println(factory.countNubesMap());
        
    }
}
