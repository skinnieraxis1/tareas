package supermercado;

public class Fecha {
   private String diaSemana;
   private int mes;
   private int dia;
   private int año;
   
   public Fecha(String ds, int m, int d, int a){
       this.diaSemana = ds;
       this.mes = m;
       this.dia = d;
       this.año = a;
   }
   
   public void mostrarDatos(){
       System.out.println(this.diaSemana + this.dia + " del " + this.mes + " del " + this.año);
   }

    public int getAño() {
        return año;
    }

    public int getDia() {
        return dia;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public int getMes() {
        return mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
   
   
}
