
package OperadoresLogicos;

public class TernasPitagóricas {
    public static void main(String[] args) {

        int Tamaño = 500;

        System.out.print("El programa prueba e imprime todas las ternas de");
        System.out.printf(" pitagoras para numeros no mayores que %d ", Tamaño);
        System.out.println(" mediante la fuerza bruta.");

        for (int i = 1; i <= Tamaño; i++) {
            for (int j = 1; j <= Tamaño; j++) {
                for (int k = 1; k <= Tamaño; k++) {
                    if (i * i == j * j + k * k) {
                        System.out.printf("%3d\t%3d\t%3d\n", i, j, k);
                    }
                }
            }
        }
    }
    
}
