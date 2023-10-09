/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_grupal_03.pkg05;

/**
 *
 * @author CS-13
 */
public class Empleado extends Persona{
    
    private Sueldo sueldo;
    
    public Empleado(String n, int e, double sB){
    
        super(n, e);
        
        Sueldo s = new Sueldo(sB);
        
        this.sueldo = s;
        
    }
    
    public void mostrarDatos(){
        
        System.out.println("El empleado se llama " + super.getNombre() + " y tiene " + super.getEdad() + " años, su sueldo neto es de " + this.sueldo.calcularSN());
        
    }

    public Sueldo getSueldo() {
        return sueldo;
    }

    public void setSueldo(Sueldo sueldo) {
        this.sueldo = sueldo;
    }
    
}
