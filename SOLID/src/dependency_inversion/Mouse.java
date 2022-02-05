package dependency_inversion;

/*
Inversión de dependenci: Las entidades deben depender de abstracciones y no de concreciones
Un módulo de alto nivel no debe depender de uno de bajo nivel, sino de abstracciones
 */
//Entidad de bajo nivel
public class Mouse implements IMouse{

    @Override
    public void conectar() {
        System.out.println("Conexión mouse vía USB");
    }
}
