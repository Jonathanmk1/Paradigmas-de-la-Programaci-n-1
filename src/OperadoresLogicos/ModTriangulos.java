package OperadoresLogicos;

public class ModTriangulos {

    public static void main(String[] args) {

        int i, m, l, k, n, p, q, r;

        for (i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (k = i + 1; k <= 10; k++) {
                System.out.print(" ");
            }

            System.out.print(" ");
            System.out.print(" ");

            for (l = 1; l <= 10 + 1 - i; l++) {
                System.out.print("*");
            }

            for (m = 10 - 1 - i; m <= 10; m++) {
                System.out.print(" ");
            }

            System.out.print(" ");
            System.out.print(" ");

            for (n = 1; n < i; n++) {
                System.out.print(" ");
            }

            for (p = i; p <= 10; p++) {
                System.out.print("*");
            }

            System.out.print(" ");
            System.out.print(" ");

            for (q = 1; q <= 10 - i; q++) {
                System.out.print(" ");
            }

            for (r = 10 - i; r < 10; r++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("\n");

    }

}
