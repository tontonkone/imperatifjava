package fr.algorithmie;

import java.util.Arrays;

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
