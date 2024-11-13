/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_boree;

/**
 *
 * @author leoboree
 */
public class TP3_Heroic_Fantasy_BOREE {


    public static void main(String[] args) {
        // Création de 2 épées
        Epee epee1 = new Epee("Excalibur", 7, 5);
        Epee epee2 = new Epee("Durandal", 4, 7);

        // Création de 2 bâtons
        Baton baton1 = new Baton("Chêne", 4, 5);
        Baton baton2 = new Baton("Charme", 5, 6);

        // Affichage des objets
        System.out.println(epee1);  // Affiche les détails de l'épée 1
        System.out.println(epee2);  // Affiche les détails de l'épée 2
        System.out.println(baton1); // Affiche les détails du bâton 1
        System.out.println(baton2); // Affiche les détails du bâton 2
    }
}