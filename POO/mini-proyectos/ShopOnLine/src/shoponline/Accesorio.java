package shoponline;


public class Accesorio extends Producto {
    protected double peso;
    protected String metal;
    
    public Accesorio(String d, double p, double pe, String m){
        super(d, p);
        this.precio = getG(m);
        this.metal = m;
        this.peso = pe;
        
    }
    
    public String toString(){
        String toString = super.toString();
        toString += "(Bijouterie)";
        return toString;
    }
    
    public double getPrecio(){
        double oro = 21584.37;
        double plata = 556.45;
        double acero = 24.3;
        double total = 0;
        if (this.metal.equals("oro")){
            total = oro * this.peso;
        }else if (this.metal.equals("plata")){
            total = plata * this.peso;
        }else if (this.metal.equals("acero")){
            total = acero * this.peso;
        }
        return(total);
    }
    
    public double getG(String m){
        double pr = 0;
        if (m.equals("oro")){
            pr = 21584.37;
        }else if (m.equals("plata")){
            pr = 556.45;
        }else if (m.equals("acero")){
            pr = 24.3;
        }
        return pr;
    }
}
