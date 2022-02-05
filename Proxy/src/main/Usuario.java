package main;

public class Usuario {
    /*
    Nivel permiso 1--5 --> 5 == Administrador
    */
    private int nivelPermiso;

    public Usuario(int nivelPermiso) {
        this.nivelPermiso = nivelPermiso;
    }

    public int getNivelPermiso() {
        return nivelPermiso;
    }

    public void setNivelPermiso(int nivelPermiso) {
        this.nivelPermiso = nivelPermiso;
    }
}
