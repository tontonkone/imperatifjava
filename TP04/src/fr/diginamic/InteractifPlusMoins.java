package fr.diginamic;

import java.util.Random;
import java.util.Scanner;

/**
 * Créer une classe InteractifPlusMoins
 * Ecrire un jeu qui :
 * - choisit un nombre aléatoire entre 1 et 100
 * - puis demande à l’utilisateur de trouver ce nombre en lui indiquant s’il est au-dessus ou
 * en dessous du nombre,
 * - Lorsque l’utilisateur a trouvé le nombre, le programme affiche « Bravo, vous avez
 * trouvé en N coups » où N représente le nombre d’essais effecté par l’utilisateur
 * - le programme se termine.
 */
public class InteractifPlusMoins {

    public static void main(String[] args){

        Random rand = new Random();
        int nombreAleatoire = rand.nextInt(100 - 1 + 1) + 1;
        System.out.println(nombreAleatoire);
        System.out.println("Entrer un nombre ");
        Scanner scanner = new Scanner(System.in) ;

        while (true){
            int nb = scanner.nextInt() ;

            if (nb == nombreAleatoire){
                System.out.println(" vous avez gagné");

                return;
            } else if (nb < nombreAleatoire) {
                System.out.println(" vous est au dessous du nombre");
            }else {
                System.out.println(" vous est au dessus du nombre");

            }


        }


    }
}
