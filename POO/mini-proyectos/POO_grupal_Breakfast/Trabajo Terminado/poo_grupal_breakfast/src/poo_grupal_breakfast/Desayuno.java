//Lautaro

// Definición del paquete y nombre de la clase
package poo_grupal_breakfast;
import java.util.*;

// Declaración de la clase Desayuno
public class Desayuno {
    // Atributos de la clase Desayuno
    private ArrayList<Ingrediente> ingredientes = new ArrayList();
    private String nombre;
    
    // Constructor de la clase Desayuno
    public Desayuno(String n, ArrayList<Ingrediente> i) {
        this.nombre = n;
        this.ingredientes = i;
    }
    
    // Método para mostrar los datos del desayuno
    public void mostrarDatos() {
        System.out.println("El nombre del desayuno es " + this.nombre + " y contiene: ");
        int x = 0;
        
        // Recorriendo el ArrayList ingredientes se muestran los datos de cada ingrediente
        for (Ingrediente i : this.ingredientes) {
            x++;
            System.out.print(x + "°: ");
            i.mostrarDatos();
            System.out.println("");
        }
        System.out.println("");
    }
    
    // Método para calcular el precio total del desayuno
    public double calcularPrecioT() {
        double precio = 0;
        
        // Se suman los precios de todos los ingredientes del desayuno
        for (Ingrediente i : this.ingredientes) {
            precio = precio + i.getPrecio();
        }
        
        return precio;
    }

    // Métodos getter y setter para los atributos ingredientes y nombre
    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}










