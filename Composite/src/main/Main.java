package main;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Menu menu2 = new Menu();
        Menu menu3 = new Menu();
        Menu menu4 = new Menu();
        Menu menu5 = new Menu();

        //Vamos a indicar que menú 4 y menú 5 se encuentren dentro del menú 3:
        //Menú 4 y 5 son hijos de menú 3
        menu3.addMenu(menu4);
        menu3.addMenu(menu5);

        //Menús 2 y 3 serán hijos de nuestro menú principal
        menu.addMenu(menu2);
        menu.addMenu(menu3);

        /*
        Con lo anterior estamos jerarquizando nuestros objetos, realizandolo todo desde una
        lista
         */
        
        
        menu.open();
        menu.close();
    }
}
