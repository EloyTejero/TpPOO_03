/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TpPOO_03;

/**
 *
 * @author ET36
 */
public class Cliente extends Persona{
    private String telefono;

    public Cliente(String telefono, String nombre, int edad) {
        super(nombre, edad);
        this.telefono = telefono;
    }

    @Override
    public void mostrarDatos() {
         System.out.println( "Persona " + " nombre = " + super.getNombre() + ", edad= " + super.getEdad() + " telefono " + telefono);
    }

   
    
} 
