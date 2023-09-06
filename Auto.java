package pkg20_henrylunazco;

import javax.swing.JOptionPane;

public class Auto {
    String marca;
    String color;
    String placa;
    int kl;
    
    //METODO
    public void datos(){
        marca = JOptionPane.showInputDialog("INGRESE LA MARCA DE AUTO");
        color = JOptionPane.showInputDialog("INGRESE EL COLOR DEL AUTO");
        placa = JOptionPane.showInputDialog("INGRESE LA PLACA DEL AUTO");
        kl = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL KILOMETRAJE DEL AUTO"));
    }
    
    public void acelerar(){
        JOptionPane.showMessageDialog(null,"EN MI AUTO " + marca + " ACELERÉ DE 0 A 100 KM EN 10s");
    }
    
    public void frenar(){
        JOptionPane.showMessageDialog(null,"MI AUTO " + marca + " FRENÓ EN SECO");
    }
    
    public void sonido(){
        JOptionPane.showMessageDialog(null,"MI AUTO "+ marca + " DE COLOR "+ color + " Y CON PLACA "+ placa +" ARRANCÓ E HIZO MUCHO RUIDO");
    }

}
