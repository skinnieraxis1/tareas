//Renzo

// Definición del paquete y nombre de la clase
package poo_grupal_breakfast;

// Declaración de la clase Persona
public class Persona {
    // Atributos de la clase Persona
    private String nombre;
    private int numeroTel;
    
    // Constructor de la clase Persona
    public Persona(String nombre, int numeroTel){
        this.nombre = nombre;
        this.numeroTel = numeroTel;
    }

    // Métodos getter y setter para los atributos nombre y numeroTel
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(int numeroTel) {
        this.numeroTel = numeroTel;
    }
    
    // Método para mostrar los datos de la persona
    public void mostrarDatos(){
        System.out.println("Nombre: " + this.nombre + "\n" + "Teléfono: " + this.numeroTel);
    }
}


