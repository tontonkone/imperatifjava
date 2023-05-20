package fr.diginamic;

import java.util.Arrays;

/**
 * • Créer une classe Rotation
 * • Dans cette classe, on déclare un tableau d’entiers
 * • Effectuez une rotation à droite des éléments.
 * • Exemple : si vous avez {0,1,2,3} vous obtenez {3,0,1,2}
 */
public class Rotation {

    public static void main(String[] args){


        int[] array = {1,2,3,4,5,6,7,8,9} ;

        int first = array[0];

        for (int i = 0; i < array.length -1; i++) {
            array[i] = array[i +1];
        }
        array[array.length - 1] = first;
        System.out.println(Arrays.toString(array));

    }
}
