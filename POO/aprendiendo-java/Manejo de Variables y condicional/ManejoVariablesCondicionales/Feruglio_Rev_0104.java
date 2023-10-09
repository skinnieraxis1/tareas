package com.mycompany.manejovariablescondicionales;

import java.util.Scanner;

public class ManejoVariablesCondicionales {

    public static void main(String[] args){
   
        Scanner teclado = new Scanner (System.in);
        int num;
        
        System.out.println("Escriba el numero: ");
        num = teclado.nextInt();
        
        float divisible = num % 2;
        
        if (divisble == 0){
            System.out.println("El numero " + num + " es divisble por 2");
        }else{
            System.out.println("El numero " + num + " no es divisble por 2");
        }
        
    }
}