package OperadoresLogicos;

public class What {

    public static void main(String[] args) {

        int i = 1, j = 2, k = 3, m = 2;

        System.out.println(i == 1); //verdadero

        System.out.println(" ");

        System.out.println(j == 3); //falso

        System.out.println(" ");

        System.out.println((i >= 1) && (j < 4)); //verdadero

        System.out.println(" ");

        System.out.println((m <= 99) & (k < m)); //falso

        System.out.println(" ");

        System.out.println((j >= i) || (k == m)); //verdero

        System.out.println(" ");

        System.out.println((k + m < j) | (3 - j >= k)); //falso

        System.out.println(" ");

        System.out.println(!(k > m)); //falso

    }
}
