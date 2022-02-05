package main;

//Sobre esta clase vamos a implementar memento
public class Usuario {
    private String nombre;
    private int edad;

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    //1. Crearemos un nuevo método el cual nos permita obtener una copia de seguridad
    public Usuario getMememnto(){
        //La copia de seguridad puede ser parcial o total
        //En este caso lo haremos de forma total - Estamos sacando una copia de ese preciso momento
        return new Usuario(this.getNombre(), this.getEdad());
    }
    
    
    //Con este método podemos revertir los cambios:
    public void restartMemento(Usuario usuario){
        //Teniendo en cuenta que hicimos una restauración total cambiaremos todos los valores
        this.setNombre(usuario.getNombre());
        this.setEdad(usuario.getEdad());
    }
}
