package InstruccionesdeControl;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // utilizo un objeto escaner para obtener datos del usuario

        int numero = 0;; // esta variable almacena el numero ingresado
        int auxiliar = 0; // esta variable almacena el numero ingresado y modifica su valor para calcular la cantidad de digitos
        int cifras = 0; //esta variable es el contador de cifras
        int digitos = 0; // esta variable almacena la cantidad de digitos del numero

        while (digitos != 5) // este algoritmo cicla hasta que la cantidad de digitos sea 5
        {
            System.out.println("Ingrese un numero de 5 digitos (no es valido un numero de mas o menos digitos): "); // pide ingreso de usuario
            numero = entrada.nextInt(); // ingreso el numero (cuando excedo el numero de 10 digitos, lanza un error)
            auxiliar = numero; // comparto el numero con la variable "auxiliar"

// algoritmo para saber la cantidad de digitos
            while (auxiliar != 0) // mientras a "auxliar" le queden cifras
            {
                auxiliar = auxiliar / 10; // le quitamos el último dígito
                cifras++; //sumamos 1 al contador de cifras
                digitos = cifras; // comparto el numero de digitos con la variable "digito" para evaluar la condicion inicial de while
            }

            cifras = 0; // reinicio la variable cifras por si no se ha ingresado un numero de 5 digitos, y debe ejecutarse el segundo while
        }

        if (digitos == 5) // si el numero tiene 5 digitos
        { //Divisiones sin tener en cuenta los decimales, sino tomando los enteros del cociente

            int digito1 = numero / 10000;
            int digito2 = (numero % 10000) / 1000;
            int digito3 = (numero % 1000) / 100;
            int digito4 = (numero % 100) / 10;
            int digito5 = (numero % 10) / 1;

            if (digito1 == digito5 && digito2 == digito4) {
                System.out.println("El numero " + numero + " es un numero Palindromo");
            } else {
                System.out.println("El numero " + numero + " no es un numero Palindromo");
            }
        }
    }
}
