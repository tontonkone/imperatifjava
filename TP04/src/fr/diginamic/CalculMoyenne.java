package fr.diginamic;

import java.util.Arrays;

/**
 * • Créer une classe CalculMoyenne
 * • Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
 * • Quelle est la moyenne des éléments du tableau ?
 */
public class CalculMoyenne {
    public static void main(String[] args){

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int somme = 0;

        for (int i = 0; i < array.length; i++) {

            somme += array[i];
        }

        System.out.println((float) somme / array.length);
    }
}
