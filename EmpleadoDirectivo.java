package TpPOO_03;

public class EmpleadoDirectivo extends Empleado{
    private String categoria;
    private Empleado[] subordinados;
    
    public EmpleadoDirectivo(String n, byte e, Sueldo sueldo, String categoria, Empleado[] subordinados){
        super(n, e, sueldo);
        this.categoria = categoria;
        this.subordinados = subordinados;
    }

    @Override
    public String toString() {
        return "EmpleadoDirectivo{" + "categoria=" + categoria + ", subordinados=" + subordinados + '}';
    }
    
}
