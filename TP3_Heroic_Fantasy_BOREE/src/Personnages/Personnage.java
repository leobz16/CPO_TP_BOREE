/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author leoboree
 */
public abstract class Personnage {
    private String nom;
    private int niveauVie;

    // Constructeur
    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public int getNiveauVie() {
        return niveauVie;
    }

    // Méthode toString pour afficher les caractéristiques du personnage
    @Override
    public String toString() {
        return "Nom: " + nom + ", Niveau de vie: " + niveauVie;
    }
}
