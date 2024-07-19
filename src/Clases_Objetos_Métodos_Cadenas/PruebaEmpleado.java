package Clases_Objetos_Métodos_Cadenas;

import java.util.Scanner;

public class PruebaEmpleado {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("constructor que inicialice las tres variables de instancia");
        
        Empleado em = new Empleado("", "", 0.0);
        
        System.out.printf("%-20s %-20s %-20s", 
                "Nombre" , "Apellido" , "salario Anual");
        System.out.println(" ");
        System.out.printf("%-20s %-20s %-20.2f",
                em.obtenern(), em.obtenera(), em.obteners());
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------- ");
        
        System.out.println("Nombre?: ");
        em.establecern(s.nextLine());
        System.out.println("Apellido?:");
        em.establecera(s.nextLine());
        System.out.println("salario mensual?");
        double salario = s.nextDouble();
        em.establecers(salario);
        System.out.printf("%-20s %-20s %-20s %-20s", "Nombre" , "Apellido" , "salario Anual" , "Aumento");
        System.out.println(" ");
        System.out.printf("%-20s %-20s %-20.2f %-20.2f", 
                em.obtenern(), em.obtenera(), em.obteners(), em.aumento(salario));
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------- ");
        System.out.println(" ");
        System.out.println("Nombre?: ");
        em.establecern(s.nextLine());
        em.establecern(s.nextLine());
        System.out.println("Apellido?:");
        em.establecera(s.nextLine());
        System.out.println("salario mensual?");
        salario = s.nextDouble();
        em.establecers(salario);
        System.out.printf("%-20s %-20s %-20s %-20s", "Nombre" , "Apellido" , "salario Anual" , "Aumento");
        System.out.println(" ");
        System.out.printf("%-20s %-20s %-20.2f %-20.2f", 
                em.obtenern(), em.obtenera(), em.obteners(), em.aumento(salario));
    }
}
