package TpPOO_03;

/**
 *
 * @author ET36
 */
public class Empleado extends Persona{
    private Sueldo sueldo;
    
    public Empleado(String nombre, byte edad, Sueldo sueldo)    {
        super(nombre,edad);
        
        this.sueldo= sueldo;
        
    }

    @Override
    public String toString() {
        return "Empleado{" + "sueldo=" + sueldo + '}';
    }

    public Sueldo getSueldo() {
        return sueldo;
    }
    
}
