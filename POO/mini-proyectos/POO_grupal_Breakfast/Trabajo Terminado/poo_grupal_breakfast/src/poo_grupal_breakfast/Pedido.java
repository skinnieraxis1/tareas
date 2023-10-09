//Lautaro
    
// Definición del paquete y nombre de la clase
package poo_grupal_breakfast;

import java.util.ArrayList;

// Declaración de la clase Pedido
public class Pedido {
    // Atributos de la clase Pedido
    private Cliente cliente;
    private int numeroPedido;
    private ArrayList<Desayuno> desayuno = new ArrayList();
    private double precioT;

    // Constructor de la clase Pedido
    public Pedido(Cliente c, int n, ArrayList<Desayuno> d) {
        this.desayuno = d;
        this.cliente = c;
        this.numeroPedido = n;
        this.precioT = calcularTotalPedido(d);
    }

    // Método para emitir el ticket del pedido
    public void emitirTicket() {
        System.out.println("Numero de pedido: " + this.numeroPedido + " pertenece a " + this.cliente + " que pidio: ");
        for (Desayuno d : this.desayuno) {
            d.mostrarDatos();
        }
        System.out.println("con un precio de $" + this.precioT);
    }

    // Métodos getter y setter para los atributos cliente, numeroPedido y precioT
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public double getPrecioT() {
        return precioT;
    }

    public void setPrecioT(double precioT) {
        this.precioT = precioT;
    }

    // Método para calcular el precio total del pedido
    public double calcularTotalPedido(ArrayList<Desayuno> d) {
        double cant = 0.0;
        if (this.cliente.getCantDesayunos() < 10) {
            for (Desayuno des : d) {
                cant += des.calcularPrecioT();
            }
            cliente.setCantDesayunos(0);
        }
        return cant;
    }
}