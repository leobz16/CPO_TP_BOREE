package exo.pkg2;

import java.util.Scanner;

/*
 * BOREE Léo TDC 17/09/2024
 */

public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Déclaration des variables
        int nb; // nombre d'entiers à additionner
        int result; // résultat
        int ind; // indice
        //nb=5;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        nb=sc.nextInt(); // On demande a sc de donner le prochain entier
        result = 0;
        
        // Addition des nb premiers entiers
        ind = 1;
        while (ind <= nb) {
            result = result + ind;
            ind++; // Incrémenter l'indice pour éviter la boucle infinie
        }
        
        // Affichage du résultat
        System.out.println();
        System.out.println("La somme des " + nb + " entiers est: " + result);
       
    }
}