/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arme;

public class Baton extends Arme {
    private int age;

    // Constructeur
    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);
        this.age = age;
    }

    // Getter pour age
    public int getAge() {
        return age;
    }

    // Redéfinition de toString pour afficher les détails du bâton
    @Override
    public String toString() {
        return super.toString() + ", Âge: " + age;
    }
}