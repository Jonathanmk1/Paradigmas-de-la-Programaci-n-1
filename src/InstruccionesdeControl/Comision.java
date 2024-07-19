package InstruccionesdeControl;

import java.util.Scanner;

public class Comision {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nombre, resp;
        int cantidad;
        double precio, sueldo, comision, suma=0, total = 0;
        
        System.out.println("\033[34m***********Tienda departamental***********\033[0m");
        do{
        
        System.out.println("Ingrese el nombre del articulo: ");
        nombre = s.nextLine();
        System.out.println("Ingrese la cantidad de piezas vendidas del articulo:");
        cantidad = s.nextInt();
        
        System.out.println("Ingrese el precio por unidad del articulo");
        precio = s.nextDouble();
        
        total = cantidad * precio;
        suma = suma + total;
        total++;
        
            System.out.println("--------------------------------");
            System.out.println("Otro articulo?");
            resp = s.nextLine();
            resp = s.nextLine();
            
        }while(resp.equalsIgnoreCase("si"));
        System.out.println("Ingrese sueldo del vendedor: ");
        sueldo = s.nextDouble();
        comision = (suma * 0.09) + sueldo;
        System.out.println("El total vendido es de:" + suma);
        System.out.println("El sueldo del vendedor es de $" + comision);
 
        
    }
}
