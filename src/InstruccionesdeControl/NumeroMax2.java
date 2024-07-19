package InstruccionesdeControl;

import java.util.Scanner;

public class NumeroMax2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero, contador = 0, mayor = 0, mayor2 = 0;

        while (contador < 5) {
            System.out.println("Ingrese un numero(Solo valores enteros): ");
            numero = s.nextInt();
            contador++;
            if (numero > mayor) {
                mayor = numero;
            } else if(mayor2 < mayor && mayor2 > numero){
                mayor2 = numero;
            }
        }
        //contador ++;
        System.out.println("\nEl valor maximo es: " + mayor);
        System.out.println("El segundo valor maximo es: " + mayor2);
    }
}
