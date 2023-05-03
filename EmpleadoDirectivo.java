package TpPOO_03;

public class EmpleadoDirectivo extends Empleado{
    private String categoria;
    private Empleado[] subordinados;
    
    public EmpleadoDirectivo(String nombre, byte edad, Sueldo sueldo, String categoria, Empleado[] subordinados){
        super(nombre, edad, sueldo);
        this.categoria = categoria;
        this.subordinados = subordinados;
    }

    @Override
    public String toString() {
        return "EmpleadoDirectivo{" + "categoria=" + categoria + ", subordinados=" + subordinados + '}';
    }
    
}
