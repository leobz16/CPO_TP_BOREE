/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_boree;


public class TP2_Bieres_BOREE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BouteilleBiere uneBiere = new BouteilleBiere("Bud", 5.0f, "Anheuser-Busch");
        BouteilleBiere unesecondBiere = new BouteilleBiere("Chouffe", 8.0f, "Achouffe");
        BouteilleBiere troisiemeBiere = new BouteilleBiere("1664", 5.5f, "Kronenbourg");
        BouteilleBiere quatriemeBiere = new BouteilleBiere("86", 8.6f, "Royal Swinkels Family Brewers");
        BouteilleBiere unecinquiemeBiere = new BouteilleBiere("Amsterdam la Maximator", 11.6f, "Saint-Omer");

        uneBiere.lireEtiquette();
        System.out.println();

        unesecondBiere.lireEtiquette();
        System.out.println();

        troisiemeBiere.lireEtiquette();
        System.out.println();

        quatriemeBiere.lireEtiquette();
        System.out.println();

        unecinquiemeBiere.lireEtiquette();

        System.out.println();

        BouteilleBiere unesisiemeBiere = new BouteilleBiere("Snake Venom", 10.0f, "Brewmeister");
        BouteilleBiere uneseptiemeBiere = new BouteilleBiere("Desperados", 10.0f, "Caulier");
        BouteilleBiere unehuitiemebiere = new BouteilleBiere("heineken", 10.0f, "Caulier");

        unesisiemeBiere.Decapsuler();
        uneseptiemeBiere.Decapsuler();

        System.out.println();

        System.out.println(unesisiemeBiere);
        System.out.println(uneseptiemeBiere);
        System.out.println(unehuitiemebiere);

    }

}