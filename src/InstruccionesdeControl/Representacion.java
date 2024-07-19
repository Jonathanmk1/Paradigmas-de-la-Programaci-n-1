
package InstruccionesdeControl;

import java.util.Scanner;


public class Representacion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int lado1, lado2, lado3;
        System.out.println("Ingrese el lado 1");
        lado1 = s.nextInt();
        System.out.println("Ingrese el lado 2");
        lado2 = s.nextInt();
        System.out.println("Ingrese el lado 3");
        lado3 = s.nextInt();
        
        if(lado1 !=0 && lado2 !=0 && lado3 !=0){
            System.out.println("representa los lados de un triangulo");
        }
        else{
            System.out.println("No puede ser los lados de un triangulo");
        }
        
    }
    
}
