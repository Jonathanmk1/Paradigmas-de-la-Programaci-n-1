
package OperadoresLogicos;

import java.util.Scanner;

public class LeyesdeDeMorgan {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int incognita;
        int x = 0;
        int y = 0;

        int a;
        int b;
        int g;

        System.out.println("5.23 a): ");
        System.out.println("Este programa corrobora con un ejemplo ");
        System.out.print("las leyes de De Morgan.\n");

        System.out.println("Leyes de De Morgan, ");
        System.out.println("!(x < 5) && !(y >= 7) es equivalente a ");
        System.out.println("!((x < 5) || !(y >= 7)) ");

        System.out.println(" La variable incognita toma los valores 0 o 1 ");
        System.out.print("de la siguiente manera: \n");
        System.out.println("\n incognita = ( !(x < 5) && !(y >= 7 ))? 1: 0; ");

        System.out.println("\nIngrese un valor de x: ");
        x = t.nextInt();

        System.out.println("\nPor favor introduzca un valor de y: ");
        y = t.nextInt();

        incognita = (!(x < 5) && !(y >= 7)) ? 1 : 0;

        System.out.printf("\nEl valor de incongnita es: %d\n", incognita);

        System.out.println(" La variable incognita toma los valores 0 o 1 ");
        System.out.print("de la siguiente manera: \n");
        System.out.println("\n incognita = !( (x < 5) || (y >= 7 ))? 1: 0; ");
        System.out.println("\nIngrese un valor de x: ");
        x = t.nextInt();

        System.out.println("\nIngrese un valor de y: ");
        y = t.nextInt();

        incognita = !((x < 5) || (y >= 7)) ? 1 : 0;

        System.out.printf("\nEl valor de incongnita es: %d\n", incognita);

        System.out.println("5.23 b): ");
        System.out.println("\nLeyes de De Morgan, ");
        System.out.println("\n!(a == b) || !(g != 5) es equivalente a ");
        System.out.println("\n!((a == b) && (g != 5)) ");

        System.out.print("\n La variable incognita toma los valores 0 o 1 ");
        System.out.print("de la siguiente manera: \n");
        System.out.println("\n incognita = (!(a == b) || !(g != 5))? 1:0; ");

        System.out.println("\nIngrese un valor de a: ");
        a = t.nextInt();

        System.out.println("\nIngrese un valor de b: ");
        b = t.nextInt();

        System.out.println("\nIngrese un valor de g: ");
        g = t.nextInt();

        incognita = (!(a == b) || !(g != 5)) ? 1 : 0;

        System.out.printf("\nEl valor de incongnita es: %d\n", incognita);

        System.out.print("\n La variable incognita toma los valores 0 o 1 ");
        System.out.print("de la siguiente manera: \n");
        System.out.println("\n incognita = !((a == b) && (g != 5))? 1: 0;");

        System.out.println("\nIngrese un valor de a: ");
        a = t.nextInt();

        System.out.println("\nIngrese un valor de b: ");
        b = t.nextInt();

        System.out.println("\nIngrese un valor de g: ");
        g = t.nextInt();

        incognita = !((a == b) && (g != 5)) ? 1 : 0;

        System.out.printf("\nEl valor de incongnita es: %d\n", incognita);
    
    }
}
