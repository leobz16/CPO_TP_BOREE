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
        // Création d'une arme de type Epee
        Arme epee1 = new Epee("Excalibur", 90);
        System.out.println(epee1);
        Arme epee2 = new Epee("Durandal", 80);
        System.out.println(epee2);

        // Création d'une arme de type Baton
        Arme baton1 = new Baton("Chêne", 30);
        System.out.println(baton1);
        Arme baton2 = new Baton("Charme", 20);
        System.out.println(baton2);

    }
}
