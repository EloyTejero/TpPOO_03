package TpPOO_03;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Empresa empresa = llenarEmpresa();
        
    }

    public static Empresa llenarEmpresa() {
        
        Cliente clientes[] = llenarClientes();
        Empleado empleados[] = llenarEmpleados();
        
        Empresa e = new Empresa(empleados, clientes);
        
        return e;
    }

    public static Cliente[] llenarClientes() {
        Cliente c[];
        int cant = 0;
        System.out.println("Cuantos clientes desea digitar");
        cant = in.nextInt();
        c = new Cliente[cant];

        for (int i = 0; i < cant; i++) {

            System.out.println("Digite un nombre");
            String nombre = in.next();
            System.out.println("Digite la edad");
            int edad = in.nextInt();
            System.out.println("Digite el telefono");
            String telefono = in.next();

            c[i] = new Cliente(telefono, nombre, edad);
        }
        
        return c;
    }

    public static Empleado[] llenarEmpleados() {
        
        int cant = 0;
        System.out.println("Cuantos empleados desea digitar");
        cant = in.nextInt();
        Empleado[] e = new Empleado[cant];

        for (int i = 0; i < cant; i++) {
            System.out.println("que tipo de empleado desea, d (directivo ),v (vendedor)");
            String opc = in.next();
            switch (opc) {
                case "d": e[i] = cargarDirectivo();
                case "v": e[i] = cargarVendedor();
            }

        }
        return e;
    }
    
    public static Vendedor cargarVendedor() {
        Empleado empleados[];
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
        String categoria = in.next();

        System.out.println("cuantos empleados subordinados");
        int cantEmpleados = in.nextInt();
        empleados = new Empleado[cantEmpleados];

        for (int i = 0; i < cantEmpleados; i++) {
            System.out.println("digite su nombre");
            String nombre = in.nextLine();
            System.out.println("digite su edad");
            byte edad = in.nextByte();
            Sueldo s = cargarSueldo();            
            empleados[i] = new Empleado(nombre, edad, s);
        }

        return new EmpleadoDirectivo(nombreDirectivo, edadDirectivo, sueldoDirectivo, categoria, empleados);
        
    }

    public static Sueldo cargarSueldo() {
        System.out.println("digite obra social");
        double obraSocial = in.nextDouble();
        System.out.println("digite jubilacion");
        double jubilacion = in.nextDouble();
        System.out.println("digite presentismo");
        double presentismo = in.nextDouble();
        System.out.println("digite sueldo bruto");
        double sueldoBruto = in.nextDouble();
        System.out.println("digite sueldo neto");
        
        return new Sueldo(obraSocial, jubilacion, presentismo, sueldoBruto);
    }

}
