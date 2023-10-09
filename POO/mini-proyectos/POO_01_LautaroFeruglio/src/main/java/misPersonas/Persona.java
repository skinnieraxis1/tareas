
package misPersonas;

public class Persona {
    String nombre;
    int edad;
    int dni;
    Direccion direccion;
    
    public Persona(String n, int e, int d, Direccion dir){
        this.nombre = n;
        this.edad = e;
        this.dni = d;
        this.direccion = dir;
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre de la persona es " + this.nombre + " con " + this.edad + " años, su dni es " + this.dni + " y vive en " + this.direccion.calle + " " + this.direccion.numero);
    }
    
}
