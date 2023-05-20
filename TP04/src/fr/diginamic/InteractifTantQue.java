package fr.diginamic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Créer une classe InteractifTantQue
 * Ecrire un programme qui demande un nombre à l’utilisateur qui doit être obligatoirement
 * compris entre 1 et 10 :
 * - Tant que ce nombre n’est pas compris entre 1 et 10, le programme redemande un
 * nombre à l’utilisateur.
 * - Si le nombre est compris entre 1 et 10, le programme affiche ce nombre et se termine.
 * Instruction pour poser une question à l’utilisateur :
 * Nous allons utiliser la classe java.util.Scanner.
 * Scanner scanner = new Scanner(System.in) ;
 * int nb = scanner.nextInt() ;
 */
public class InteractifTantQue {
    public static void main(String[] args){

        System.out.println("Entrer un nombre ");

        Scanner scanner = new Scanner(System.in) ;
        int nb = scanner.nextInt() ;
        while(nb > 10 || nb < 1){
            System.out.println("Votre nombre doit être compris entre 1 et 10");
            nb = scanner.nextInt() ;
        }

        System.out.println("gagné (´･_･`)");
    }
}
