package supermercado;

public class Producto {
    private String nombre;
    protected double precio;
    private boolean precioCuid;

    public Producto(String nombre, double precio, boolean precioCuid) {
        this.nombre = nombre;
        this.precio = precio;
        this.precioCuid = precioCuid;
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public void mostrarDatos(){
        System.out.println("nombre del producto: "+nombre );
        System.out.println("precio del producto: "+nombre );
        if(precioCuid){
            System.out.println("el producto es parte del programa Precios Cuidados ");
        }
        else{
            System.out.println("el producto no es parte del programa Precios Cuidados");
        }
    }
    public boolean tipo(){
        boolean tipo=false;
        return tipo;
    }
     

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean getPrecioCuid() {
        return precioCuid;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setPrecioCuid(boolean precioCuid) {
        this.precioCuid = precioCuid;
    }
    
}



