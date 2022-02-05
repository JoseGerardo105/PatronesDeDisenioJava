package main;

public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario("Codi", 6);

        Usuario memento = usuario.getMememnto(); //Con esto en este punto tendremos nuestra copia

        //A partir de esta copia podemos revertir los cambios hechos a nuestro objeto usuario
        usuario.setNombre("Otro nombre");
        usuario.setEdad(20);

        System.out.println(usuario.getNombre());
        System.out.println(usuario.getEdad());

        
        usuario.restartMemento(memento);
        System.out.println(usuario.getNombre());
        System.out.println(usuario.getEdad());
    }
}
