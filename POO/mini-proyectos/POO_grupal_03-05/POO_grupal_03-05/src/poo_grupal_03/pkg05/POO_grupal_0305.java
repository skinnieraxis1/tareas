package poo_grupal_03.pkg05;

import java.util.Scanner;

public class POO_grupal_0305 {
    
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        Empresa emp = crearEmpresa(teclado);

        emp.mostrarClientesEmpresa();
        emp.mostrarDirectivosEmpresa();
        emp.mostrarEmpleadosEmpresa();

    }
    public static Empleado crearEmpleado(Scanner teclado){
        System.out.println("Ingrese el nombre el empleado : ");
        String nombre = teclado.next();
        System.out.println("Ingrese la edad del empleado : ");
        int edad = teclado.nextInt();
        System.out.println("Ingrese el sueldo del empleado : ");
        double sueldoB = teclado.nextDouble();
        Empleado empleado = new Empleado(nombre, edad, sueldoB);
        return empleado;
    }
    public static Cliente crearCliente(Scanner teclado){
        System.out.println("Ingrese el nombre del Cliente : ");
        String nombre = teclado.next();
        System.out.println("Ingrese la edad del Cliente : ");
        int edad = teclado.nextInt();
        System.out.println("Ingrese el telefono del cliente : ");
        int telefono = teclado.nextInt();
        Cliente cliente = new Cliente(nombre, edad, telefono);
        return cliente;

    }
    public static Empresa crearEmpresa(Scanner teclado){
        System.out.println("Ingrese el nombre de la empresa: ");

        String n = teclado.next();

        System.out.println("Ingrese la cantidad de empleados (subordinados) que tiene la empresa: ");
        int cantE = teclado.nextInt();

        Empleado[] empleados = new Empleado[cantE];

        for(int i = 0; i <= cantE; i++){
            empleados[i] = crearEmpleado(teclado);
        }

        System.out.println("Ingrese la cantidad de directivos que tiene la empresa: ");
        cantE = teclado.nextInt();

        Directivo[] directivos = new Directivo[cantE];

        for(int i = 0; i <= cantE; i++){
            directivos[i] = crearDirectivo(empleados, teclado);
        }

        System.out.println("Ingrese la cantidad de clientes que tiene la empresa: ");
        cantE = teclado.nextInt();

        Cliente[] clientes = new Cliente[cantE];

        for(int i = 0; i <= cantE; i++){
            clientes[i] = crearCliente(teclado);
        }

        String c = teclado.next();
        Empresa empresa = new Empresa(n,empleados,clientes, directivos);

        empresa.mostrarClientesEmpresa();

        return empresa;   
    }
    public static Directivo  crearDirectivo(Empleado[] empleados, Scanner teclado){
        System.out.println("Ingrese el nombre del directivo : ");
        String nombre = teclado.next();
        System.out.println("Ingrese la edad del directivo : ");
        int edad = teclado.nextInt();
        System.out.println("Ingrese el sueldo del empleado : ");

        for( int i = 0 ; i < empleados.length ; i++ ){

            System.out.println("Empleado " + i + " : ");
            empleados[i].mostrarDatos();

        }
        int emp = 0;
        Empleado[] em = new Empleado[empleados.length];
        int i = 0;
        while (emp < 0 ){
            System.out.println("Ingrese el num del empleado que vaya con el directivo, en caso de que ya no haya mas marcar numero menor a 0");
            emp = teclado.nextInt();
            i++;
            if (emp >= 0){

                em[i] = empleados[emp];

            }
        }

        double sueldoB = teclado.nextDouble();
        System.out.println("Ingrese la categoria del directivo : ");
        String cat = teclado.next();
        Directivo directivo = new Directivo(nombre, edad, sueldoB, em, cat);
        return directivo;
    }
    
    
}
