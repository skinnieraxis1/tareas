package supermercado;

import java.util.ArrayList;

public class Venta {
    private ArrayList<Producto> productos;
    private double precioT;
    private Hora hora;
  /* Venta NO debería recibir la lista de productos, sino que debería poder agregar productos a la lista
     para lo que también faltaría el método agregarProducto(Producto p) */
  
public Venta(ArrayList<Producto> p, Hora hora){
        this.productos = p;
        this.hora = hora;
        double pt=0;
        for ( Producto pr: p ){
            pt = pt + pr.getPrecio();
        }
        this.precioT = pt;
    }
    
    public double calcularPrecioT(){
        double pt=0;
        for ( Producto pr: this.productos ){
            pt = pt + pr.getPrecio();
        }
        return(pt);
    }
    public int calcularPN(){
        int pn = 0;
        for ( Producto pr: this.productos ){
            if (pr.tipoPN() == true){
                pn = pn + 1;
            }
        }
        return pn;
    }
    public int calcularCantCuid(){
        int CantCuid = 0;
        for ( Producto pr: this.productos ){
            if (pr.tipoCuid() == true){
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
    
}
