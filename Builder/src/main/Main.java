package main;

/*
Builder: Separa la construcción de objetos complejos de su representación
para que el mismo proceso de construcción pueda crear representaciones diferentes
 */
public class Main {
    
    public static void main(String[] args) {
        //Si únicamente queremos un objeto con los 2 parámetros obligatorios ponemos build()
        Usuario jose = Usuario.make("Jose", "Gomez").build();
        System.out.println(jose);

        //Ahora, si queremos hacer que la construcción sea un poco mas compleja ponemos los setters
        Usuario juan = Usuario.make("Juan", "Alba").setMedioContacto(true).setDireccion("Colombia").setEmail("juan@mail.com").setTelefono("31212121").build().setMetodoPago("Tarjeta de crédito").setToken("7812812").build();
        System.out.println(juan);
    }
}
