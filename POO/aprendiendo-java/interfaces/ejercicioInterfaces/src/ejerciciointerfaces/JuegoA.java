package ejerciciointerfaces;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.lang.Math;

public class JuegoA implements Jugable{
    private String jugadorA;
    private String jugadorB;
    private int dado1A;
    private int dado2A;
    private int dado1B;
    private int dado2B;
    
    public JuegoA(){
        this.jugadorA = "";
        this.jugadorB = "";
        this.dado1A = 0;
        this.dado2A = 0;
        this.dado1B = 0;
        this.dado2B = 0;
    }
    
    @Override
    public void iniciar(){
        JOptionPane.showMessageDialog(null, "Anfitrión: Bienvenido al juego A, el juego de los dados.");
        String nombreA = JOptionPane.showInputDialog("Consola: Ingrese el nombre del jugador A");
        setJugadorA(nombreA);
        String nombreB = JOptionPane.showInputDialog("Consola: Ingrese el nombre del jugador B");
        setJugadorB(nombreB);
        jugar();

    }
    @Override
    public void jugar(){
        JOptionPane.showMessageDialog(null, "Anfitrión: Ahora " + this.jugadorA + " y " + this.jugadorB + " el juego es muy sencillo, tiraremos 2 dados cada uno y el que saque el mayor puntaje ganará");
        ImageIcon icon = new ImageIcon("src/images/dado.png");
        int a = 1;
        while (a != 0){
            int input = JOptionPane.showConfirmDialog(null, "Jugador "+this.jugadorA+" tiras el Dado?", "Decide...", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon);
            if (input == 0){
                a = 0;
            }else{
                if ( a == 1 ){
                    JOptionPane.showMessageDialog(null, "-_- Si no tiras el dado no podemos jugar...");
                    JOptionPane.showMessageDialog(null, "Vuelve a intentarlo...");
                }else if ( a == 2 ){
                    JOptionPane.showMessageDialog(null, "-_- No, seguimos sin avanzar...");
                    JOptionPane.showMessageDialog(null, "Vuelve a intentarlo...");
                }else if ( a == 3 ){
                    JOptionPane.showMessageDialog(null, "-_- Ya no es gracioso...");
                    JOptionPane.showMessageDialog(null, "Vuelve a intentarlo...");
                }else if ( a == 4 ){
                    JOptionPane.showMessageDialog(null, "-_- Mejor lo tiro yo...");
                    a = -1;
                }
                
                a++;
            }
        }
        int d1A = 1 + (int) (Math.random() * 6);
        setDado1A(d1A);
        int d2A = 1 + (int) (Math.random() * 6);
        setDado2A(d2A);
        int dat = d1A + d2A;
        a = 1;
        while (a != 0){
            int input = JOptionPane.showConfirmDialog(null, "Jugador "+this.jugadorB+" tiras el Dado?", "Decide...", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon);
            if (input == 0){
                a = 0;
            }else{
                if ( a == 1 ){
                    JOptionPane.showMessageDialog(null, "-_- Si no tiras el dado no podemos jugar...");
                    JOptionPane.showMessageDialog(null, "Vuelve a intentarlo...");
                }else if ( a == 2 ){
                    JOptionPane.showMessageDialog(null, "-_- No, seguimos sin avanzar...");
                    JOptionPane.showMessageDialog(null, "Vuelve a intentarlo...");
                }else if ( a == 3 ){
                    JOptionPane.showMessageDialog(null, "-_- Ya no es gracioso...");
                    JOptionPane.showMessageDialog(null, "Vuelve a intentarlo...");
                }else if ( a == 4 ){
                    JOptionPane.showMessageDialog(null, "-_- Mejor lo tiro yo...");
                    a = -1;
                }
                
                a++;
            }
        }
        int d1B = 1 + (int) (Math.random() * 6);
        setDado1B(d1B);
        int d2B = 1 + (int) (Math.random() * 6);
        setDado2B(d2B);
        int dbt = d1B + d2B;
        
        finalizar();
    }
    @Override
    public void finalizar(){
        if ((this.dado1A + this.dado2A) > (this.dado1B + this.dado2B)){
            JOptionPane.showMessageDialog(null, ""
                    + "EL VALOR DE LOS DADOS ES... \n"
                    + "                           |"
                    + " 1er Dado    "+this.dado1A+" | "+this.dado1B +
                    "                           |"
                    + " 2do Dado    "+this.dado2A+" | "+this.dado2B
                    + "                           |\n"
                    + "    "+(this.dado1A + this.dado2A)+" | "+(this.dado1B + this.dado2B)
                    + "                           |\n"
                    + "Anfitrion: Felicidades " + this.jugadorA + " por haber ganado siempre fuiste mi preferido"
            );
        }else if ((this.dado1A + this.dado2A) < (this.dado1B + this.dado2B)){
            JOptionPane.showMessageDialog(null, ""
                    + "EL VALOR DE LOS DADOS ES... \n"
                    + "                           |"
                    + " 1er Dado    "+this.dado1A+" | "+this.dado1B
                    + "                           |\n"
                    + " 2do Dado    "+this.dado2A+"| "+this.dado2B + "\n"
                    + "                           |  \n"
                    + "    "+(this.dado1A + this.dado2A)+" | "+(this.dado1B + this.dado2B) + "\n"
                    + "                           |  \n"
                    + "Anfitrion: Felicidades " + this.jugadorB + " por haber ganado siempre fuiste mi preferido"
            );
        }else{
            JOptionPane.showMessageDialog(null, ""
                    + "EL VALOR DE LOS DADOS ES... \n"
                    + "                           |  \n"
                    + " 1er Dado    "+this.dado1A+" | "+this.dado1B + "\n"
                    + "                           |  \n"
                    + " 2do Dado    "+this.dado2A+" | "+this.dado2B + "\n"
                    + "                           |  \n"
                    + "    "+(this.dado1A + this.dado2A)+" | "+(this.dado1B + this.dado2B) + "\n"
                    + "                           |  \n"
                    + "Anfitrion: oh... an empatado... no es muy habitual eso, tecnicamente hay 1 posibilidad entre 12... Fecilicidades a los 2, supongo"
            );
        }
        int input = JOptionPane.showConfirmDialog(null, "Volver a jugar?", "yo se que tu quieres...", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (input == 0){
            iniciar();
        }
    }

    public String getJugadorA() {
        return jugadorA;
    }

    public void setJugadorA(String jugadorA) {
        this.jugadorA = jugadorA;
    }

    public String getJugadorB() {
        return jugadorB;
    }

    public void setJugadorB(String jugadorB) {
        this.jugadorB = jugadorB;
    }

    public int getDado1A() {
        return dado1A;
    }

    public void setDado1A(int dado1A) {
        this.dado1A = dado1A;
    }

    public int getDado2A() {
        return dado2A;
    }

    public void setDado2A(int dado2A) {
        this.dado2A = dado2A;
    }

    public int getDado1B() {
        return dado1B;
    }

    public void setDado1B(int dado1B) {
        this.dado1B = dado1B;
    }

    public int getDado2B() {
        return dado2B;
    }

    public void setDado2B(int dado2B) {
        this.dado2B = dado2B;
    }
}
