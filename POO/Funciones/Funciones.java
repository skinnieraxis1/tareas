package com.mycompany.functions;

import java.util.Scanner;

public class Functions {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Elija una actividad: ");
        System.out.println("1. saludo");
        System.out.println("2. cuadrado");
        System.out.println("3. saludo");
        System.out.println("4. promedio");
        System.out.println("5. historia");
        System.out.println("6. calculadora");
        System.out.println("7. numero en letra");
        
        
        int respuesta = teclado.nextInt();
        
        if (respuesta == 1) {
            /*1*/

            saludo("Hola que tal estas!");

        }else if (respuesta == 2) {
            /*2*/

            double num1 = cuadrado(12, 2);
            System.out.println("El cuadrado de los numeros es: " + num1);

        }else if (respuesta == 3) {
            /*3*/

            seguidillaDeNum(1, 100);
            seguidillaDeNum(100, 1);

        }else if (respuesta == 4) {
            /*4*/

            double resultado = promedio(3, teclado);
            System.out.println(resultado);

        }else if (respuesta == 5){
            /*5*/
            
            System.out.println("Ingrese el nombre del personaje: ");
            String nombre = teclado.nextLine();
            System.out.println("Ingrese el apellido del personaje: ");
            String apellido = teclado.nextLine();
            System.out.println("Ingrese el lugar del personaje: ");
            String lugar = teclado.nextLine();
            historia(nombre, apellido, lugar);

        }else if (respuesta == 6){
            /*6*/

            menuCalculadora(teclado);

        }else if (respuesta == 7){
            /*7*/

            numEnLetras(teclado);

        }
    }
    
    /* Punto 1 mostrar en pantalla */
    
    public static void saludo(String frase){
        System.out.println(frase);
    }
    
    /* Punto 2 potencia */
    
    public static double cuadrado(int base, int exponente){
        double resultado = Math.pow(base, exponente);
        return resultado;
    }
    
    /* Punto 3, 1 al 100 */
    
    public static void seguidillaDeNum(int primer, int ultimo){
        if (primer < ultimo) {
            for(int i = primer; i<=ultimo; i++){
                System.out.println(i);
            }
        }else{
            for(int i = primer; i>=ultimo; i--){
                System.out.println(i);
            }
        }   
    }
    
    /* Punto 4 promedio */
    
    public static double promedio(int cantDeNumeros, Scanner teclado){
        int sumaNumeros = 0;
        for (int i = 0 ; i<=cantDeNumeros ; i++){
            System.out.println("Escriba el numero " + i + ": ");
            int num = teclado.nextInt();
            sumaNumeros = (sumaNumeros + num);
        }
        
        double promedio = sumaNumeros / cantDeNumeros;
        return promedio;
    }
    
    /* Punto 5 historia */
    
    public static void historia(String nombre, String apellido, String lugar){
        System.out.println("Habia una ves un pibe que se llamaba " + nombre + " era muy feliz viviendo en " + lugar + " con su");
        System.out.println(" abuelo Angel " + apellido + ", hasta que un dia llego un dargon que se comio a su abuelito, FIN");
    }
    
    /* Punto 6 menu calculadora */
    
    public static void menuCalculadora(Scanner teclado){
        
        System.out.println("Por favor eligue la funcionalidad que desea: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        
        int respuesta = teclado.nextInt();
        System.out.println("Ingrese el primer numero");
        double numU = teclado.nextDouble();
        System.out.println("Ingrese el segundo numero");
        double numD = teclado.nextDouble();
        double resultado = 0;
        
        if (respuesta == 1){
            resultado = sumar(numU, numD);
        }else if(respuesta == 2){
            resultado = restar(numU, numD);
        }else if(respuesta == 3){
            resultado = multiplicar(numU, numD);
        }else if(respuesta == 4){
            resultado = dividir(numU, numD);
        }else{
            System.out.println("Hasta luego");
        }
        if (respuesta<=4 || respuesta>=1){
            String result = Double.toString(resultado);
            System.out.println("El resultado de su cuenta es: " + result);
        }
    }
    
    public static double sumar(double pr, double sg){
        double resultado = pr + sg;
        return resultado;
    }
    
    public static double restar(double pr, double sg){
        double resultado = pr - sg;
        return resultado;
    }
    
    public static double multiplicar(double pr, double sg){
        double resultado = pr * sg;
        return resultado;
    }
    
    public static double dividir(double pr, double sg){
        double resultado = pr / sg;
        return resultado;
    }
    
    
    /* Punto 7  */
    
    public static void numEnLetras(Scanner teclado){
    
        System.out.println("Elije un numero del 1 al 10");
        int num = teclado.nextInt();
        
        int[] ArrayNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] ArrayNumP = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez"};
        int ArraySize = ArrayNum.length;
        String palabra = "";
        
        for (int i = 0 ; i < ArraySize ; i++){
            if (ArrayNum[i] == num){
                palabra = ArrayNumP[i];
            } 
        }
        
        System.out.println("El numero en letras es: " + palabra);
    
    }
}
