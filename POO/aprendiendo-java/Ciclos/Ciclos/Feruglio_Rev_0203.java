package com.mycompany.ciclos;

import java.util.Scanner;

public class Ciclos {

    public static void main(String[] args){
   
        for (int i = 1; i<=100 ; i++){
            float divisibleDos = i % 2;
            float divisibleTres = i % 3;
            if (divisibleDos == 0 && divisibleTres == 0){
                System.out.println(i);
            }
        }
        
    }
}
