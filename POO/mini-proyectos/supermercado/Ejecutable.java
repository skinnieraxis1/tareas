package supermercado;
import java.util.*;
public class Ejecutable {

    public static void main(String[] args) {
        int desc=0;
        String choice="si";
        Scanner key=new Scanner(System.in);
        Super supers=new Super();
        while(choice.equalsIgnoreCase("si")){
            Venta v=crearVenta(desc);
            supers.agregarVenta(v);
            System.out.println("desea agregar otra venta? si/no");
            choice=key.next();
        }
        System.out.println("la cantidad total vendida es: ");
        supers.calcularTotal();
        System.out.println("la cantidad total de productos de primera necesidad es: ");
        System.out.println(supers.getCantPrimeraNecesidad());
        System.out.println("de que fecha desea ver la cantidad de productos con precios cuidados vendidos ");
        String fecha=key.next();
        supers.calcCuidFecha(fecha);
        supers.totalDesc(desc);
    }
    public static Venta crearVenta(int desc){
        Scanner t = new Scanner(System.in);
        System.out.println("cual es la fecha de la venta? ");
        String fecha=t.nextLine();
        t.close();
        Venta venta=new Venta(fecha);
        String choice="si";
        Scanner d = new Scanner(System.in);
        while(choice.equalsIgnoreCase("si")){
            Producto p=crearProducto(desc);
            venta.agregarProducto(p);
            System.out.println("desea agregar otro producto? si/no");
            choice=d.next();
        }
        return venta;
    }
//    public static ArrayList<Producto> crearProductos(){
//        Scanner key=new Scanner(System.in);
//        System.out.println("cuantas productos hubo en esta venta? ");
//        int cant= key.nextInt();
//        ArrayList<Producto> productos=new ArrayList();
//        for (int i = 0; i < cant; i++) {
//            Producto p=crearProducto();
//            productos.add(p);
//        }
//        return productos;
//    }
    public static Producto crearProducto(int desc){
        
        Scanner key=new Scanner(System.in);
        Producto p=null;
        System.out.println("nombre del producto? ");
        String nombre=key.next();
        System.out.println("precio del producto? ");
        double precio=key.nextDouble();
        System.out.println("el producto es parte del programa Precios Cuidados? si/no");
        String cuid=key.next();
        boolean precioCuid=false;
        if(cuid.equalsIgnoreCase("si")){
            precioCuid=true;
        }
         else if (cuid.equalsIgnoreCase("no")){
            precioCuid=false;
        }
        System.out.println("es un producto de primera necesidad? si/no");
        String PN=key.next();
        if(PN.equalsIgnoreCase("no")){
            p=new Producto(nombre,precio,precioCuid);
        }
        else if (PN.equalsIgnoreCase("si")){
            System.out.println("cual es el porcentaje de descuento? ");
            desc=key.nextInt();
            p=new ProductoPN(nombre,precio,precioCuid,desc);
        }
        return p;
    }

   
       
}
