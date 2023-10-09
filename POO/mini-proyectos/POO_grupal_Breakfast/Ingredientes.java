/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo_grupal_breakfast;
//Montenegro
/**
 *
 * @author CS-04
 */
public class Ingredientes {
    private String nombre;
    private double precio;
    
    public Ingredientes(String n, double p){
        this.nombre = n;
        this.precio = p;
    }
    
    public void mostrarDatos(){
        System.out.println("Este ingrediente se llama: " + this.nombre + " y su precio es de: " + this.precio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }
    
}
