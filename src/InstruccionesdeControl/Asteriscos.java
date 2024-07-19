package InstruccionesdeControl;

import java.util.Scanner;

public class Asteriscos {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int lado;
        System.out.println("Introduzca un numero del 1 al 20 y se "
                + "imprimira un cuadro con ese lado");
        lado = s.nextInt();
        if (lado > 0 && lado <= 20) {
            for (int i = 0; i < lado; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
            for (int i = 0; i < lado - 2; i++) {
                System.out.print("*");
                for (int j = 0; j < lado - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            for (int i = 0; i < lado; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

}
