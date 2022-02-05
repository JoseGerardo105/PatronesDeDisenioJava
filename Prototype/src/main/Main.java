package main;

public class Main {

    public static void main(String[] args) {
        Enemigo enemigoBase = new Enemigo("Imagen1.png", 0, 100, 2);
        
        //Forma 1 de implementación: Utilizando un constructor
        Enemigo enemigo1 = new Enemigo(enemigoBase);
        Enemigo enemigo2 = new Enemigo(enemigoBase);
        Enemigo enemigo3 = new Enemigo(enemigoBase);
        
        enemigo1.setPosX(100);
        enemigo2.setPosX(150);
        enemigo3.setPosX(200);
        
        Enemigo enemigoBase2 = new Enemigo("Imagen1.png", 0, 200, 2);
        Enemigo enemigo4 = enemigoBase2.clone();
        Enemigo enemigo5 = enemigoBase2.clone();
        Enemigo enemigo6 = enemigoBase2.clone();
        
        enemigo4.setPosX(100);
        enemigo5.setPosX(150);
        enemigo6.setPosX(200);
        System.out.println(enemigo1);
        System.out.println(enemigo2);
        System.out.println(enemigo3);
        System.out.println(enemigo4);
        System.out.println(enemigo5);
        System.out.println(enemigo6);
    }
}
