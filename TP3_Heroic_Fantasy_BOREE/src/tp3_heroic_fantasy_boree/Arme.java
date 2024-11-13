/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_boree;

/**
 *
 * @author leoboree
 */
public abstract class Arme {
    private String nom;
    private int niveauAttaque;

    // Constructeur pour initialiser le nom et le niveau d'attaque
    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        this.niveauAttaque = niveauAttaque;
    }

    // Méthode pour obtenir le niveau d'attaque
    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    // Méthode pour obtenir le nom de l'arme
    public String getNom() {
        return nom;
    }

    // Méthode toString pour afficher le nom et le niveau d'attaque
    @Override
    public String toString() {
        return "Nom de l'arme: " + nom + ", Niveau d'attaque: " + niveauAttaque;
    }
}