package TpPOO_03;

public class EmpleadoDirectivo extends Empleado{
    private String categoria;
    private Empleado[] subordinados;
    
    public EmpleadoDirectivo(String nombre, byte edad, Sueldo sueldo, String categoria, Empleado[] subordinados){
        super(nombre, edad, sueldo);
        this.categoria = categoria;
        this.subordinados = subordinados;
        super.getSueldo().calcularSueldoNeto(); //se calcula el sueldo neto para este objeto
        comision(); //se actualiza el valor en funcion de la comision de las ventas de los vendedores que sean subordinados
    }
    
    public void comision(){
        for(Empleado e: subordinados){
            if((e.getClass().getName()).equals("TpPOO_03.Vendedor")){
                double comision =  (3*(((Vendedor)e).getValorVenta()))/100;
                this.getSueldo().setSueldoNeto(this.getSueldo().getSueldoNeto()+comision);
            }
        }
    }
    
    @Override
    public String toString() {
        return "EmpleadoDirectivo nombre: "+super.getNombre()+", categoria: "+categoria+", sueldo: "+super.getSueldo().getSueldoNeto()+", cantidad de subordinados: "+subordinados.length; //para mostrar cada empleado requiere recorrer el array, para practicidad del ejercicio solo dejamos el numero de subordinados para no cambiar la funcion de mostrar datos del main
    }
    
}
