package poo_grupal_03.pkg05;

import java.util.Scanner;

public class Cliente extends Persona{
    private int telefono;

    public Cliente(String n, int e, int t) {
        super(n, e);
        this.telefono=t;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int t) {
        this.telefono = t;
    }
    
    public void mostrarDatos(){
        
        System.out.println("El Cliente se llama " + super.getNombre() + " y tiene " + super.getEdad() + " años, su telefono es " + this.telefono);
        
        
    }
    
    

}





