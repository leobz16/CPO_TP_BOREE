/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arme;

public abstract class Arme {
    private String nom;
    private int niveauAttaque;

    // Constructeur
    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        this.niveauAttaque = niveauAttaque;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    // Méthode toString pour afficher les caractéristiques de l'arme
    @Override
    public String toString() {
        return "Nom: " + nom + ", Niveau d'attaque: " + niveauAttaque;
    }
}