package InstruccionesdeControl;

import java.util.Scanner;

public class NumeroMayor {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero, contador=0, mayor =0;

        while(contador < 10){
            System.out.println("Ingrese un numero (Solo valores enteros): ");
            numero = s.nextInt();
            contador++;
            if (numero > mayor) {
                mayor = numero;
            }else{
               
            } 
        }
        //contador ++;
        System.out.println("\nEl valor maximo es: " + mayor);
    }

}
