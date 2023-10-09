/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo_grupal_breakfast;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CS-04
 */
public class Ejecutable {
    public static void main(String[] args) {
        Empleado per1 = new Empleado("Alicia", 1140976059, 95000.00);
        Empleado per2 = new Empleado("Pedro", 1140976050, 95000.00);
        Empleado per3 = new Empleado("Manuel", 1140976051, 95000.00);
        Empleado per4 = new Empleado("Ana", 1140976052, 95000.00);
        ArrayList<Empleado> empleados = new ArrayList();
        empleados.add(per1);
        empleados.add(per2);
        empleados.add(per3);
        empleados.add(per4);
        Cliente cli = crearCliente();
        
    }
    
    public static Cliente crearCliente() {
        Scanner lector = new Scanner(System.in);
        Cliente cliente;
        System.out.println("Ingrese el nombre del cliente: ");
        String nombre = lector.next();
        System.out.println("Ingrese su numero de telefono: ");
        int numeroTel = lector.nextInt();
        System.out.println("Ingrese la cantidad de pedidos que lleva: ");
        int cantDesayunos = lector.nextInt();
        cliente = new Cliente(nombre, numeroTel, cantDesayunos);
        return cliente;
    }
    
    public static void IngresIngred() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese que ingrediente es: ");
        String ingred = lector.next();
        System.out.println("Ingrese su precio");
    }
}
