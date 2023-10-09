package com.mycompany.ciclos;

import java.util.Scanner;

public class Ciclos {

    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba la cantidad de ventas: ");
        int cantVentas = teclado.nextInt();
        int venta;
        int suma = 0;
        
        for (int i = 1; i<=cantVentas ; i++){
            System.out.println("Escriba la venta n° " + i + ": ");
            venta = teclado.nextInt();
            suma = suma + venta;
        }
        
        System.out.println("La suma de las ventas es de " + suma);
        
    }
}
