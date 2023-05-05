package TpPOO_03;

public abstract class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    
    public String toString() {
        return "Persona " + " nombre = " + nombre + ", edad= " + edad + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    

}
