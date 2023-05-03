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
        return "Vendedor{" + "valorVenta=" + valorVenta + '}';
    }
    
    
}
