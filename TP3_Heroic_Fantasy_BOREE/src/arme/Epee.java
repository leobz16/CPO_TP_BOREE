/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arme;

public class Epee extends Arme {
    private int finesse;

    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque);
        this.finesse = Math.min(finesse, 100);
    }

    @Override
    public String toString() {
        return super.toString() + ", Finesse: " + finesse;
    }

    public int getFinesse() {
        return finesse;
    }
}