package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        boolean keepPlaying = true;

        while (true) {
            System.out.println("Choose your game :");
            System.out.println("0 : Guess a number");
            System.out.println("1 : Palindrome");
            System.out.println("2 : Tableau affichage");
            System.out.println("3: démineur");
            System.out.println("4: Quit");

            try {
                int userInput;

                userInput = scan.nextInt();
                switch (userInput) {
                    case 0:
                        GuessANumber.displayMenu();
                    case 1:
                        Palindrome.enterWord();
                    case 2:
                        Tableau.debut();
                    case 3:
                        Demineur.beguining();
                    case 4:
                        keepPlaying = false;
                    default:
                        System.out.println("Commande inconnue");
                }

            } catch (Exception e) {
                System.out.println("format inconnu");
            }
        }
    }
}
