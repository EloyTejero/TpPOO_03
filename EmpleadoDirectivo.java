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
        super.getSueldo().calcularSueldoNeto(); //se calcula el sueldo neto para este objeto
        return "EmpleadoDirectivo nombre: "+super.getNombre()+", categoria: "+categoria+", sueldo: "+super.getSueldo().getSueldoNeto()+", cantidad de subordinados: "+subordinados.length; //para mostrar cada empleado requiere recorrer el array, para practicidad del ejercicio solo dejamos el numero de subordinados para no cambiar la funcion de mostrar datos del main
    }
    
}
