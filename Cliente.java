package TpPOO_03;

public class Cliente extends Persona{
    private String telefono;

    public Cliente(String telefono, String nombre, int edad) {
        super(nombre, edad);
        this.telefono = telefono;
    }

    @Override
    public void mostrarDatos() {
         System.out.println("Cliente nombre = "+super.getNombre()+", edad= "+super.getEdad()+" telefono " + telefono);
    }
    
} 
