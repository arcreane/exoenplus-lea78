package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Tableau {
    public static Scanner scanArray = new Scanner(System.in);

    public static void debut() {
        int rangeNumber = 10;

        System.out.println("Entrer votre 1er tableau :");
        int[] array1 = enterTableau(5);

    }

    public static int[] enterTableau(int limite){
        System.out.println("Composons votre tableau:");
        int [] array = new int[limite];
        for (int i = 0; i < limite; i++) {
            System.out.println("Veuillez composer votre chiffre");
            array[i] = scanArray.nextInt();
            /*if(array1[i] == array1[i+1]){
                System.out.println("Please enter 5 distincte number");
                i--;
            }else if (array1[i] > limiteUser){
                System.out.println("Warning your array contains a number greater than" + limiteUser +".");
                i--;
            }*/
        }System.out.print(Arrays.toString(array));

        return array;
    }
    public static void verifiedArray(){

    }


}
