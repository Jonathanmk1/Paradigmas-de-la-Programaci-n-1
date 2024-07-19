
package OperadoresLogicos;

public class ImprimirTriángulo {
     public static void main(String[] args) {
        
        System.out.println("TRIANGULOS CON ASTERISCOS");

        System.out.println("Triangulo A: \n");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("\n\nTriangulo B: \n");

        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("\n\nTriangulo C: \n");

        for (int j = 1; j <= 10; j++) {
            for (int i = 1; i <= 10 - j; i++) {
                System.out.print("  ");
            }
            for (int z = 1; z <= j; z++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("\n\nTriangulo D: \n");

        for (int j = 1; j <= 10; j++) {
            for (int i = 10; i >= j; i--) {
                System.out.print(" *");
            }
            System.out.println();
            
            for (int z = 11-j; z<=10; z++) {
                System.out.print("  ");
            }
        }
    }

}
