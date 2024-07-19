package InstruccionesdeControl;

import java.util.Scanner;

public class SalarioTrabajador {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ht;
        float ph, salario;

        for (int i = 0; i < 3; i++) {
            System.out.println("Dame las horas trabajadas del trabajador " + (i + 1));
            ht = s.nextInt();
            System.out.println("Ingrese el pago por hora: ");
            ph = s.nextFloat();

            if (ht <= 40) {
                salario = ht * ph;
                System.out.println("El salario bruto es: " + salario);
            } else if (ht > 40) {
                salario = ht * ph + (ht - 40) * (ph/2);
                System.out.println("El salario bruto es: " + salario);
            } else {

            }
        }

    }
}