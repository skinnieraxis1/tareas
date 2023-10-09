package supermercado;

import java.util.ArrayList;

public class Super {
    private ArrayList<Venta> ventas=new ArrayList();
    private int cantPrimeraNecesidad;
    private int cantCuidados;

    public Super() {
        this.ventas = ventas;
        this.cantPrimeraNecesidad = calcPN(ventas);
        this.cantCuidados = calcCuid(ventas);
    }
    
    public void agregarVenta(Venta v){
        ventas.add(v);
    }
    public void mostrarDatos(){
        for(Venta d:ventas){
            d.mostrarProductos();
        }
        System.out.println("la cantidad de productos de primera necesidad es: "+this.cantPrimeraNecesidad+"\n"+"y su cantidad de productos con precio cuidado es de: "+this.cantCuidados+"\n"+"estos datos son de el dia: ");
        
        
    }
    
    public int calcCuid(ArrayList<Venta> ventas){
        int cantCuid=0;
        for(Venta v:ventas){
            cantCuid+=v.calcularCantCuid();
        }
        return cantCuid;
    }
    
    public  int calcPN(ArrayList<Venta> ventas){
        int cantPN=0;
        for(Venta v:ventas){
            cantPN+=v.calcularPN();
        }
        return cantPN;
    }
    
    public double calcularTotal(){
        double total=0.0;
        for(Venta v:ventas){
            total+=v.calcularPrecioT();
        }
        return total;
    }
    public double totalDesc(int desc){
    }
    
    public int calcCuidFecha(String fecha){
        int cantCuid=0;
        for(Venta v:ventas){
            if(v.getFecha().equalsIgnoreCase(fecha)){
            cantCuid+=v.calcularCantCuid();
            }
        }
        return cantCuid;
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
    
}
