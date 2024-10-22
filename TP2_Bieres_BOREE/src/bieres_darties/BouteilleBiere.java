/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bieres_darties;

/**
 *
 * @author leoboree
 */
public class BouteilleBiere {
    String nom ;
    float degreAlcool ;
    String brasserie ;
    boolean ouverte ;    
    public void lireEtiquette() {
    System.out.println("Bouteille de " + nom +" (" + degreAlcool +  " degres) \nBrasserie : " + brasserie ) ;

}
}
