package fr.diginamic;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args){

        System.out.println("Entrer un nombre ");

        Scanner scanner = new Scanner(System.in) ;
        int nb = scanner.nextInt() ;
        while(nb > 10 || nb < 1){
            System.out.println("Votre nombre doit être compris entre 1 et 10");
            nb = scanner.nextInt() ;
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " * " + nb + "=" + nb * i);

        }
    }
}
