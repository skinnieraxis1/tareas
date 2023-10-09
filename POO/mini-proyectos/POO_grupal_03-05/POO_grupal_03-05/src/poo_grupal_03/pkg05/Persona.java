
package poo_grupal_03.pkg05;

import java.util.Scanner;


public class Persona {
    private String nombre;
    private int edad;
    
    public Persona(String n, int e){
        this.nombre = n;
        this.edad = e;
    }
    
    public void mostrarDatos(){
        System.out.println("La persona se llama " + this.nombre + " y tiene " + this.edad + " años");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    Scanner toint() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
