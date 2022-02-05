package main;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo desde Main");
        
        //Instancia = Crear un nuevo objeto
        Jaguar yagua = new Jaguar(10,120f);
        System.out.println(yagua);
        
//        yagua.comer();
//        yagua.dormir();
//        yagua.cazar();
//        yagua.rugir();
        //yagua.maullar();
        
        Jaguar jaguar2 = new Jaguar();
        System.out.println(jaguar2);
        
        
        Jaguar jaguar3 = new Jaguar(2);
        System.out.println(jaguar3);
        
        Jaguar jaguar4 = new Jaguar(100f);
        System.out.println(jaguar4);
    }
}
