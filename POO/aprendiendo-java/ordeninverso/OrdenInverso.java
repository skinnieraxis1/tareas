package com.mycompany.ordeninverso;

import java.util.Scanner;

public class OrdenInverso {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] datos = new int[10];
        
        for(int i = 0; i < 10; i++){
            System.out.println("Ingrese el valor del num "+ (i+1) + ": ");
            datos[i] = lector.nextInt();
        }
        
        System.out.println(" ");
        
        for(int i = 9; i >= 0; i--){
            System.out.print(datos[i]+ " ");
        }
    }
}
