/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Tuptc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AppleStore apple = new AppleStore();
        SamsungStore samsung = new SamsungStore();
        
        IComputadora mac = apple.crearComputadora();
        ITablet ipad = apple.crearTablet();
        
        IComputadora qx = samsung.crearComputadora();
        ITablet s3 = samsung.crearTablet();
        
        System.out.println(mac);
        System.out.println(ipad);
        System.out.println(qx);
        System.out.println(s3);

    }
    
}
