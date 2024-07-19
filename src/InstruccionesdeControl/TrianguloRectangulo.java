package InstruccionesdeControl;

import java.util.Scanner;

public class TrianguloRectangulo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int lado1, lado2, lado3;
        System.out.println("Ingrese el lado 1");
        lado1 = s.nextInt();
        System.out.println("Ingrese el lado 2");
        lado2 = s.nextInt();
        System.out.println("Ingrese el lado 3");
        lado3 = s.nextInt();

        if (lado1 != 0) {
            if (lado1 != lado2) {
                if (lado1 != lado3) {
                    if (lado2 != 0) {
                        if (lado2 != lado1) {
                            if (lado2 != lado3) {
                                if (lado3 != 0) {
                                    if (lado3 != lado1) {
                                        if (lado3 != lado2) {
                                            System.out.println("representa los lados de un triangulo");
                                        }else{
                                            System.out.println("No puede ser los lados de un triangulo rectangulo");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("No puede ser los lados de un triangulo rectangulo");
        }

    }

}
