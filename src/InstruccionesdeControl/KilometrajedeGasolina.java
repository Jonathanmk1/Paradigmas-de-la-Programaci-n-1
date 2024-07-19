package InstruccionesdeControl;

import java.util.Scanner;

public class KilometrajedeGasolina {

    public void calcularKilometroLitro() {
        Scanner s = new Scanner(System.in);
        int tk=0, tg=0, ck, cg, recorrido=0;
        int contador = 0;
        float promedio;

        System.out.println("Introduzca los kilometros conducidos (-1 para salir): ");
        ck = s.nextInt();

        while (ck != -1) {
            System.out.println("Introduzca la cantidad de gasolina utilizada: ");
            cg = s.nextInt();
            recorrido = ck / cg;
            System.out.printf("\nLa cantidad de kilometros por litro dados por este reabastecimiento es: %.2f Km/Lt.\n\n",
                    (float)recorrido);

            tk += ck;
            tg+= cg;
            contador++;

            System.out.println("Introduzca la cantidad de kilometros conducidos (-1 para cancelar): ");
            ck = s.nextInt();
        } 

        if (contador != 0) {
            promedio = tk / tg;

            System.out.printf("\nse pasaron a %d reabastecimientos, obteniendo un promedio de %.2f Kilometros/Litro.\n",
                    contador, promedio);
        } else {
            System.out.println("No se introdujeron registros.");
        }

    } 


    public static void main(String[] args) {
        KilometrajedeGasolina k = new KilometrajedeGasolina();
        k.calcularKilometroLitro();
    }
}
