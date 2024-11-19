/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author leoboree
 */
public class Guerrier extends Personnage {
    private boolean estAcheval;

    // Constructeur
    public Guerrier(String nom, int niveauVie, boolean estAcheval) {
        super(nom, niveauVie);
        this.estAcheval = estAcheval;
    }

    // Getter pour estAcheval
    public boolean isEstAcheval() {
        return estAcheval;
    }

    // Setter pour estAcheval
    public void setEstAcheval(boolean estAcheval) {
        this.estAcheval = estAcheval;
    }

    // Redéfinition de toString pour afficher les détails du guerrier
    @Override
    public String toString() {
        return super.toString() + ", À cheval: " + estAcheval;
    }
}
