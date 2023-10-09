package com.mycompany.manejovariablescondicionales;

import java.util.Scanner;

public class ManejoVariablesCondicionales {

    public static void main(String[] args){
   
        Scanner teclado = new Scanner (System.in);
        int radio;
        
        System.out.println(Escriba la radio del circulo );
        radio = teclado.nextInt();
        
        int potencia = 2;
        
        double areaCirculo = Math.PI  (Math.pow(radio, potencia));
        System.out.println(El area del circulo es  + areaCirculo);
                
    }
}
