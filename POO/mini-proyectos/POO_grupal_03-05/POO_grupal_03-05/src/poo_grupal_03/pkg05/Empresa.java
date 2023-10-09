
package poo_grupal_03.pkg05;

public class Empresa {
    
    private String nombre;
    private Empleado[] empleados;
    private Cliente[] clientes;
    private Directivo[] directivos;
    
    public Empresa(String n, Empleado[] e, Cliente[] c, Directivo[] d){
        this.nombre = n;
        this.empleados = e;
        this.clientes = c;
        this.directivos = d;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public Directivo[] getDirectivos() {
        return directivos;
    }

    public void setDirectivos(Directivo[] directivos) {
        this.directivos = directivos;
    }
    
    public void mostrarClientesEmpresa(){
    
        for(int i = 0; i <= this.clientes.length; i++){
            System.out.println("A continuacion los clientes: ");
            this.clientes[i].mostrarDatos();
        }
        
    }
    
    public void mostrarDirectivosEmpresa(){
    
        for(int i = 0; i <= this.directivos.length; i++){
            System.out.println("A continuacion los directivos: ");
            this.directivos[i].mostrarDatos();
        }
        
    }
    
    public void mostrarEmpleadosEmpresa(){
    
        for(int i = 0; i <= this.empleados.length; i++){
            System.out.println("A continuacion los empleados: ");
            this.empleados[i].mostrarDatos();
        }
        
    }
    
}
