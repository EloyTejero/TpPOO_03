package TpPOO_03;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Empresa empresa = llenarEmpresa();
        menuMostrarDatos(empresa);
    }
    
    public static void menuMostrarDatos(Empresa empresa){
        boolean terminado = true;
        int opc;
        
        do{
            System.out.println("\nIngrese opcion: 1.Mostrar de clientes, 2.Mostrar datos de empleados, 3.Salir");
            opc = in.nextInt();
            in.nextLine();
            
            switch(opc){
                case 1: mostrarDatos(empresa.getClientes());
                        break;
                case 2: mostrarDatos(empresa.getEmpleados());
                        break;
                case 3: terminado = false;
            }
        }while(terminado);
    }
    
    public static void mostrarDatos(Persona persona[]){
        for (Persona p : persona) {
            System.out.println(p.toString());
        }
    }
    
    public static Empresa llenarEmpresa() {
        
        Cliente clientes[] = llenarClientes();
        Empleado empleados[] = llenarEmpleados();
        
        Empresa e = new Empresa(empleados, clientes);
        
        return e;
    }

    public static Cliente[] llenarClientes() {
        Cliente c[];
        int cant;
        System.out.println("Cuantos clientes desea digitar");
        cant = in.nextInt();
        in.nextLine();
        c = new Cliente[cant];

        for (int i = 0; i < cant; i++) {

            System.out.println("Digite un nombre");
            String nombre = in.next();
            System.out.println("Digite la edad");
            int edad = in.nextInt();
            in.nextLine();
            System.out.println("Digite el telefono");
            String telefono = in.next();

            c[i] = new Cliente(telefono, nombre, edad);
        }
        
        return c;
    }

    public static Empleado[] llenarEmpleados() {
        
        int cant;
        System.out.println("Cuantos empleados desea digitar");
        cant = in.nextInt();
        in.nextLine();
        Empleado[] e = new Empleado[cant];

        for (int i = 0; i < cant; i++) {
            System.out.println("que tipo de empleado desea, d (directivo),v (vendedor)");
            String opc = in.next();
            switch (opc) {
                case "d": e[i] = cargarDirectivo(); break;
                case "v": e[i] = cargarVendedor(); break;
            }

        }
        return e;
    }
    
    public static Vendedor cargarVendedor() {
        System.out.println("digite su nombre");
        String nombreDirectivo = in.next();
        System.out.println("digite su edad");
        byte edadDirectivo = in.nextByte();
        Sueldo sueldoDirectivo = cargarSueldo();
        System.out.println("digite valor de venta ");
        double valorVenta = in.nextDouble();

        return new Vendedor(nombreDirectivo, edadDirectivo, sueldoDirectivo, valorVenta);
        
    }

    public static EmpleadoDirectivo cargarDirectivo() {
        Empleado empleados[];
        System.out.println("digite su nombre");
        String nombreDirectivo = in.next();
        System.out.println("digite su edad");
        byte edadDirectivo = in.nextByte();
        Sueldo sueldoDirectivo = cargarSueldo();
        System.out.println("que categoria es ");
        in.nextLine();
        String categoria = in.nextLine();

        System.out.println("cuantos empleados subordinados");
        int cantEmpleados = in.nextInt();
        in.nextLine();
        empleados = new Empleado[cantEmpleados];

        for (int i = 0; i < cantEmpleados; i++) {
            System.out.println("que tipo de subordinado ingresara, e (empleado comun),v (vendedor)");
            String opc = in.next();
            switch (opc) {
                case "e": empleados[i] = cargarEmpleado(); break;
                case "v": empleados[i] = cargarVendedor(); break;
            }
        }

        return new EmpleadoDirectivo(nombreDirectivo, edadDirectivo, sueldoDirectivo, categoria, empleados);
    }

    public static Empleado cargarEmpleado(){
        System.out.println("digite su nombre");
        String nombre = in.nextLine();
        System.out.println("digite su edad");
        byte edad = in.nextByte();
        Sueldo s = cargarSueldo();
        return new Empleado(nombre, edad, s);
    }
    
    public static Sueldo cargarSueldo() {
        System.out.println("digite % de obra social");
        double obraSocial = in.nextDouble();
        System.out.println("digite % de jubilacion");
        double jubilacion = in.nextDouble();
        System.out.println("digite % de  presentismo");
        double presentismo = in.nextDouble();
        System.out.println("digite sueldo bruto");
        double sueldoBruto = in.nextDouble();
        
        return new Sueldo(obraSocial, jubilacion, presentismo, sueldoBruto);
    }

}
