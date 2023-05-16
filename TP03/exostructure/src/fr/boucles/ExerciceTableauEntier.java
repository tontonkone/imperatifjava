package fr.boucles;

public class ExerciceTableauEntier {

    public static  void main(String[] args){

        int[] tab = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(" Affichez le premier élément du tableau : " + tab[0]);
        System.out.println("Affichez la longueur du tableau en utilisant la propriété length :" + tab.length);
        System.out.println(" Affichez le dernier élément du tableau en utilisant la propriété length :" + tab[tab.length - 1]);
        tab[4] = 8;
        System.out.println(tab[4]);
    }
}
