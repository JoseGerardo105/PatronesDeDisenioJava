package main;

import java.util.ArrayList;

public class Menu implements IMenu {
    
    //Mediante la lista podemos jerarquizar nuestros objetos
    private ArrayList<IMenu> menus;

    public Menu() {
        this.menus = new ArrayList<>();
    }

    @Override
    public boolean open() {
        System.out.println("Open!");
        return true;
    }

    @Override
    public boolean close() {
        System.out.println("Close!");
        return true;
    }

    //Insertamos objetos a la lista
    public void addMenu(IMenu menu) {
        menus.add(menu);
    }

    //Obtenemos objetos de la lista
    public IMenu getMenu(int pos) {
        return this.menus.get(pos);
    }
}
