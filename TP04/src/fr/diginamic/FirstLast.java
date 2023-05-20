package fr.diginamic;

/**
 * • Créer une classe FirstLast
 * • Dans cette classe, on déclare un tableau d’entiers
 * • On calcule une valeur booléenne qui contrôle le tableau de la sorte :
 * o elle vaut true si le tableau est de longueur supérieure ou égale à 1 et que le
 * premier et le dernier élément du tableau ont la même valeur
 * o elle vaut false dans les autres cas
 * • écrire l’algo de valorisation de cette variable avec le minimum de ligne
 */
public class FirstLast {

    public static void main(String[] args){
        int[] tabNum = {6,6,3,5,2,3,6};
        boolean result = tabNum[0] == tabNum[tabNum.length -1];

        System.out.println(result);
    }
}
