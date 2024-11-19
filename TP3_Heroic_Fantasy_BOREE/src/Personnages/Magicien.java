/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author leoboree
 */
public class Magicien extends Personnage {
    private boolean estConfirme;

    // Constructeur
    public Magicien(String nom, int niveauVie, boolean estConfirme) {
        super(nom, niveauVie);
        this.estConfirme = estConfirme;
    }

    // Getter pour estConfirme
    public boolean isEstConfirme() {
        return estConfirme;
    }

    // Setter pour estConfirme
    public void setEstConfirme(boolean estConfirme) {
        this.estConfirme = estConfirme;
    }

    // Redéfinition de toString pour afficher les détails du magicien
    @Override
    public String toString() {
        return super.toString() + ", Confirmé: " + estConfirme;
    }
}