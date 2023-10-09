//Hossein

// Definición del paquete y nombre de la clase
package poo_grupal_breakfast;

// Declaración de la clase Empleado que hereda de la clase Persona
public class Empleado extends Persona {
    // Atributos de la clase Empleado
    private double sueldo;
    
    // Constructor de la clase Empleado
    public Empleado(String nombre, int numeroTel, double sueldo) {
        // Llamada al constructor de la clase padre (Persona)
        super(nombre, numeroTel);
        
        // Asignación del sueldo al atributo sueldo
        this.sueldo = sueldo;
    }
    
    // Método para mostrar los datos del empleado
    public void mostrarDatos() {
        // Llamada al método mostrarDatos() de la clase padre (Persona)
        super.mostrarDatos();
        
        // Impresión del sueldo del empleado
        System.out.println("\nSueldo: " + this.sueldo);
    }
}







