/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_boree;
import Personnages.Magicien;
import Personnages.Guerrier;
import Arme.Epee;
import Arme.Baton;
import Arme.Arme;
import Personnages;

import java.util.ArrayList;

public class TP3_Heroic_Fantasy_BOREE {

    public static void main(String[] args) {
        // Création de 2 épées
        Epee epee1 = new Epee("Excalibur", 7, 5);
        Epee epee2 = new Epee("Durandal", 4, 7);

        // Création de 2 bâtons
        Baton baton1 = new Baton("Chêne", 4, 5);
        Baton baton2 = new Baton("Charme", 5, 6);

        // Création d'un ArrayList pour stocker les armes
        ArrayList<Arme> armes = new ArrayList<>();
        armes.add(epee1);
        armes.add(epee2);
        armes.add(baton1);
        armes.add(baton2);

        // Affichage des caractéristiques des armes
        System.out.println("Armes :");
        for (Arme arme : armes) {
            System.out.println(arme);  // Affiche les détails de l'arme
        }

        // Création de personnages
        Magicien magicien = new Magicien("Gandalf", 65, true);
        Magicien magicien2 = new Magicien("Garcimore", 44, false);

        Guerrier guerrier = new Guerrier("Conan", 78, false);
        Guerrier guerrier2 = new Guerrier("Lannister", 45, true);


        // Affichage des personnages
        System.out.println("\nPersonnages :");
        System.out.println(magicien);  // Affiche les détails du magicien
        System.out.println(guerrier);  // Affiche les détails du guerrier
    }
}