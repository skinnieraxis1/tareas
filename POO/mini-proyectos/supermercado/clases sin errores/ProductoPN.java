package supermercado;

public class ProductoPN extends Producto{
    private double cantDescontada;
        
    public ProductoPN(String nombre, double precio, boolean precioCuid){
        super(nombre,precio,precioCuid);
        this.cantDescontada=precio/10;
        this.precio=precio-cantDescontada;
    }
    public boolean tipo(){
        boolean tipo=true;
        return tipo;
    }
    
}
