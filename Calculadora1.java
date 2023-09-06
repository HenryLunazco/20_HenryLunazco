package pkg20_henrylunazco;

import java.util.Scanner;

public class Calculadora1 {
    Scanner datosj = new Scanner(System.in);
    //atributos
    int a;
    int b;
    int mul;
    
    //metodo
    public void datos(){
        System.out.print("Ingrese el primer número: ");
        a = datosj.nextInt();
        System.out.print("Ingrese el segundo número: ");
        b = datosj.nextInt();
    }
    
    public void multiplicar(){
        
        mul = a * b;
        System.out.print("La multiplicación es: " + mul);
        
    }

}
