package fr.diginamic;

import java.util.Arrays;

/**
 * • Créer une classe AffichageInverse
 * • Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
 * • Afficher l’ensemble des éléments du tableau grâce à une boucle
 * • Afficher l’ensemble des éléments dans l’ordre inverse du tableau
 * • Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy
 */
public class AffichageInverse {
    public static void main(String[] args){


        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        int[] arrayCopy = new int[array.length + 1 ];

        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
            System.out.println(array[i]);
        }

        for (int i = array.length - 1; i > -1; i--) {

            System.out.println("inverse :" + array[i]);
        }

        System.out.println(Arrays.toString(arrayCopy));

    }
}
