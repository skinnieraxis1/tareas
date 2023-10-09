/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_grupal_breakfast;


public class Pedido {
    
    private Cliente cliente;
    private int numeroPedido;
    private Desayuno desayuno;
    private double precioT ;

    public Pedido(Cliente c, int n, Desayuno d){
        this.precioT = d.calcularPrecioT();
        this.cliente = c;
        this.numeroPedido = n;
        this.desayuno = d;
    }
    
    public void emitirTicket(){
        System.out.println("El pedido numero " + this.numeroPedido + " pertenece a " + this.cliente + " que pidio un " + this.desayuno + " con un precio de " + this.precioT);
    }

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

    public Desayuno getDesayuno() {
        return desayuno;
    }

    public void setDesayuno(Desayuno desayuno) {
        this.desayuno = desayuno;
    }

    public double getPrecioT() {
        return precioT;
    }

    public void setPrecioT(double precioT) {
        this.precioT = precioT;
    }
    
}
