package fr.diginamic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Créer une classe InteractifPlusGrand
 * Ecrire un programme qui demande 10 nombres à un utilisateur et qui affiche le plus grand de
 * ces nombres.
 */
public class InteractifPlusGrand {
    public static void main(String[] args){

        System.out.println("Entrer un nombre ");
        Scanner scanner = new Scanner(System.in) ;

        int[] array = new int[10];
        int nb =0;
        int count = 0;
        while(count != 10){
            nb = scanner.nextInt() ;
            array[count]= nb;
            count++;
        }

        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] > max ) max = array[i] ;
        }
        System.out.println(max);
    }
}
