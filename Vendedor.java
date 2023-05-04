package TpPOO_03;

public class Vendedor extends Empleado{
    private double valorVenta;
    
    public Vendedor(String nombre, byte edad, Sueldo sueldo, double valorVenta){
        super(nombre, edad, sueldo);
        this.valorVenta = valorVenta;
    }
    
    public void comision(){
        double comision =  (2*valorVenta)/100;
        this.getSueldo().setSueldoNeto(this.getSueldo().getSueldoNeto()+comision);
    }

    @Override
    public String toString() {
        super.getSueldo().calcularSueldoNeto(); //se calcula el sueldo neto para este objeto
        comision(); //se actualiza el valor en funcion de la comision de las ventas
        return "Vendedor nombre: "+super.getNombre()+", sueldo: "+super.getSueldo().getSueldoNeto()+", valor de la venta: "+valorVenta;
    }
    
    
}
