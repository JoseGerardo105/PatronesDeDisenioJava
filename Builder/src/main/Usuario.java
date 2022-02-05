package main;

public class Usuario {

    //Valores necesarios para generar un usuario
    private String nombre;
    private String apellido;

    //Será opcional, pero si es true se habilitan los demás medios de contacto: email, teléfono, dirección
    private boolean medioContacto;
    private String metodoPago;
    private String token;

    //No son obligatorios
    private String email;
    private String telefono;
    private String direccion;

    //Paso 1. Generar un constructor el cual reciba los parámetros de los atributos obligatorios
    //Paso 2. Poner este constructor como privado
    private Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = "";
        this.telefono = "";
        this.direccion = "";
        this.medioContacto = false;
        this.metodoPago = "";
        this.token = "";
    }

    //Paso 3. Generar un método estático que devuelva un objeto de la misma clase
    //Normalmente a este método se le llama make --> Por convensión
    public static Usuario make(String nombre, String apellido) {
        return new Usuario(nombre, apellido);
    }

    //Para asignar los demás valores que no son necesarios nos apoyamos de los getters and setters
    //Principalmente nos vamos a apoyar de los setters
    //Paso 4. Colocar en todos los setters un return this, es decir que retorne el objeto
    public BuilderUsuario setMedioContacto(boolean medioContacto) {
        if (medioContacto == false) {
            throw new IllegalArgumentException("No es posible asignar un valor falso a medio de contacto");
        }
        this.medioContacto = medioContacto;
        return new BuilderUsuario(this);
    }

    //Paso 5. Generar un nuevo método que retorne el objeto final, generalmente se llama build
    public Usuario build() {
        return this;
    }

    public Usuario setMetodoPago(String metodoPago) {
        if (!this.email.equals("") && !this.telefono.equals("") && !this.direccion.equals("")) {
            this.metodoPago = metodoPago;
            return this;
        }
        throw new IllegalArgumentException("No es posible asignar un método de pagp sin los credenciales de medio de contacto");
    }

    public Usuario setToken(String token) {
        if (!this.metodoPago.equals("")) {
            this.token = token;
            return this;
        }
        throw new IllegalArgumentException("No es posible asignar un método de pagp sin los credenciales de medio de contacto");
    }

    @Override
    public String toString() {
        return "\n\nNombre: " + this.nombre + "\nApellido: " + this.apellido + "\nEmail: " + this.email + "\nTeléfono: " + this.telefono + "\nDirección: " + this.direccion+"\nMedio de contacto: "+this.medioContacto+"\nMétodo de pago: "+this.metodoPago+"\nToken: "+token;
    }

//    public Usuario(String nombre, String apellido, String email) {
//        this.nombre = nombre;
//        this.apellido = apellido;
//        this.email = email;
//        this.telefono = "";
//        this.direccion = "";
//    }
//
//    public Usuario(String nombre, String apellido, String email, String telefono) {
//        this.nombre = nombre;
//        this.apellido = apellido;
//        this.email = email;
//        this.telefono = telefono;
//        this.direccion = "";
//    }
//
//    public Usuario(String nombre, String apellido, String email, String telefono, String direccion) {
//        this.nombre = nombre;
//        this.apellido = apellido;
//        this.email = email;
//        this.telefono = telefono;
//        this.direccion = direccion;
//    }
    /*... Si seguimos este esquema en el cual seguimos poniendo nuevos constructores, estamos en 
    un problema construyendo constructores complejos y difíciles de mantener
    El problema es conocido como: Telescoping constructor
    El patrón de diseño builder viene de darle solución a los constructores telescopicos y a 
    la sobre carga de métodos creando objetos complejos de una manera sencilla mediante representaciones
     */
    public static class BuilderUsuario {

        private Usuario usuario;

        public BuilderUsuario(Usuario usuario) {
            this.usuario = usuario;
        }

        public BuilderUsuario setEmail(String email) {
            this.usuario.email = email;
            //Posteriormente debemos retornar nuestro objeto
            return this;
        }

        public BuilderUsuario setTelefono(String telefono) {
            this.usuario.telefono = telefono;
            return this;
        }

        public BuilderUsuario setDireccion(String direccion) {
            this.usuario.direccion = direccion;
            return this;
        }

        public Usuario build() {
            return this.usuario;
        }
    }
}
