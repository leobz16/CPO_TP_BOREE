/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_boree;

import java.util.Scanner;

/**TP1 BOREE Léo 23/09/2024

 *
 * @author leoboree
 */
public class TP1_convertisseur_BOREE {
    public static double CelciusVersKelvin (double tCelcius) {
        tCelcius = tCelcius + 273;  
        return tCelcius;
    }
    public static double  KelvinVersCelcius(double tKelvin) {
        tKelvin = tKelvin - 273;  
        return tKelvin;
    }
    public static double  FarenheitVersCelcius(double tFarenheit ) {
        tFarenheit = (tFarenheit - 32) * 0.55 ;  
        return tFarenheit;   
    }    
    public static double  CelciusVersFarenheit(double celcius) {
        celcius = (celcius * 0.55 ) + 32 ;  
        return celcius;    
    }
    public static double   KelvinVersFarenheit(double kelvin) {
        double celcius = KelvinVersCelcius ( kelvin);
        double farenheit = CelciusVersFarenheit(celcius);
        return farenheit;
            
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
            double nbre1;
            double kelvin;
            System.out.println("Saisissez une température ! "); 
            nbre1=sc.nextDouble();
            System.out.println("La température en celsius est de "+nbre1);
            kelvin = nbre1+273;
            System.out.println("La température en kelvin est de "+kelvin);

    }
    
}
