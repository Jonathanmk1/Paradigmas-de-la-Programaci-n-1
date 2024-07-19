
package OperadoresLogicos;

import java.util.Scanner;
/*
Un vendedor minorista en línea vende cinco productos cuyos precios de venta son los
siguientes: producto 1, $2.98; producto 2, $4.50; producto 3, $9.98; producto 4, $4.49 y producto 5, $6.87. Escriba
una aplicación que lea una serie de pares de números, como se muestra a continuación:
a) número del producto;
b) cantidad vendida.
*/
public class CalcularlasVentas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nP;
        float total[], finalT = 0;
        total = new float[5];
        String resp;
        boolean rango;

        System.out.println("Ventas \n\nBienvenidio");
        
        System.out.println("¿Vendio alguna cantidad de productos?");
        resp = s.nextLine();

        while (resp.equalsIgnoreCase("si")) {
            rango=true;
            System.out.println("Numero de producto: ");
            nP = s.nextInt();

            switch (nP) {
                case 1://Producto 1.
                    System.out.println("Cantidad de productos vendidos: ");
                    int cantP = s.nextInt();
                    total[0] += cantP * 2.98f;
                    break;
                case 2://Producto 2.
                    System.out.println("Cantidad de productos vendidos: ");
                    int cant = s.nextInt();
                    total[1] += cant * 4.50f;
                    break;
                case 3: //Producto 3.
                    System.out.println("Cantidad de productos vendidos: ");
                    int can = s.nextInt();
                    total[2] += can * 9.98f;
                    break;
                case 4: //Producto 4.
                    System.out.println("Cantidad de productos vendidos: ");
                    int ca = s.nextInt();
                    total[3] += ca * 4.49f;
                    break;
                case 5: //Producto 5.
                    System.out.println("Cantidad de productos vendidos: ");
                    int c = s.nextInt();
                    total[4] += c * 6.87f;
                default:
                    System.out.println("Error \n\nProducto inexistente");
                    rango = false;
                    break;
            }

            if (rango == true) {
                System.out.println("¿Vendio alguna otra cantidad de productos?");
                resp = s.nextLine();
            } else if(rango==false) {
                System.out.println("Digite nuevamente el numero de producto por favor.");
            }
        }
        for (int i = 0; i < 5; i++) {
            finalT += total[i];
        }

        System.out.printf("%-15s  %-15s\n",
                "No. de producto", " Total vendido");
        System.out.println();

        for (int i = 0; i < total.length; i++) {
            System.out.printf("%-15o  %-16f\n",
                    i + 1, total[i]);
        }
        System.out.println("\nTotal de venta: $" + finalT + " pesos");
    }
    
}
