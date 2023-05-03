package TpPOO_03;

/**
 *
 * @author ET36
 */
public class Empleado extends Persona{
    
    
    private Sueldo sueldo;
    public Empleado(String n, byte e, Sueldo sueldo)    {
        super(n,e);
        
        this.sueldo= sueldo;
        
    }

    @Override
    public String toString() {
        return "Empleado{" + "sueldo=" + sueldo + '}';
    }
    
    
    
}
