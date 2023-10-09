package shoponline;
import javax.swing.JOptionPane;
import javax.swing.*;
public class ShopOnLine {

    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public Pantalon crearPantalon(){
        String desc = JOptionPane.showInputDialog("Ingrese la descripción del pantalón: ");
        String precio = JOptionPane.showInputDialog("Ingrese el precio del pantalón: ");
        double p = Double.parseDouble(precio);
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del pantalón: ");
        String talle = JOptionPane.showInputDialog("Ingrese el talle del pantalón: ");
        int t = Integer.parseInt(talle);
        Pantalon pant = new Pantalon(desc, p, t, modelo);
        return pant;
    }
    
    public Remera crearRemera(){
        String desc = JOptionPane.showInputDialog("Ingrese la descripción de la remera: ");
        String precio = JOptionPane.showInputDialog("Ingrese el precio de la remera: ");
        double p = Double.parseDouble(precio);
        String talle = JOptionPane.showInputDialog("Ingrese el talle de la remera: ");
        char t = talle.charAt(0);
        Remera rem = new Remera(desc, p, t);
        return rem;
    }
    
    public Accesorio crearAccesorio(){
        String desc = JOptionPane.showInputDialog("Ingrese la descripción del accesorio: ");
        String material = JOptionPane.showInputDialog("Ingrese el material del accesorio: ");
        String peso = JOptionPane.showInputDialog("Ingrese el peso en gramos del accesorio: ");
        double p = Double.parseDouble(peso);
        Accesorio acc = new Accesorio(desc, 0, p, material);
        return acc;
    }
