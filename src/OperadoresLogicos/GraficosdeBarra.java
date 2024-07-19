
package OperadoresLogicos;

import java.util.Scanner;

public class GraficosdeBarra {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       int nums[], n;
       nums=new int[5];

        System.out.println("Bienvenido Usuario, digite 5 numero para imprimir un numero de *");

       for(int i=0; i<5; i++){
           System.out.println("\"Digite un numero (rango 1 a 30: ");
           nums[i]= s.nextInt();
           if(nums[i]<0 || nums[i]>30){
               System.out.println("Error. \nNumero fuera de rango \nPor favor vuelva a digitar los numeros");
               break;
           }           
       }
       for(int i=0; i<nums.length; i++){
           System.out.println("Numero "+nums[i]+": ");
           for(int j=1; j<=nums[i]; j++){
               System.out.print("*");
           }  
           System.out.println();
       }
    }
    
}
