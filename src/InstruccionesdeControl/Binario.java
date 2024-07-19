package InstruccionesdeControl;

import java.util.Scanner;

public class Binario {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int Num, res;
        int maxDivisor = 1073741824; //Máximo factor divisorio entero
        int maxEntero = 2147483647; //Máximo numero entero que se puede ingresar

        System.out.print("Ingrese un numero (no mayor a 2,147,483,647: ");
        Num = s.nextInt();
        System.out.println("El equivalente binario de " + Num + " es: ");
        while (maxDivisor > 0) {
            res = Num / maxDivisor;
            System.out.print(res);
            Num = Num % maxDivisor;
            maxDivisor = maxDivisor / 2;
        }
        System.out.println("\n-Fin del Programa-");
    }
}
