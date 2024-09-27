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
        tFarenheit = (tFarenheit - 32) * 1.8 ;  
        return tFarenheit;   
    }    
    public static double  CelciusVersFarenheit(double celcius) {
        celcius = (celcius * 1.8 ) + 32 ;  
        return celcius;    
    }
    public static double   KelvinVersFarenheit(double kelvin) {
        double celcius = KelvinVersCelcius ( kelvin);
        double farenheit = CelciusVersFarenheit(celcius);
        return farenheit;
     
    }
    public static double FarenheitVersKelvin (double  Farenheit) {
         double celsius = FarenheitVersCelcius(Farenheit);
         double Kelvin = CelciusVersFarenheit(celsius);
         return Kelvin;

    }     
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
            
        
        double nombre;
        double choix;
        double CeKe;
        double KeCe;
        double FaCe;
        double CeFa;
        double KeFa;
        double FaKe;
       
        System.out.println("Bonjour, saisissez une température :");
        nombre = sc.nextInt();
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :");
        
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius ");
        System.out.println("3) De Farenheit vers Celcius ");
        System.out.println("4) De Celcius vers Farenheit ");
        System.out.println("5) De Kelvin vers Farenheit ");
        System.out.println("6) De Farenheit vers Kelvin");
        
        choix = sc.nextInt();
        CeKe = CelciusVersKelvin (nombre);
        KeCe = KelvinVersCelcius(nombre) ;
        FaCe = FarenheitVersCelcius(nombre);
        CeFa = CelciusVersFarenheit(nombre);
        KeFa = KelvinVersFarenheit(nombre);
        FaKe = FarenheitVersKelvin(nombre);

         if (choix == 1){
            System.out.println(nombre+" degre Celcius est egal a "+CeKe+" deges Kelvin");
         }
         if (choix == 2){
            System.out.println(nombre+" degre Kelvin est egal a "+KeCe+" deges Celcius");
         }
         if (choix == 3){
            System.out.println(nombre+" degre Farenheit est egal a "+FaCe+" deges Celcius");
         }
         if (choix == 4){
             System.out.println(nombre+" degre Celcius est egal a "+CeFa+" deges Farenheit");            
         }
          if (choix == 5){
             System.out.println(nombre+" degre Kelvin est egal a "+KeFa+" deges Farenheit");         
         }
           if (choix == 6){
              System.out.println(nombre+" degre Farenheit est egal a "+FaKe+" deges Kelvin");            
         }
    }

}
