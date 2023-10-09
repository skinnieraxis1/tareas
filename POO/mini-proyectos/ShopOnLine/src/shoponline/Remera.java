package shoponline;

public class Remera extends Producto {
    protected char talle;
    
    public Remera(String d, double p, char t){
        super(d, p);
        this.talle = t;
    }
    
    public String toString(){
        String toString = super.toString();
        toString += "(talle:"+this.talle+")";
        return toString;
    }
    
    public double getPrecio(){
        int acum = 0;
        char[] talles = {'S', 'M', 'L', 'X'};
        for (int i = 0; i < talles.length; i++){
            if(this.talle != talles[i]){
                acum+=5;
            }else{
                acum+=5;
                break;
            }
        }
        double total = super.precio / 100 * acum;
        return total;
    }
    
}
