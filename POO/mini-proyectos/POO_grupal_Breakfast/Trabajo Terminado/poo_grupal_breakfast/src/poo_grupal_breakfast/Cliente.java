//Hossein

// Definición del paquete y nombre de la clase
package poo_grupal_breakfast;

// Declaración de la clase Cliente que hereda de la clase Persona
public class Cliente extends Persona {
    // Atributos de la clase Cliente
    private int cantDesayunos;
    
    // Constructor de la clase Cliente
    public Cliente(String nombre, int numeroTel) {
        // Llamada al constructor de la clase padre (Persona)
        super(nombre, numeroTel);
        
        // Inicialización del atributo cantDesayunos a 0
        this.cantDesayunos = 0;
    }
    
    // Método para mostrar los datos del cliente
    public void mostrarDatos() {
        // Llamada al método mostrarDatos() de la clase padre (Persona)
        super.mostrarDatos();
        
        // Impresión de la cantidad de desayunos del cliente
        System.out.println("Cantidad de desayunos: " + this.cantDesayunos);
    }

    // Métodos getter y setter para el atributo cantDesayunos
    public int getCantDesayunos() {
        return cantDesayunos;
    }

    public void setCantDesayunos(int cantDesayunos) {
        this.cantDesayunos = cantDesayunos;
    }
}


