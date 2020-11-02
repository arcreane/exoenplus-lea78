package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        generalMenu();

    }
    public static void generalMenu(){
        System.out.println("Choose your game :");
        System.out.println("0 : Guess a number");
        System.out.println("1 : Palindrome");
        System.out.println("3 : quit");

        try {
            int userInput;

            userInput= scan.nextInt();
            switch (userInput){
                case 0 : GuessANumber.displayMenu();
                case 1 : Palindrome.enterWord();
                case 3 : break;
                default:
                    System.out.println("Commande inconnue");
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("format inconnu");
        }
    }
}
