package TpPOO_03;


public class Sueldo {
    double obraSocial;
    double jubilacion;
    double presentismo;
    double sueldoBruto;
    double sueldoNeto;

    public Sueldo(double obraSocial, double jubilacion, double presentismo, double sueldoBruto) {
        this.obraSocial = obraSocial;
        this.jubilacion = jubilacion;
        this.presentismo = presentismo;
        this.sueldoBruto = sueldoBruto;
    }
    
    public double calcularSueldoNeto(){
        sueldoNeto = sueldoBruto-((sueldoBruto*obraSocial)/100);
        sueldoNeto -= ((sueldoBruto*jubilacion)/100);
        sueldoNeto += ((sueldoBruto*presentismo)/100);

        return sueldoNeto;
    }
    
    public void setSueldoNeto(double sueldoNeto) {
        this.sueldoNeto = sueldoNeto;
    }

    public double getSueldoNeto() {
        return sueldoNeto;
    }
    
    
    public void mostrarDatos() {
        System.out.println("Sueldo{" + "obraSocial=" + obraSocial + ", jubilacion=" + jubilacion + ", presentismo=" + presentismo + ", sueldoBruto=" + sueldoBruto + ", sueldoNeto=" + sueldoNeto + '}');
    }
    
    
    
}
