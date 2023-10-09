package com.mycompany.ciclos;

import java.util.Scanner;

public class Ciclos {

    public static void main(String[] args){
        
        int num = 0;
        
        while(num == 0){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Escriba un num: ");
            num = teclado.nextInt();
        }

    }
}
