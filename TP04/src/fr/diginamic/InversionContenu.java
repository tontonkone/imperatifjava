package fr.diginamic;

import java.util.Arrays;

/**
 * • Créer une classe InversionContenu
 * • Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
 * • Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy mais
 * dans l’ordre inverse.
 * • Afficher l’ensemble des éléments des 2 tableaux
 */
public class InversionContenu {

    public static void main(String[] args){

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        int[] arrayCopy = new int[array.length  ];

        int lastArray = array.length - 1;
        for (int i = lastArray ; i > - 1; i--) {
            arrayCopy[lastArray - i] = array[i];
            System.out.println(array[i]);
        }
        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(arrayCopy));
    }
}
