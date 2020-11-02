package com.company;

import java.util.Scanner;

public class Palindrome {
    static Scanner scan = new Scanner(System.in);


    public static void enterWord(){
        System.out.println("Enter a word : ");
        String text = scan.nextLine();
        if(isPalindrome(text)){
            System.out.println("En effet ce mot est bien un palindrome.");
        }else
            System.out.println("Ceci n'est pas un palindrome.");



    }
    public static boolean isPalindrome(String text){
            //récupère le text user : enlève les espacements et met tout en minuscule.
        String clean = text.replaceAll("//+s","").toLowerCase();
            //créer une variable qui contient la longueur du texte propre
        int lenghtText = clean.length();
        int forward = 0;
        int backword = lenghtText - 1;

        /* char = caractère a un emplacement mémoire
         *charAt = selectionne un charactère d'une chaine de string
         *Ici créer une boucle qui tourne tant qu'il reste un caractère a comparer
         * créer une variable forwardChar qui avance d'un caractère après un caractère depuis debut chaîne
         * créer une variable backwardChar qui recule a partir du dernier caractère de la chaine de string
         * if : si les deux caractères de la chaîne sont différent => false, ce n'est pas un palindrome
        */
        while (backword > forward){
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backword--);
            if(forwardChar != backwardChar)

                return false;
        }
        return true;

    }
}
