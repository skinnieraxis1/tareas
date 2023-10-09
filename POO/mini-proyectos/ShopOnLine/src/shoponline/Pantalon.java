package shoponline;


public class Pantalon extends Producto {
    protected int talle;
    protected String modelo;
    
    public Pantalon(String d, double p, int t, String m){
        super(d, p);
        this.talle = t;
        this.modelo = m;
    }
    
    public String toString(){
        String toString = super.toString();
        toString += "(talle:"+this.talle+")";
        return toString;
    }
    
    public double getPrecio(){
        int acum = 0;
        if (this.modelo.equals("Oxford") || this.modelo.equals("Recto")){
            acum = 15;
        }else if(this.modelo.equals("Skinny")){
            acum = 25;
        }
        double total = super.precio / 100 * acum;
        return total;
    }
}
