package TpPOO_03;

public class Vendedor extends Empleado{
    private double valorVenta;
    
    public Vendedor(String n, byte e, Sueldo sueldo, double valorVenta){
        super(n, e, sueldo);
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
