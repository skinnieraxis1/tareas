package supermercado;

import java.util.ArrayList;

public class Venta {
    private ArrayList<Producto> productos=new ArrayList();
    private double precioT;
    private String fecha;
  
public Venta( String fecha){
        this.fecha = fecha;
    }
    public void agregarProducto(Producto p){
        productos.add(p);
    }
    public double calcularPrecioT(){
        double pt=0;
        for ( Producto pr: this.productos ){
            pt = pt + pr.getPrecio();
        }
        this.precioT=pt;
        return(pt);
    }
    public int calcularPN(){
        int pn = 0;
        for ( Producto pr: this.productos ){
            if (pr.tipo()){
                pn = pn + 1;
            }
        }
        return pn;
    }
    public int calcularCantCuid(){
        int CantCuid = 0;
        for ( Producto pr: this.productos ){
            if (pr.getPrecioCuid() == true){
                CantCuid = CantCuid + 1;
            }
        }
        return CantCuid;
    }
    public void mostrarProductos(){
        System.out.println("Los productos de esta venta son: ");
        int x = 0;
        for ( Producto pr: this.productos ){
            x++;
            System.out.print(x + ". ");
            pr.mostrarDatos();
            System.out.println("");
        }
        
    }
    public double impTotalDesc(int desc){
        double totalVendidoPN=0.0;
        for ( Producto pr: this.productos ){
            if (pr.tipo()){
               totalVendidoPN += pr.getPrecio();
            }
        }
        double totalConDesc=totalVendidoPN/desc;
        return totalConDesc;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public double getPrecioT() {
        return precioT;
    }

    public String getFecha() {
        return fecha;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void setPrecioT(double precioT) {
        this.precioT = precioT;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
