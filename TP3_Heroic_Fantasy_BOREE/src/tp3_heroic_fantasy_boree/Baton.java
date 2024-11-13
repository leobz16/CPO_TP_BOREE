/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_boree;

/**
 *
 * @author leoboree
 */
public class Baton extends Arme {
    private int age;  // Âge spécifique au bâton

    // Constructeur pour initialiser le bâton
    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);  // Appel du constructeur de la classe parente (Arme)
        this.age = age;
    }

    // Méthode pour obtenir l'âge du bâton
    public int getAge() {
        return age;
    }

    // Redéfinir la méthode toString pour afficher aussi l'âge du bâton
    @Override
    public String toString() {
        return super.toString() + ", Âge du bâton: " + age;
    }
}
