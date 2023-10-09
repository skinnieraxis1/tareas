//Montenegro

// Definición del paquete y nombre de la clase
package poo_grupal_breakfast;

// Declaración de la clase Ingrediente
public class Ingrediente {
    // Atributos de la clase Ingrediente
    private String nombre;
    private double precio;
    
    // Constructor de la clase Ingrediente
    public Ingrediente(String n, double p) {
        this.nombre = n;
        this.precio = p;
    }
    
    // Método para mostrar los datos del ingrediente
    public void mostrarDatos() {
        System.out.print(this.nombre + " y su precio es de: " + this.precio);
    }

    // Métodos getter y setter para los atributos nombre y precio
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }    
}
