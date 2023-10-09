package com.mycompany.manejovariablescondicionales;

import java.util.Scanner;

public class ManejoVariablesCondicionales {

    public static void main(String[] args){
   
        Scanner teclado = new Scanner (System.in);
        float precio;
        
        System.out.println("Escriba el precio: ");
        precio = teclado.nextInt();
        
        float precioIva = ((precio * 21) / 100);
        float precioActualizado = precio + precioIva;
        
        System.out.println("El precio con el iba es de " + precioActualizado + "Con un aumento de " + precioIva);
        
    }
}
