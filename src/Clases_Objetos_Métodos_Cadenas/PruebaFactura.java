package Clases_Objetos_Métodos_Cadenas;

import java.util.Scanner;

public class PruebaFactura {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Factura f = new Factura(" ", " ", 0, 0.0);
        
        System.out.println("\n------------------------FACTURA------------------------\n");
        System.out.printf("%-30s %-30s %-12s %-10s", 
                "Nombre", "Descripcion", "Precio", "Cantidad");
        System.out.println("");
        System.out.printf("%-30s %-30s $%-12.1f %-10d%n",
                f.obtenern(), f.obtenerd(), f.obtenerp(), f.obtenerc());
        System.out.printf("%-30s %-30s %-12s %-10.1f%n", 
                " ", " ", "MONTO TOTAL: ", f.obtenerm());
        
        //ingresa valores
        System.out.println("Introduzca el nombre de la pieza:");
        f.establecern(s.nextLine());// coloca elNombre en miCuenta

        System.out.println("Descripcion de la pieza: ");
        f.establecerd(s.nextLine());

        System.out.println("Cantidad: ");
        int cantidad = s.nextInt();
        f.establecerc(cantidad);

        System.out.println("Precio por unidad: ");
        double precio = s.nextDouble();
        f.establecerp(precio);
        f.ObtenerMonto(cantidad, precio);
        // muestra el nombre almacenado en el objeto 
        System.out.println("\n------------------------FACTURA------------------------\n");
        System.out.printf("%-30s %-30s %-12s %-10s", 
                "Nombre", "Descripcion", "Precio", "Cantidad");
        System.out.println("");
        System.out.printf("%-30s %-30s $%-12.2f %-10d%n",
                f.obtenern(), f.obtenerd(), f.obtenerp(), f.obtenerc());
        System.out.printf("%-30s %-30s %-12s %-10.2f%n", 
                " ", " ", "MONTO TOTAL: ", f.obtenerm());
        
    }
}
