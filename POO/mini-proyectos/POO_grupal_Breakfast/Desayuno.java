
package poo_grupal_breakfast;

import java.util.ArrayList;

public class Desayuno {
    private ArrayList<Ingrediente> ingredientes;
    private String nombre;
    
    public Desayuno(ArrayList<Ingrediente> i, String n){
        this.nombre = n;
        this.ingredientes = i;
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre del desayuno es " + this.nombre + " y contiene: ");
        int x = 0;
        for(Ingrediente i : this.ingredientes){
            x++;
            System.out.println(x + "°: " + i);
        }
    }
    
    public double calcularPrecioT(){
        double precio = 0;
        for(Ingrediente i : this.ingredientes){
            precio = precio + i.getPrecio();
        }
        return precio;
    }

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



