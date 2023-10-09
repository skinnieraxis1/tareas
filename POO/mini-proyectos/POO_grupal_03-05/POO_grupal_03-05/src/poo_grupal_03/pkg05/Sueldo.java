package poo_grupal_03.pkg05;



public class Sueldo {
    private double sueldoB;
    private double obraS;
    private double jubilacion;
    private double presentismo;


    public Sueldo(double sB){
        this.obraS = 3;
        this.jubilacion = 11;
        this.presentismo = 10;
        this.sueldoB = sB;
    }
    
    public double calcularSN(){
        this.obraS = 3/100 * this.sueldoB;
        this.jubilacion = 11/100 * this.sueldoB;
        this.presentismo = 10/100 * this.sueldoB;
        double num;
        num = this.sueldoB - this.obraS - this.jubilacion + this.presentismo;
        return num;
    }

    public double getSueldoB() {
        return sueldoB;
    }

    public void setSueldoB(double sueldoB) {
        this.sueldoB = sueldoB;
    }

    public double getObraS() {
        return obraS;
    }

    public void setObraS(double obraS) {
        this.obraS = obraS;
    }

    public double getJubilacion() {
        return jubilacion;
    }

    public void setJubilacion(double jubilacion) {
        this.jubilacion = jubilacion;
    }

    public double getPresentismo() {
        return presentismo;
    }

    public void setPresentismo(double presentismo) {
        this.presentismo = presentismo;
    }
    
}