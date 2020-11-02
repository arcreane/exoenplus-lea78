package com.company;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber<allTries> {
    public static Scanner scan = new Scanner(System.in);

    // créer un nombre compris entre 0 et 100
    public static void randomNumber() {
        Random rand = new Random();
        int upperbound = 101;
        int number = rand.nextInt(upperbound);

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
        }
    }

    public static void triesLimited() {
        int tries = 10;
        randomNumber();


        while (tries <= 10 ) {


        }
    }


    public static void triesUnlimited() {

    }





}
