package InstruccionesdeControl;

public class Damas {

    public static void main(String[] args) {
        int fila = 1;
        int columna = 1;
        int cantidad = 9;

        while (fila < cantidad) {
            columna = 1;

            if (fila % 2 != 0) {
                while (columna < cantidad) {
                    System.out.print("* ");
                    columna++;
                }
                System.out.println();
            } else {
                System.out.print(" ");
                while (columna < cantidad) {
                    System.out.print("* ");
                    columna++;
                }
                System.out.println();
            }

            fila++;

        }
    }

}
