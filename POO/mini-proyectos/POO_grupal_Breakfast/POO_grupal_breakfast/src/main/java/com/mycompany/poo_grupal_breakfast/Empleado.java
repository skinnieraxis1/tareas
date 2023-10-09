//Hosein
package com.mycompany.poo_grupal_breakfast;

public class Empleado extends Persona{
    private double sueldo;
    
  
    public Empleado(String nombre,int numeroTel, double sueldo){
        super(nombre,numeroTel);
        this.sueldo=sueldo;
    }
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("\nSueldo: "+ this.sueldo);
    }
    
}

