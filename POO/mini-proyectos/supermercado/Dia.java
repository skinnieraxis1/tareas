/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

import java.util.ArrayList;

/**
 *
 * @author CS-03
 */
public class Dia {
    private ArrayList<Venta> ventas;
    private int cantPrimeraNecesidad;
    private int cantCuidados;
    private Fecha fecha;

    public Dia(ArrayList<Venta> ventas, int cantPrimeraNecesidad, int cantCuidados, Fecha fecha) {
        this.ventas = ventas;
        this.cantPrimeraNecesidad = cantPrimeraNecesidad;
        this.cantCuidados = cantCuidados;
        this.fecha = fecha;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    public int getCantPrimeraNecesidad() {
        return cantPrimeraNecesidad;
    }

    public void setCantPrimeraNecesidad(int cantPrimeraNecesidad) {
        this.cantPrimeraNecesidad = cantPrimeraNecesidad;
    }

    public int getCantCuidados() {
        return cantCuidados;
    }

    public void setCantCuidados(int cantCuidados) {
        this.cantCuidados = cantCuidados;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    
    public void mostrarDatos(){
        for(Dia d:ventas){
            d.mostrarDatos();
        }
        System.out.println("la cantidad de productos de primera necesidad es: "+this.cantPrimeraNecesidad+"\n"+"y su cantidad de productos con precio cuidado es de: "+this.cantCuidados+"\n"+"estos datos son de el dia: "+this.fecha.mostrarDatos());
        
    }
    
}
