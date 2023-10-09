package supermercado;

public class ProductoPN extends Producto{
    private double cantDescontada;
    private int desc;
        
    public ProductoPN(String nombre, double precio, boolean precioCuid, int desc){
        super(nombre,precio,precioCuid);
        this.desc=desc;
        this.cantDescontada=precio/this.desc;
        this.precio=precio-cantDescontada;
    }
    public boolean tipo(){
        boolean tipo=true;
        return tipo;
    }

    public double getCantDescontada() {
        return cantDescontada;
    }

    public void setCantDescontada(double cantDescontada) {
        this.cantDescontada = cantDescontada;
    }
    
    
}
