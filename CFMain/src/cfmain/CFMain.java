package cfmain;

public class CFMain {

    /**
     * Estructuras de datos --> Cadenas String
     */
    public static void main(String[] args) {
        String x = "Hola mundo!";
        System.out.println(x.charAt(0));
        System.out.println(x.charAt(x.length()-1));
        
        for (int i = 0; i < x.length(); i++) {
            System.out.println(x.charAt(i));
        }
        
        //Indice de un caracter de la cadena
        int indice = x.indexOf('m');
        System.out.println(indice);
        
        System.out.println("\n\n");
        //Cadenas e inmutabilidad
        String s1 = "Hola";
        String s2 = s1;
        System.out.println(s1);
        System.out.println(s2);
        //Pasa el garbash colector y se deshace de lo que antiguamente tenia s1
        s1="Hello";
        System.out.println(s1);
        System.out.println(s2);
    }
    
}
