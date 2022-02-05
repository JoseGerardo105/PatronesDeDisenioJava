package subcadena;

public class Subcadena {

    public static void main(String[] args) {

        //Longitud de una cadena: Método length()
        String cadena = "Hola que tal!";
        int nCaracteres = cadena.length();

        System.out.println("La cadena tiene " + nCaracteres + " caracteres.");

        //Subcadenas: Método substring()
        String s = cadena.substring(1, 2);
        String t = cadena.substring(0, 10);
        String m = cadena.substring(2);

        System.out.println(s);
        System.out.println(t);
        System.out.println(m);

        //Devolver un solo caracter en especifico: Método charAt(indice desde cero):
        char caracter1 = cadena.charAt(2);
        char caracter2 = cadena.charAt(0);
        System.out.println(caracter1);
        System.out.println(caracter2);

        int a = 0;
        int b = a + 1;
        int c = (2 * 3) + 5 * 4;
        int d = c++;
        int f = c;

        System.out.println(d);
        System.out.println(d + 1);
        System.out.println(c % 2);
        System.out.println(3 + 4 + f * 2);

    }
}
