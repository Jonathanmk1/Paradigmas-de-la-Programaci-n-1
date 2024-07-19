
package Clases_Objetos_Métodos_Cadenas;

import java.util.Scanner;

public class PruebaFecha {
    public static void main(String[] args) {
        
        Scanner s = new Scanner (System.in);
        Fecha f = new Fecha(1, 01, 2022);
        System.out.printf("%-10s %-10s %-10s", 
                "Mes" , "Dia" , "Anio");
        System.out.println(" ");
        System.out.printf("%-10d %-10d %-10d",
                f.obtenerm(), f.obtenerd(), f.obtenera());
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------- ");
        
        System.out.println("Ingrese un mes en numero: ");
        f.establecerm(s.nextInt());
        System.out.println("Ingrese el dia en numero: ");
        f.establecerd(s.nextInt());
        System.out.println("Ingrese el anio en numero: ");
        f.establecera(s.nextInt());
        
        System.out.println("la fecha es: " + f.fecha());
    }
    
}
