/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_boree;

/**
 *
 * @author leoboree
 */
public class TP2_convertisseurObjet_BOREE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Convertisseur Convertisseur1 = new Convertisseur();
        
        Convertisseur1.CelciusVersKelvin(1);
        Convertisseur1.KelvinVersCelcius(1);
        Convertisseur1.FarenheitVersCelcius(1);
        Convertisseur1.CelciusVersFarenheit(1);
        Convertisseur1.KelvinVersFarenheit(1);
        Convertisseur1.FarenheitVersKelvin(1);
        System.out.println(Convertisseur1);


        

    }
    
}
