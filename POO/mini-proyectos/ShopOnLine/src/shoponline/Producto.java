
package shoponline;
import javax.swing.JOptionPane;


public abstract class Producto {
    protected String desc;
    protected int codigo;
    protected double precio;
    
    public Producto(String d, double p){
        
        this.desc = d;
        this.precio = p;
        
    }
    
    public String toString(){
        String toString = this.desc +"........ $ " + this.precio;
        return toString;
    }
    
    public abstract double getPrecio();
}
