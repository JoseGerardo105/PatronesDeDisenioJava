package main;

import java.util.HashMap;

public class NubeFactory {

    /*
    En java podemos implementar el patrón de diseño flyweight a través de un hash map
     */

    private HashMap<TipoNube, Nube> nubesMap;

    public NubeFactory() {
        //Intanciamos nuestro objeto
        this.nubesMap = new HashMap<TipoNube, Nube>();
    }

    public Nube getNube(TipoNube tipo) {
        //Este método intentará obtener del mapa una nube a
        //partir del parámeto que hemos colocado, en este caso la clave
        Nube nube = (Nube) this.nubesMap.get(tipo);

        //Si no lo obtiene
        if (nube == null) {
            //No existe
            //Procedemos a crear ese nuevo objeto
            //únicamente creamos objetos que no existan dentro del mapa
            nube = new Nube(tipo, "nube.png", 100, 100);
            //Ahora insertaremos el objeto creado en nuestro mapa
            //--> put: insertar
            this.nubesMap.put(tipo, nube);
        }
        return nube;
    }
    
    public int countNubesMap(){
       return this.nubesMap.size(); 
    }

}
