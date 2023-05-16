package fr.boucles;

public class ExerciceBoucleBase {

    public static void main(String[] args){

        for (int i = 0; i <= 10 ; i++) {
            System.out.println(i);
        }
        // afficher nom
        for (int i = 0; i <= 20 ; i++) {
            String nom = "kone", prenom = "mamoudou";
            System.out.println(nom + " " + prenom);
        }

        for (int i = 0; i <= 100 ; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        for (int i = 0; i < 100 ; i++) {
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
