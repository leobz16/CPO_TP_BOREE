/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_boree;

/**
 *
 * @author leoboree
 */
public class Epee extends Arme {
    private int indiceFinesse;  // Indice de finesse spécifique à l'épée

    // Constructeur pour initialiser l'épée
    public Epee(String nom, int niveauAttaque, int indiceFinesse) {
        super(nom, niveauAttaque);  // Appel du constructeur de la classe parente (Arme)
        this.indiceFinesse = indiceFinesse;
    }

    // Méthode pour obtenir l'indice de finesse
    public int getIndiceFinesse() {
        return indiceFinesse;
    }

    // Redéfinir la méthode toString pour afficher aussi l'indice de finesse
    @Override
    public String toString() {
        return super.toString() + ", Indice de finesse: " + indiceFinesse;
    }
}