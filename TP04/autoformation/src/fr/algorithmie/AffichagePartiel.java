package fr.algorithmie;

public class AffichagePartiel {

    public static void main(String[] args){

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

            if(array[i] > 3)
                System.out.println("sup a 3 " + array[i]);
        }

        for (int i = 0; i < array.length ; i++) {
            if(i % 2 == 0 ){

                System.out.println("paires :" + array[i]);
            }
        }

        for (int i = 0; i < array.length ; i++) {
            if(i % 2 == 0 ){

                System.out.println("index :" + i);
            }
        }

        for (int i = 0; i < array.length ; i++) {
            if(array[i] % 2 != 0 ){

                System.out.println("impaire:" + array[i]);
            }
        }

    }
}
