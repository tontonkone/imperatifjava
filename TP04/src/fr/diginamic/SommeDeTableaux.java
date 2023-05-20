package fr.diginamic;

import java.util.Arrays;

/**
 * • Créer une classe SommeDeTableaux
 * • {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
 * • {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;
 * • Créer un tableau qui contient la somme des 2 précédents tableaux
 */
public class SommeDeTableaux {

    public  static void main(String[] args){

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array1 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;
        int result = 0 ,result1 = 0 ;
        int[] tab = new int[2];

        for (int i = 0; i < array.length; i++) {
            result += array[i];
            result1 += array1[i];
        }
        tab[0] = result;
        tab[1] = result1;
        System.out.println(Arrays.toString(tab));
    }
}
