package  fr.algorithmie;

import java.util.Arrays;

public class affichageInverse {

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