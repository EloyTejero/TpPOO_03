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
        sueldo.calcularSueldoNeto(); //se calcula el sueldo neto para este objeto
    }
    
    @Override
    public String toString() {
        return "Empleado"+super.getNombre()+"{" + "sueldoNeto = " + sueldo.getSueldoNeto() + '}';
    }
    
    public Sueldo getSueldo() {
        return sueldo;
    }
    
}
