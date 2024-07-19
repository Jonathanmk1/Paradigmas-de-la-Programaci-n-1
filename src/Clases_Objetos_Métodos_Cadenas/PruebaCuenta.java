package Clases_Objetos_Métodos_Cadenas;
// Entrada y salida de números de punto flotante con objetos Cuenta.

import java.util.Scanner;

public class PruebaCuenta {

    public static void main(String[] args) {
        // crea un objeto Scanner para obtener la entrada desde el símbolo del sistema
        //java.util.Scanner s = new java.util.Scanner(System.in);
        // crear dos objetos Cuenta
        Cuenta cuenta1 = new Cuenta("Jane Green", 50.00);
        Cuenta cuenta2 = new Cuenta("John Blue", -7.53);
        // muestra el saldo inicial de cada objeto
        System.out.printf("Saldo de %s: $%.2f%n",
                cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n%n",
                cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());

        // crea un objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el monto a depositar para: " + cuenta1.obtenerNombre()+"\n"); // indicador (promt)
        double montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
        System.out.printf("%nsumando %.2f al saldo de cuenta:%s%n",
                montoDeposito, cuenta1.obtenerNombre());
        cuenta1.depositar(montoDeposito); // suma al saldo de cuenta1

        // muestra los saldos
        System.out.printf("Saldo de %s: $%.2f%n",
                cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n%n",
                cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());

        System.out.print("Escriba el monto a depositar para: " + cuenta2.obtenerNombre() + "\n"); // indicador (promt)
        montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
        System.out.printf("%nsumando %.2f al saldo de la cuenta%s%n",
                montoDeposito, cuenta2.obtenerNombre());
        cuenta2.depositar(montoDeposito); // suma al saldo de cuenta2
        // muestra los saldos
        System.out.printf("Saldo de %s: $%.2f%n",
                cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n%n",
                cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
        
        //retirar dinero
        System.out.print("Escriba el monto a retira de: " + cuenta1.obtenerNombre() + "\n");
        double canret = entrada.nextDouble();
        System.out.printf("%nUsted retiro la cantidad de $%.2f al saldo de la cuenta de: %s%n", 
                canret, cuenta1.obtenerNombre());
        cuenta1.retirar(canret);
        // muestra los saldos
        System.out.printf("Saldo de %s: $%.2f%n",
                cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n%n",
                cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
        
        System.out.print("Escriba el monto a retira de: " + cuenta2.obtenerNombre() + "\n");
        canret = entrada.nextDouble();
        System.out.printf("%nUsted retiro la cantidad de $%.2f al saldo de la cuenta de: %s%n", 
                canret, cuenta2.obtenerNombre());
        cuenta2.retirar(canret);
        // muestra los saldos
        System.out.printf("Saldo de %s: $%.2f%n",
                cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n%n",
                cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
    } // fin de main
} // fin de la clase PruebaCuenta
