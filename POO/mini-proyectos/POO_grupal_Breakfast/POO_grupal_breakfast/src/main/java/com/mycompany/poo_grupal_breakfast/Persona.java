/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo_grupal_breakfast;

/**
 *
 * @author CS-04
 */
//Renzo
public class Persona {
    private String nombre;
    private int numeroTel;
    public Persona(String nombre, int numeroTel){
        this.nombre=nombre;
        this.numeroTel=numeroTel;
    }

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
    public void mostrarDatos(){
        System.out.println("Nombre: "+this.nombre+"\n"+"telefono: "+this.numeroTel);
    }
}
