package fr.diginamic;

/**
 * • Créer une classe FirstLast6
 * • Dans cette classe, on déclare un tableau d’entiers
 * • On calcule une valeur booléenne qui contrôle le tableau de la sorte :
 * o elle vaut true si le tableau a au moins 1 élément et si le premier élément ou le
 * dernier élément vaut 6.
 * o elle vaut false dans les autres cas
 * • écrire l’algo de valorisation de cette variable avec le minimum de ligne
 */
public class FirstLast6 {

    public static void main(String[] args){
        int[] tabNum = {6,6,3,5,2,3};
        boolean result = tabNum[0] == 6 || tabNum[tabNum.length -1] == 6;

        System.out.println(result);
    }

}
