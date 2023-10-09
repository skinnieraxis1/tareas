package poo_grupal_03.pkg05;


public class Directivo extends Empleado{
    private Empleado[] empleados;
    private String categoria;
    
    public Directivo(String n, int e, double sB, Empleado[] em, String cat){
        super(n, e, sB);
        this.empleados = em;
        this.categoria = cat;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public void mostrarDatos(){
       
        System.out.println("El Directivo se llama " + super.getNombre() + " y tiene " + super.getEdad() + " años, su sueldo neto es de " + super.getSueldo().calcularSN() + " este es un directivo y tiene a cargo a ");
        
    }
    
    public void mostrarEmpleados(){
        for(int i = 0; i<this.empleados.length; i++){
            this.empleados[i].mostrarDatos();
        }
    }
    
}
