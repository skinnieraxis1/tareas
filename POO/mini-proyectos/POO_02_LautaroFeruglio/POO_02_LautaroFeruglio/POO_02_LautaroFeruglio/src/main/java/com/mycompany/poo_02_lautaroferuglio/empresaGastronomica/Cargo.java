package com.mycompany.poo_02_lautaroferuglio.empresaGastronomica;

public class Cargo {
    private String nombre;
    private int sueldo;
    
    public Cargo(String n, int s){
        this.nombre = n;
        this.sueldo = s;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
