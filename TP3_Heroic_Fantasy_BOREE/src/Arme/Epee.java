/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arme;

public class Epee extends Arme {
    private int finesse;

    // Constructeur
    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque);
        this.finesse = finesse;
    }

    // Getter pour finesse
    public int getFinesse() {
        return finesse;
    }

    // Redéfinition de toString pour afficher les détails de l'épée
    @Override
    public String toString() {
        return super.toString() + ", Finesse: " + finesse;
    }
}