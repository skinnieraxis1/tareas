package com.mycompany.poo_02_lautaroferuglio.empresaGastronomica;

public class Empleado {
    private String nombre;
    private int CUIT;
    private String genero;
    private Direccion direccion;
    private String telefono;
    private int cantHijos;
    private Cargo cargo;
    private double sueldoNeto;
    
    public Empleado(String n, int cu, String g, Direccion d, String t, int cantH, Cargo c) {
    
        this.nombre = n;
        this.CUIT = cu;
        this.genero = g;
        this.direccion = d;
        this.telefono = t;
        this.cantHijos = cantH;
        this.cargo = c;
        
        double sueldoN = cargo.getSueldo();
        sueldoN = sueldoN - ((sueldoN * 4)/100);
        
        sueldoN = sueldoN + (11465 * cantH);
        
        String genMin = g.toLowerCase();
        
        String carN = c.getNombre();
        
        if (genMin.equals("hombre") || genMin.equals("h")){
            if (carN.equals("repostero")){
                sueldoN = sueldoN + ((sueldoN * 10)/100);
            }else{
                sueldoN = sueldoN + ((sueldoN * 2)/100);
            }
        }
        
        this.sueldoNeto = sueldoN;
    
    }
}
