package pkg20_henrylunazco;

import javax.swing.JOptionPane;

public class Animals {
    //atributos
    
    String nombres;
    String tipo;
    float tamaño;
    float peso;
    
    //metodos
    public void datos(){
        nombres = JOptionPane.showInputDialog("INGRESE EL NOMBRE DEL ANIMAL");
        tipo = JOptionPane.showInputDialog("INGRESE EL TIPO DEL ANIMAL");
        tamaño = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL TAMAÑO DEL ANIMAL"));
        peso = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL PESO DEL ANIMAL"));
        
    }
    
    public void lento(){
        JOptionPane.showMessageDialog(null, "EL " + nombres + " ES MUY LENTO Y ES " + tipo);
    }
    
    public void velocidad(){
        JOptionPane.showMessageDialog(null, "EL " + nombres + " ES MUY RÁPIDO Y ES " + tipo);
    }
    
    public void carnivoro(){
        JOptionPane.showMessageDialog(null, "EL " + nombres + " ES UN ANIMAL CARNIVORO Y ES " + tipo);
    }
    
    public void herbivoro(){
        JOptionPane.showMessageDialog(null, "EL " + nombres + " ES UN ANIMAL HERBIVORO Y ES " + tipo);
    }

}
