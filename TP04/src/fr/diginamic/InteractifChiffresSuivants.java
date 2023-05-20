package fr.diginamic;

import java.util.Scanner;

/**
 * Créer une classe InteractifChiffresSuivants
 * Ecrire un programme qui demande un nombre à l’utilisateur puis qui affiche les 10 nombres
 * suivants. Par exemple si l’utilisateur saisit 5, le programme affiche : 6, 7, 8, 9, 10, 11, 12, 13,
 * 14, 15.
 */
public class InteractifChiffresSuivants {
    public static void main(String[] args){

        System.out.println("Entrer un nombre ");

        Scanner scanner = new Scanner(System.in) ;
        int nb = scanner.nextInt() ;
        int somme = 0;
        for (int i = 0; i <= nb; i++) {

            somme += i;
        }
        System.out.println(somme);

    }

}
