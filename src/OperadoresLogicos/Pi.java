
package OperadoresLogicos;

import java.util.Scanner;

public class Pi {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        System.out.println("cuantos terminos de precision desea?: ");
        int n = datos.nextInt();

        System.out.println("pi es = " + pi(n));
    }
    public static double pi(int n) {
        int d = 1, sig = 1;//sig es para cambiar los signos de positivo a negativo y vicebersa
        double t, s = 0;
        for (int i = 1; i <= n; i++) {
            t = (double) 1 / d * sig;
            s += t;
            d += 2;
            sig *= -1;

        }
        return s * 4;
    }
}
