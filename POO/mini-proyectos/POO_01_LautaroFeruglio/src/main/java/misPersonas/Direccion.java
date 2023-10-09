package misPersonas;

public class Direccion {
    String calle;
    int numero;
    String pisoDto;
    String localidad;
    
    public Direccion(String c, int n, String p, String l){
        this.calle = c;
        this.numero = n;
        this.pisoDto = p;
        this.localidad = l;
    }
    
    public void datosDir(){
        System.out.println(this.calle + this.numero + " piso " + this.pisoDto + this.localidad);
    }
}
