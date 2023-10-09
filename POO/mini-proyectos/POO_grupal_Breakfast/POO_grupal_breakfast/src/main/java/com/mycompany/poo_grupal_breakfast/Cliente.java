//Hosein

package com.mycompany.poo_grupal_breakfast;

public class Cliente extends Persona{
    private int cantDesayunos;
    
  
    public Cliente(String nombre,int numeroTel, int cantDesayunos){
        super(nombre,numeroTel);
        this.cantDesayunos=cantDesayunos;
    }
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("\nCantidad de desayunos: "+ this.cantDesayunos);
    }
    
}


