package TpPOO_03;

public class Empresa {
    private Empleado[] empleados;
    private Cliente[] clientes;

    public Empresa(Empleado[] empleados, Cliente[] clientes) {
        this.empleados = empleados;
        this.clientes = clientes;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public Cliente[] getClientes() {
        return clientes;
    }
    
}
