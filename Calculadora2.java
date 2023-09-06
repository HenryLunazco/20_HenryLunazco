package pkg20_henrylunazco;

import javax.swing.JOptionPane;

public class Calculadora2 {
    // Atributos
    float a;
    float b;
    float mul;
    float div;
    float sum;
    float res;
    
    //Metodo
    public void pregunta(){
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de b, que sea menor que a:"));
    }
    
    public void multiplicacion(){
        mul = a * b;
        JOptionPane.showMessageDialog(null, "La multiplicación es " + mul);
    }
    
    public void division(){
        div = a / b;
        JOptionPane.showMessageDialog(null, "La division es " + div);
    }
    
    public void suma(){
        sum = a + b;
        JOptionPane.showMessageDialog(null, "La suma es " + sum);
    }
    
    public void resta(){
        res = a - b;
        JOptionPane.showMessageDialog(null, "La resta es " + res);
    }
    
    public void operaciones(){
        mul = a * b;
        div = a / b;
        sum = a + b;
        res = a - b;
        JOptionPane.showMessageDialog(null, "La multiplicación es " + mul + " La division es " + div + " La suma es " + sum + " La resta es " + res);
        
    }

}
