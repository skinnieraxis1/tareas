
package misPersonas;
import java.util.*;

public class Ejecutable {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cant de personas que desea ingresar: ");
        int cant = teclado.nextInt();
        Persona[] pers = new Persona[cant];
        
        ingresarPersonas(pers);
        
        Persona[] mayoresDeEdad = personasMayor(pers);
        
        
        
        Persona[] jubilados = personasMasMayor(pers);
        
        
        
        Persona[] residentes = residentesCABA(pers);
        
        
        
        mostrarLista(mayoresDeEdad, "El nombre de las personas mayores de edad: ");
        
        mostrarLista(jubilados, "El nombre de las personas jubiladas: ");
        
        mostrarLista(residentes, "El nombre de las personas que residen en CABA: ");
        
    }
    
    public static void ingresarPersonas(Persona[] pers){
        Scanner teclado = new Scanner(System.in);
        for (int i = 0 ; i < pers.length ; i++){
            System.out.println("Ingrese el nombre de la persona");
            String nombre = teclado.next();
            System.out.println("Ingrese la edad de la persona");
            int edad = teclado.nextInt();
            System.out.println("Ingrese el dni de la persona");
            int dni = teclado.nextInt();
            
            System.out.println("Ingrese la calle de la persona");
            String calle = teclado.nextLine();
            teclado.nextLine();
            System.out.println("Ingrese el numero de calle de la persona");
            int numero = teclado.nextInt();
            System.out.println("Ingrese el piso de el dpto de la persona, en caso de vivir en casa dejelo vacio");
            String pisoDto = teclado.next();
            System.out.println("Ingrese la localidad de la persona");
            String localidad = teclado.next();
            
            Direccion direPersona = new Direccion(calle, numero, pisoDto, localidad);
            Persona personita = new Persona(nombre, edad, dni, direPersona);
            pers[i] = personita;
        }
    }
    
    public static Persona[] personasMayor(Persona[] pers){
        int listaMayores = 0;
        for (int i = 0 ; i < pers.length ; i++){
            if (pers[i].edad >= 18){
                listaMayores++;
            }
        }
        Persona[] mayoresDeEdad = new Persona[listaMayores];
        int a = 0;
        for (int i = 0 ; i < pers.length ; i++){
            if (pers[i].edad >= 18){
                mayoresDeEdad[a] = pers[i];
                a++;
            }
        }
        
        return mayoresDeEdad;
    }
    
    public static Persona[] personasMasMayor(Persona[] pers){
        int listaMayores = 0;
        for (int i = 0 ; i < pers.length ; i++){
            if (pers[i].edad >= 65){
                listaMayores++;
            }
        }
        Persona[] jubilados = new Persona[listaMayores];
        int a = 0;
        for (int i = 0 ; i < pers.length ; i++){
            if (pers[i].edad >= 65){
                jubilados[a] = pers[i];
                a++;
            }
        }
        
        return jubilados;
    }
    
    public static Persona[] residentesCABA(Persona[] pers){
        int listaResidentes = 0;
        for (int i = 0 ; i < pers.length ; i++){
            if (pers[i].direccion.localidad.equals("CABA")){
                listaResidentes++;
            }
        }
        Persona[] residentes = new Persona[listaResidentes];
        int a = 0;
        for (int i = 0 ; i < pers.length ; i++){
            if (pers[i].direccion.localidad.equals("CABA")){
                residentes[a] = pers[i];
                a++;
            }
        }
        
        return residentes;
    }
    
    public static void mostrarLista(Persona[] lista, String comentario){
        System.out.println(comentario);
        for (int i = 0 ; i < lista.length ; i++){
            System.out.println(lista[i].nombre);
        }
    }
}
