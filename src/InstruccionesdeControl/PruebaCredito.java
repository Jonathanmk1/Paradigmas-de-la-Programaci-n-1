package InstruccionesdeControl;

import java.util.Scanner;

public class PruebaCredito {

    //valor paga
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int credito, numc, n;
        float saldo;
        double saldoi, depositos = 0,cargos,limite, acepta,otorga;
        String resp;

        do {
            System.out.println("Digite el credito otorgado: "
                    + "\n100% = $50,000%" + "\n50% = $25,000" + "\n15% = $12,500" + "\n10% = $5,000 ");
            credito = s.nextInt();

        } while (!(credito >= 10 && credito <= 100));
        switch (credito) {
            case 100:
               
                saldo = (float)50000.00;
                System.out.println("Introduzca su numero de cuenta, -1 para terminar: ");
                numc = s.nextInt();
                while (-1 != numc) {
                    {
                        System.out.println("Introduzca el saldo inicial: ");
                        saldoi = s.nextDouble();
                        System.out.println("Realizo depositos?: ");
                        resp = s.nextLine();
                        resp = s.nextLine();
                        if (resp.equalsIgnoreCase("si")) {
                            System.out.println("Ingrese el numero de depositos hechos:");
                            n = s.nextInt();
                            double vect[] = new double[n];
                            for (int i = 0; i < vect.length; i++) {
                                System.out.println("Ingrese la " + (i + 1) + " cantidad depositada:");
                                vect[i] = s.nextDouble();
                                depositos += vect[i];
                            }
                            System.out.println(" ");
                        }

                        System.out.println("Introduca el total de cargos hechos por el cliente: ");
                        cargos = s.nextDouble();
                        acepta = saldoi + depositos - cargos;
                        System.out.println("Introduzca el limite de credito para el cliente: ");
                        limite = s.nextDouble();

                        if (acepta > 0 && acepta <= limite) {
                            System.out.println("Felicidades, puede gozar de su credito");
                            otorga = acepta + saldo;
                            System.out.println("Saldo acumulado + el credito: " + otorga);
                        } else {
                            System.out.println("no se le puede otrogar un credito");
                            System.out.println("su saldo es de: " + acepta);
                        }
                    }
                    System.out.println("Introduzca su numero de cuenta, -1 para terminar: ");
                    numc = s.nextInt();
                }

                break;

            case 50:
                saldo = (float) 25000.00;
                System.out.println("Introduzca su numero de cuenta, -1 para terminar: ");
                numc = s.nextInt();
                while (-1 != numc) {
                    {
                        System.out.println("Introduzca el saldo inicial: ");
                        saldoi = s.nextDouble();
                        System.out.println("Realizo depositos?: ");
                        resp = s.nextLine();
                        resp = s.nextLine();
                        if (resp.equalsIgnoreCase("si")) {
                            System.out.println("Ingrese el numero de depositos hechos:");
                            n = s.nextInt();
                            double vect[] = new double[n];
                            for (int i = 0; i < vect.length; i++) {
                                System.out.println("Ingrese la " + (i + 1) + " cantidad depositada:");
                                vect[i] = s.nextDouble();
                                depositos += vect[i];
                            }
                            System.out.println(" ");
                        }

                        System.out.println("Introduca el total de cargos hechos por el cliente: ");
                        cargos = s.nextDouble();
                        acepta = saldoi + depositos - cargos;
                        System.out.println("Introduzca el limite de credito para el cliente: ");
                        limite = s.nextDouble();

                        if (acepta > 0 && acepta <= limite) {
                            System.out.println("Felicidades, puede gozar de su credito");
                            otorga = acepta + saldo;
                            System.out.println("Saldo acumulado + el credito: " + otorga);
                        } else {
                            System.out.println("no se le puede otrogar un credito");
                            System.out.println("su saldo es de: " + acepta);
                        }
                    }
                    System.out.println("Introduzca su numero de cuenta, -1 para terminar: ");
                    numc = s.nextInt();
                }
                break;
            case 15:
                saldo = (float) 12500.00;
                 System.out.println("Introduzca su numero de cuenta, -1 para terminar: ");
                numc = s.nextInt();
                while (-1 != numc) {
                    {
                        System.out.println("Introduzca el saldo inicial: ");
                        saldoi = s.nextDouble();
                        System.out.println("Realizo depositos?: ");
                        resp = s.nextLine();
                        resp = s.nextLine();
                        if (resp.equalsIgnoreCase("si")) {
                            System.out.println("Ingrese el numero de depositos hechos:");
                            n = s.nextInt();
                            double vect[] = new double[n];
                            for (int i = 0; i < vect.length; i++) {
                                System.out.println("Ingrese la " + (i + 1) + " cantidad depositada:");
                                vect[i] = s.nextDouble();
                                depositos += vect[i];
                            }
                            System.out.println(" ");
                        }

                        System.out.println("Introduca el total de cargos hechos por el cliente: ");
                        cargos = s.nextDouble();
                        acepta = saldoi + depositos - cargos;
                        System.out.println("Introduzca el limite de credito para el cliente: ");
                        limite = s.nextDouble();

                        if (acepta > 0 && acepta <= limite) {
                            System.out.println("Felicidades, puede gozar de su credito");
                            otorga = acepta + saldo;
                            System.out.println("Saldo acumulado + el credito: " + otorga);
                        } else {
                            System.out.println("no se le puede otrogar un credito");
                            System.out.println("su saldo es de: " + acepta);
                        }
                    }
                    System.out.println("Introduzca su numero de cuenta, -1 para terminar: ");
                    numc = s.nextInt();
                }
                break;
            case 10:
                saldo = (float) 5000.00;
                 System.out.println("Introduzca su numero de cuenta, -1 para terminar: ");
                numc = s.nextInt();
                while (-1 != numc) {
                    {
                        System.out.println("Introduzca el saldo inicial: ");
                        saldoi = s.nextDouble();
                        System.out.println("Realizo depositos?: ");
                        resp = s.nextLine();
                        resp = s.nextLine();
                        if (resp.equalsIgnoreCase("si")) {
                            System.out.println("Ingrese el numero de depositos hechos:");
                            n = s.nextInt();
                            double vect[] = new double[n];
                            for (int i = 0; i < vect.length; i++) {
                                System.out.println("Ingrese la " + (i + 1) + " cantidad depositada:");
                                vect[i] = s.nextDouble();
                                depositos += vect[i];
                            }
                            System.out.println(" ");
                        }

                        System.out.println("Introduca el total de cargos hechos por el cliente: ");
                        cargos = s.nextDouble();
                        acepta = saldoi + depositos - cargos;
                        System.out.println("Introduzca el limite de credito para el cliente: ");
                        limite = s.nextDouble();
                        System.out.println(" ");
                        if (acepta > 0 && acepta <= limite) {
                            System.out.println("Felicidades, puede gozar de su credito");
                            otorga = acepta + saldo;
                            System.out.println(" ");
                            System.out.println("Saldo acumulado + el credito: " + otorga);
                        } else {
                            System.out.println("no se le puede otrogar un credito");
                            System.out.println(" ");
                            System.out.println("su saldo es de: " + acepta);
                        }
                    }
                    System.out.println("\nIntroduzca su numero de cuenta, -1 para terminar: ");
                    numc = s.nextInt();
                } 
                break;
            default:
                break;
        }
    }
}
