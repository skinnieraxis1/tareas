

package poo_grupal_breakfast;
import java.util.*;

public class Ejecutable {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        
        // Creación de empleados
        Empleado per1 = new Empleado("Alicia", 1140976059, 95000.00);
        Empleado per2 = new Empleado("Pedro", 1140976050, 95000.00);
        Empleado per3 = new Empleado("Manuel", 1140976051, 95000.00);
        Empleado per4 = new Empleado("Ana", 1140976052, 95000.00);
        
        // Creación de una lista de empleados
        ArrayList<Empleado> empleados = new ArrayList();
        empleados.add(per1);
        empleados.add(per2);
        empleados.add(per3);
        empleados.add(per4);
        
        // Creación de listas de clientes y pedidos
        ArrayList<Cliente> clientes = new ArrayList();
        ArrayList<Pedido> pedidos = new ArrayList();
        
        String choice ="y";
        int numeroPedido=0;
        boolean t = false;
        
        // Bucle para tomar múltiples pedidos
        while (choice.equalsIgnoreCase("y")) {
            // Creación de un nuevo cliente
            Cliente cli = crearCliente();
            
            // Carga de desayunos para el cliente
            ArrayList<Desayuno> desayuno = cargarDesayuno();
            
            // Verificar si el cliente ya existe en la lista de clientes y actualizar su cantidad de desayunos
            for (Cliente c : clientes) {
                if (c.getNumeroTel() == cli.getNumeroTel()) {
                    c.setCantDesayunos(c.getCantDesayunos() + desayuno.size());
                    t = true;
                }
            }
            
            // Si el cliente no existe en la lista, se agrega a la lista de clientes
            if (t == false) {
                clientes.add(cli);
            }
            
            t = false;
            numeroPedido += 1; 
            
            System.out.println("Numero de pedido: " + numeroPedido);
            
            // Creación de un nuevo pedido y agregado a la lista de pedidos
            Pedido pedid = new Pedido(cli, numeroPedido, desayuno);
            pedidos.add(pedid);
            
            // Emisión del ticket para el pedido actual
            for (Pedido p : pedidos) {
                p.emitirTicket();
            }
            
            System.out.println("¿Desea crear otro pedido? (y/n)");
            choice = key.next();
        }
        
        // Mostrar todos los pedidos realizados
        int x = 0;
        for (Pedido p : pedidos) {
            x++;
            System.out.println("Pedido " + x);
            p.emitirTicket();
        }
    }
    
    // Método para crear un nuevo cliente
    public static Cliente crearCliente() {
        Scanner lector = new Scanner(System.in);
        Cliente cliente;
        
        System.out.println("Ingrese el nombre del cliente: ");
        String nombre = lector.nextLine();
        lector.nextLine(); // Se añade un nextLine() adicional para limpiar la memoria del almacenamiento
        
        System.out.println("Ingrese su número de teléfono: ");
        int numeroTel = lector.nextInt();
        
        cliente = new Cliente(nombre, numeroTel);
        return cliente;
    }
    
    // Método para cargar los desayunos pedidos por el cliente
    public static ArrayList<Desayuno> cargarDesayuno() {
        Scanner tc = new Scanner(System.in);
        
        System.out.println("¿Cuántos desayunos pidió el cliente?");
        int can = tc.nextInt();
        
        ArrayList<Desayuno> desayunos = new ArrayList();
        
        for (int i = 0; i < can; i++) {
            System.out.println("¿Cuántos ingredientes tiene el desayuno?");
            int cant = tc.nextInt();
            
            ArrayList<Ingrediente> ingredientes = new ArrayList();
            ingredientes = cargarIngredientes(cant);
            
            System.out.println("Nombre del desayuno? (Por favor, escriba sin espacios)");
            String nombre = tc.next();
            
            Desayuno desayuno = new Desayuno(nombre, ingredientes);
            desayunos.add(desayuno);
        }
        
        return desayunos;
    }
    
    // Método para cargar los ingredientes de un desayuno
    public static ArrayList<Ingrediente> cargarIngredientes(int cant) {
        Scanner key = new Scanner(System.in);
        ArrayList<Ingrediente> ingred = new ArrayList();
        
        for (int i = 0; i < cant; i++) {
            System.out.println("Nombre del ingrediente?");
            String nombre = key.nextLine();
            key.nextLine(); // Se añade un nextLine() adicional para limpiar el búfer
            
            System.out.println("Precio del ingrediente?");
            double precio = key.nextDouble();
            
            ingred.add(new Ingrediente(nombre, precio));
        }
        
        return ingred;
    }
}