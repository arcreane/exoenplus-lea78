package com.company;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static Scanner scan = new Scanner(System.in);

    // créer un nombre compris entre 0 et 100
    public static int randomNumber(int min, int max) {
       /* Random rand = new Random();
        int number = rand.nextInt(100);*/
        int number = (int) (Math.random() * ((max - min) + 1));
        return number;
    }

    // choix du type de réponse par l'utilisateur
    public static void displayMenu() {
        System.out.println("Please choose your game template: ");
        System.out.println("  0 : 10 tries to guess the number.");
        System.out.println("  1 : play till you fine the number.");

        int userChoice = scan.nextInt();

        // evite tout autre choix que 0 et 1
        switch (userChoice) {
            case 0:
                // appelle fonction triesLimited
                GuessANumber.triesLimited();
            case 1:
                // appelle fonction triesUnlimited
                GuessANumber.triesUnlimited();
            default:
                System.out.println("Choice unknown");
                displayMenu();
        }
    }

    public static void triesLimited() {
        int tries = 0;
        int nombre = randomNumber(0, 100);
        System.out.println("Guess the mysterious number");


        while (tries <= 10) {
            int userTry = scan.nextInt();
            if (userTry == nombre) {
                System.out.println("You guessed right, it was : " + nombre);
                break;
            } else if (userTry < nombre) {
                System.out.println("It's bigger ! ");
            } else if (userTry > 100) {
                System.out.println("not in the range");
            } else {
                System.out.println("It's smaller !");
            }
            tries++;
        }
        System.out.println("You failed! ");
        displayMenu();

    }


    public static void triesUnlimited() {
        int nombre = randomNumber(0, 100);

        for( int tries=0; tries!=nombre; tries++ ) {
            int userTry = scan.nextInt();
            if (userTry == nombre){
                System.out.println("you guesse right !");
                displayMenu();
            }else if( userTry < nombre){
                System.out.println("It's bigger!");
            }else if(userTry > nombre){
                System.out.println("It's smaller ! ");
            }
        }

}





}
